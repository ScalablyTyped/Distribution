package typings.wordpressDom

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesTabbableMod {
  
  @JSImport("@wordpress/dom/build-types/tabbable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def find(context: Element): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(context.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def findNext(element: Element): js.UndefOr[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("findNext")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Element]]
  
  inline def findPrevious(element: Element): js.UndefOr[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("findPrevious")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Element]]
  
  inline def isTabbableIndex(element: Element): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTabbableIndex")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @js.native
  trait MaybeHTMLInputElement
    extends StObject
       with Element {
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
}

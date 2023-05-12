package typings.wordpressDom

import typings.std.Element
import typings.std.HTMLElement
import typings.wordpressDom.anon.Sequential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesFocusableMod {
  
  @JSImport("@wordpress/dom/build-types/focusable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def find(context: Element): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(context.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
  inline def find(context: Element, param1: Sequential): js.Array[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("find")(context.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Array[HTMLElement]]
}

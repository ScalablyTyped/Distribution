package typings.wordpressDom

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesDomGetScrollContainerMod {
  
  @JSImport("@wordpress/dom/build-types/dom/get-scroll-container", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.UndefOr[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[Element]]
  inline def default(node: Null, direction: String): js.UndefOr[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Element]]
  inline def default(node: Element): js.UndefOr[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Element]]
  inline def default(node: Element, direction: String): js.UndefOr[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(node.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Element]]
}

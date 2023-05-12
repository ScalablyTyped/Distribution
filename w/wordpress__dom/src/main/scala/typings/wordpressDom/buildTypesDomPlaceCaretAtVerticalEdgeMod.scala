package typings.wordpressDom

import typings.std.DOMRect
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesDomPlaceCaretAtVerticalEdgeMod {
  
  @JSImport("@wordpress/dom/build-types/dom/place-caret-at-vertical-edge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(container: HTMLElement, isReverse: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default(container: HTMLElement, isReverse: Boolean, rect: DOMRect): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

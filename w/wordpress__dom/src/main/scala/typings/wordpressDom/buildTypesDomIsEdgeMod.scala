package typings.wordpressDom

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesDomIsEdgeMod {
  
  @JSImport("@wordpress/dom/build-types/dom/is-edge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(container: Element, isReverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(container: Element, isReverse: Boolean, onlyVertical: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any], onlyVertical.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

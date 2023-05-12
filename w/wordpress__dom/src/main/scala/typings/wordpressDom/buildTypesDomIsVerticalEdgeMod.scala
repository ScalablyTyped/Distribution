package typings.wordpressDom

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesDomIsVerticalEdgeMod {
  
  @JSImport("@wordpress/dom/build-types/dom/is-vertical-edge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(container: Element, isReverse: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(container.asInstanceOf[js.Any], isReverse.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

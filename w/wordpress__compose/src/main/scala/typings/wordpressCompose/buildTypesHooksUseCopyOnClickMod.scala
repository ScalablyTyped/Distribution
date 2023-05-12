package typings.wordpressCompose

import typings.react.mod.RefObject
import typings.std.Element
import typings.std.NodeListOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHooksUseCopyOnClickMod {
  
  @JSImport("@wordpress/compose/build-types/hooks/use-copy-on-click", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(ref: RefObject[String | Element | NodeListOf[Element]], text: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(ref: RefObject[String | Element | NodeListOf[Element]], text: String, timeout: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], text.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(ref: RefObject[String | Element | NodeListOf[Element]], text: js.Function): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(ref: RefObject[String | Element | NodeListOf[Element]], text: js.Function, timeout: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(ref.asInstanceOf[js.Any], text.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

package typings.wordpressCompose

import typings.react.mod.Ref
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHooksUseCopyToClipboardMod {
  
  @JSImport("@wordpress/compose/build-types/hooks/use-copy-to-clipboard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TElementType /* <: HTMLElement */](text: String, onSuccess: js.Function): Ref[TElementType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[Ref[TElementType]]
  inline def default[TElementType /* <: HTMLElement */](text: js.Function0[String], onSuccess: js.Function): Ref[TElementType] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], onSuccess.asInstanceOf[js.Any])).asInstanceOf[Ref[TElementType]]
}

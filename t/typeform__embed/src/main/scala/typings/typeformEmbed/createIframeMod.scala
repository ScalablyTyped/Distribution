package typings.typeformEmbed

import typings.std.MessageEvent
import typings.typeformEmbed.anon.EmbedId
import typings.typeformEmbed.createIframeCreateIframeMod.CreateIframeOptions
import typings.typeformEmbed.embedTypesMod.EmbedType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createIframeMod {
  
  @JSImport("@typeform/embed/types/utils/create-iframe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCustomKeyboardListener(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCustomKeyboardListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createIframe(formId: String, `type`: EmbedType, options: CreateIframeOptions): EmbedId = (^.asInstanceOf[js.Dynamic].applyDynamic("createIframe")(formId.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EmbedId]
  
  inline def dispatchCustomKeyEventFromIframe(evt: MessageEvent[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatchCustomKeyEventFromIframe")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeCustomKeyboardListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCustomKeyboardListener")().asInstanceOf[Unit]
}

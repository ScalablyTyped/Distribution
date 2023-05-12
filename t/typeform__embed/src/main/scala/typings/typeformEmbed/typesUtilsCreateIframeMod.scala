package typings.typeformEmbed

import typings.std.MessageEvent
import typings.typeformEmbed.anon.EmbedId
import typings.typeformEmbed.typesBaseEmbedTypesMod.EmbedType
import typings.typeformEmbed.typesUtilsCreateIframeCreateIframeMod.CreateIframe_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsCreateIframeMod {
  
  @JSImport("@typeform/embed/types/utils/create-iframe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCustomKeyboardListener(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCustomKeyboardListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def createIframe(`type`: EmbedType, param1: CreateIframe_): EmbedId = (^.asInstanceOf[js.Dynamic].applyDynamic("createIframe")(`type`.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[EmbedId]
  
  inline def dispatchCustomKeyEventFromIframe(evt: MessageEvent[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatchCustomKeyEventFromIframe")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeCustomKeyboardListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCustomKeyboardListener")().asInstanceOf[Unit]
}

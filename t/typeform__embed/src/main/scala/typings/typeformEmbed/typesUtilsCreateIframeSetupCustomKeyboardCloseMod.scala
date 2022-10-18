package typings.typeformEmbed

import typings.std.MessageEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUtilsCreateIframeSetupCustomKeyboardCloseMod {
  
  @JSImport("@typeform/embed/types/utils/create-iframe/setup-custom-keyboard-close", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCustomKeyboardListener(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addCustomKeyboardListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def dispatchCustomKeyEventFromIframe(evt: MessageEvent[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatchCustomKeyEventFromIframe")(evt.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeCustomKeyboardListener(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCustomKeyboardListener")().asInstanceOf[Unit]
}

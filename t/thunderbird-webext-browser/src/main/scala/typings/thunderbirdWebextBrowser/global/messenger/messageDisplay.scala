package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.messageDisplay.OpenOpenProperties
import typings.thunderbirdWebextBrowser.messenger.messages.MessageHeader
import typings.thunderbirdWebextBrowser.messenger.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageDisplay {
  
  @JSGlobal("messenger.messageDisplay")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDisplayedMessage(tabId: Double): js.Promise[MessageHeader | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayedMessage")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MessageHeader | Null]]
  
  inline def getDisplayedMessages(tabId: Double): js.Promise[js.Array[MessageHeader]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayedMessages")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MessageHeader]]]
  
  @JSGlobal("messenger.messageDisplay.onMessageDisplayed")
  @js.native
  val onMessageDisplayed: WebExtEvent[js.Function2[/* tab */ Tab, /* message */ MessageHeader, Unit]] = js.native
  
  @JSGlobal("messenger.messageDisplay.onMessagesDisplayed")
  @js.native
  val onMessagesDisplayed: WebExtEvent[js.Function2[/* tab */ Tab, /* messages */ js.Array[MessageHeader], Unit]] = js.native
  
  inline def open(openProperties: OpenOpenProperties): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(openProperties.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
}

package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.folders.MailFolder
import typings.thunderbirdWebextBrowser.messenger.mailTabs.MailTab
import typings.thunderbirdWebextBrowser.messenger.mailTabs.QueryQueryInfo
import typings.thunderbirdWebextBrowser.messenger.mailTabs.SetQuickFilterProperties
import typings.thunderbirdWebextBrowser.messenger.mailTabs.UpdateUpdateProperties
import typings.thunderbirdWebextBrowser.messenger.messages.MessageList
import typings.thunderbirdWebextBrowser.messenger.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mailTabs {
  
  @JSGlobal("messenger.mailTabs")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(tabId: Double): js.Promise[MailTab] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MailTab]]
  
  inline def getCurrent(): js.Promise[MailTab] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")().asInstanceOf[js.Promise[MailTab]]
  
  inline def getSelectedMessages(): js.Promise[MessageList] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedMessages")().asInstanceOf[js.Promise[MessageList]]
  inline def getSelectedMessages(tabId: Double): js.Promise[MessageList] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelectedMessages")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MessageList]]
  
  @JSGlobal("messenger.mailTabs.onDisplayedFolderChanged")
  @js.native
  val onDisplayedFolderChanged: WebExtEvent[js.Function2[/* tab */ Tab, /* displayedFolder */ MailFolder, Unit]] = js.native
  
  @JSGlobal("messenger.mailTabs.onSelectedMessagesChanged")
  @js.native
  val onSelectedMessagesChanged: WebExtEvent[js.Function2[/* tab */ Tab, /* selectedMessages */ MessageList, Unit]] = js.native
  
  inline def query(queryInfo: QueryQueryInfo): js.Promise[js.Array[MailTab]] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(queryInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[MailTab]]]
  
  inline def setQuickFilter(properties: SetQuickFilterProperties): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("setQuickFilter")(properties.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def setQuickFilter(tabId: Double, properties: SetQuickFilterProperties): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("setQuickFilter")(tabId.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def setSelectedMessages(messageIds: js.Array[Double]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("setSelectedMessages")(messageIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  inline def setSelectedMessages(tabId: Double, messageIds: js.Array[Double]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("setSelectedMessages")(tabId.asInstanceOf[js.Any], messageIds.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def update(tabId: Double, updateProperties: UpdateUpdateProperties): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(tabId.asInstanceOf[js.Any], updateProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def update(updateProperties: UpdateUpdateProperties): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(updateProperties.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}

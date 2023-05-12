package typings.thunderbirdWebextBrowser.global.browser

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.browser.extensionTypes.InjectDetails
import typings.thunderbirdWebextBrowser.browser.runtime.Port
import typings.thunderbirdWebextBrowser.browser.tabs.ConnectConnectInfo
import typings.thunderbirdWebextBrowser.browser.tabs.CreateCreateProperties
import typings.thunderbirdWebextBrowser.browser.tabs.MoveMoveProperties
import typings.thunderbirdWebextBrowser.browser.tabs.OnActivatedActiveInfo
import typings.thunderbirdWebextBrowser.browser.tabs.OnAttachedAttachInfo
import typings.thunderbirdWebextBrowser.browser.tabs.OnDetachedDetachInfo
import typings.thunderbirdWebextBrowser.browser.tabs.OnMovedMoveInfo
import typings.thunderbirdWebextBrowser.browser.tabs.OnRemovedRemoveInfo
import typings.thunderbirdWebextBrowser.browser.tabs.OnUpdatedChangeInfo
import typings.thunderbirdWebextBrowser.browser.tabs.QueryQueryInfo
import typings.thunderbirdWebextBrowser.browser.tabs.ReloadReloadProperties
import typings.thunderbirdWebextBrowser.browser.tabs.SendMessageOptions
import typings.thunderbirdWebextBrowser.browser.tabs.Tab
import typings.thunderbirdWebextBrowser.browser.tabs.TabsOnUpdatedEvent
import typings.thunderbirdWebextBrowser.browser.tabs.UpdateUpdateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabs {
  
  @JSGlobal("browser.tabs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("browser.tabs.TAB_ID_NONE")
  @js.native
  val TAB_ID_NONE: Double = js.native
  
  inline def connect(tabId: Double): Port = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(tabId.asInstanceOf[js.Any]).asInstanceOf[Port]
  inline def connect(tabId: Double, connectInfo: ConnectConnectInfo): Port = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(tabId.asInstanceOf[js.Any], connectInfo.asInstanceOf[js.Any])).asInstanceOf[Port]
  
  inline def create(createProperties: CreateCreateProperties): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(createProperties.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
  
  inline def duplicate(tabId: Double): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicate")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
  
  inline def executeScript(details: InjectDetails): js.Promise[js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Any]]]
  inline def executeScript(tabId: Double, details: InjectDetails): js.Promise[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeScript")(tabId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Any]]]
  
  inline def get(tabId: Double): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
  
  inline def getCurrent(): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrent")().asInstanceOf[js.Promise[Tab]]
  
  inline def insertCSS(details: InjectDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("insertCSS")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def insertCSS(tabId: Double, details: InjectDetails): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("insertCSS")(tabId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def move(tabIds: js.Array[Double], moveProperties: MoveMoveProperties): js.Promise[Tab | js.Array[Tab]] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(tabIds.asInstanceOf[js.Any], moveProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tab | js.Array[Tab]]]
  inline def move(tabIds: Double, moveProperties: MoveMoveProperties): js.Promise[Tab | js.Array[Tab]] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(tabIds.asInstanceOf[js.Any], moveProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tab | js.Array[Tab]]]
  
  @JSGlobal("browser.tabs.onActivated")
  @js.native
  val onActivated: WebExtEvent[js.Function1[/* activeInfo */ OnActivatedActiveInfo, Unit]] = js.native
  
  @JSGlobal("browser.tabs.onAttached")
  @js.native
  val onAttached: WebExtEvent[js.Function2[/* tabId */ Double, /* attachInfo */ OnAttachedAttachInfo, Unit]] = js.native
  
  @JSGlobal("browser.tabs.onCreated")
  @js.native
  val onCreated: WebExtEvent[js.Function1[/* tab */ Tab, Unit]] = js.native
  
  @JSGlobal("browser.tabs.onDetached")
  @js.native
  val onDetached: WebExtEvent[js.Function2[/* tabId */ Double, /* detachInfo */ OnDetachedDetachInfo, Unit]] = js.native
  
  @JSGlobal("browser.tabs.onMoved")
  @js.native
  val onMoved: WebExtEvent[js.Function2[/* tabId */ Double, /* moveInfo */ OnMovedMoveInfo, Unit]] = js.native
  
  @JSGlobal("browser.tabs.onRemoved")
  @js.native
  val onRemoved: WebExtEvent[js.Function2[/* tabId */ Double, /* removeInfo */ OnRemovedRemoveInfo, Unit]] = js.native
  
  @JSGlobal("browser.tabs.onUpdated")
  @js.native
  val onUpdated: TabsOnUpdatedEvent[
    js.Function3[/* tabId */ Double, /* changeInfo */ OnUpdatedChangeInfo, /* tab */ Tab, Unit]
  ] = js.native
  
  inline def query(queryInfo: QueryQueryInfo): js.Promise[js.Array[Tab]] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(queryInfo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Tab]]]
  
  inline def reload(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")().asInstanceOf[js.Promise[Unit]]
  inline def reload(reloadProperties: ReloadReloadProperties): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(reloadProperties.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def reload(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("reload")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def reload(tabId: Double, reloadProperties: ReloadReloadProperties): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("reload")(tabId.asInstanceOf[js.Any], reloadProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def remove(tabIds: js.Array[Double]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(tabIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def remove(tabIds: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(tabIds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def removeCSS(details: InjectDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCSS")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def removeCSS(tabId: Double, details: InjectDetails): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeCSS")(tabId.asInstanceOf[js.Any], details.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def sendMessage(tabId: Double, message: Any): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(tabId.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def sendMessage(tabId: Double, message: Any, options: SendMessageOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("sendMessage")(tabId.asInstanceOf[js.Any], message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def update(tabId: Double, updateProperties: UpdateUpdateProperties): js.Promise[Tab] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(tabId.asInstanceOf[js.Any], updateProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Tab]]
  inline def update(updateProperties: UpdateUpdateProperties): js.Promise[Tab] = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(updateProperties.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Tab]]
}

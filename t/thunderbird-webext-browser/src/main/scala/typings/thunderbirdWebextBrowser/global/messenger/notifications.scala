package typings.thunderbirdWebextBrowser.global.messenger

import org.scalablytyped.runtime.StringDictionary
import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.notifications.CreateNotificationOptions
import typings.thunderbirdWebextBrowser.messenger.notifications.PermissionLevel
import typings.thunderbirdWebextBrowser.messenger.notifications.UpdateNotificationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notifications {
  
  @JSGlobal("messenger.notifications")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clear(notificationId: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(notificationId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  inline def create(notificationId: String, options: CreateNotificationOptions): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(notificationId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def create(options: CreateNotificationOptions): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getAll(): js.Promise[StringDictionary[CreateNotificationOptions]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")().asInstanceOf[js.Promise[StringDictionary[CreateNotificationOptions]]]
  
  inline def getPermissionLevel(): js.Promise[PermissionLevel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPermissionLevel")().asInstanceOf[js.Promise[PermissionLevel]]
  
  @JSGlobal("messenger.notifications.onButtonClicked")
  @js.native
  val onButtonClicked: WebExtEvent[js.Function2[/* notificationId */ String, /* buttonIndex */ Double, Unit]] = js.native
  
  @JSGlobal("messenger.notifications.onClicked")
  @js.native
  val onClicked: WebExtEvent[js.Function1[/* notificationId */ String, Unit]] = js.native
  
  @JSGlobal("messenger.notifications.onClosed")
  @js.native
  val onClosed: WebExtEvent[js.Function2[/* notificationId */ String, /* byUser */ Boolean, Unit]] = js.native
  
  @JSGlobal("messenger.notifications.onPermissionLevelChanged")
  @js.native
  val onPermissionLevelChanged: js.UndefOr[WebExtEvent[js.Function1[/* level */ PermissionLevel, Unit]]] = js.native
  
  @JSGlobal("messenger.notifications.onShowSettings")
  @js.native
  val onShowSettings: js.UndefOr[WebExtEvent[js.Function0[Unit]]] = js.native
  
  @JSGlobal("messenger.notifications.onShown")
  @js.native
  val onShown: WebExtEvent[js.Function1[/* notificationId */ String, Unit]] = js.native
  
  inline def update(notificationId: String, options: UpdateNotificationOptions): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(notificationId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}

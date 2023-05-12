package typings.thunderbirdWebextBrowser.global.messenger

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.messenger.composeAction.ColorArray
import typings.thunderbirdWebextBrowser.messenger.composeAction.GetBadgeBackgroundColorDetails
import typings.thunderbirdWebextBrowser.messenger.composeAction.GetBadgeTextDetails
import typings.thunderbirdWebextBrowser.messenger.composeAction.GetLabelDetails
import typings.thunderbirdWebextBrowser.messenger.composeAction.GetPopupDetails
import typings.thunderbirdWebextBrowser.messenger.composeAction.GetTitleDetails
import typings.thunderbirdWebextBrowser.messenger.composeAction.IsEnabledDetails
import typings.thunderbirdWebextBrowser.messenger.composeAction.OnClickData
import typings.thunderbirdWebextBrowser.messenger.composeAction.SetBadgeBackgroundColorDetails
import typings.thunderbirdWebextBrowser.messenger.composeAction.SetBadgeTextDetails
import typings.thunderbirdWebextBrowser.messenger.composeAction.SetIconDetails
import typings.thunderbirdWebextBrowser.messenger.composeAction.SetLabelDetails
import typings.thunderbirdWebextBrowser.messenger.composeAction.SetPopupDetails
import typings.thunderbirdWebextBrowser.messenger.composeAction.SetTitleDetails
import typings.thunderbirdWebextBrowser.messenger.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object composeAction {
  
  @JSGlobal("messenger.composeAction")
  @js.native
  val ^ : js.Any = js.native
  
  inline def disable(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[js.Promise[Unit]]
  inline def disable(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def enable(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[js.Promise[Unit]]
  inline def enable(tabId: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")(tabId.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getBadgeBackgroundColor(details: GetBadgeBackgroundColorDetails): js.Promise[ColorArray] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeBackgroundColor")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ColorArray]]
  
  inline def getBadgeText(details: GetBadgeTextDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBadgeText")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getLabel(details: GetLabelDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLabel")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getPopup(details: GetPopupDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPopup")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getTitle(details: GetTitleDetails): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTitle")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def isEnabled(details: IsEnabledDetails): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isEnabled")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  
  @JSGlobal("messenger.composeAction.onClicked")
  @js.native
  val onClicked: WebExtEvent[js.Function2[/* tab */ Tab, /* info */ js.UndefOr[OnClickData], Unit]] = js.native
  
  inline def openPopup(): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("openPopup")().asInstanceOf[js.Promise[Any]]
  
  inline def setBadgeBackgroundColor(details: SetBadgeBackgroundColorDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeBackgroundColor")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setBadgeText(details: SetBadgeTextDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeText")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setIcon(details: SetIconDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setLabel(details: SetLabelDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setLabel")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setPopup(details: SetPopupDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPopup")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setTitle(details: SetTitleDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}

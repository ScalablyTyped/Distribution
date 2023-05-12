package typings.thunderbirdWebextBrowser.global.browser

import typings.thunderbirdWebextBrowser.WebExtEvent
import typings.thunderbirdWebextBrowser.browser.action.ColorArray
import typings.thunderbirdWebextBrowser.browser.action.GetBadgeBackgroundColorDetails
import typings.thunderbirdWebextBrowser.browser.action.GetBadgeTextDetails
import typings.thunderbirdWebextBrowser.browser.action.GetLabelDetails
import typings.thunderbirdWebextBrowser.browser.action.GetPopupDetails
import typings.thunderbirdWebextBrowser.browser.action.GetTitleDetails
import typings.thunderbirdWebextBrowser.browser.action.IsEnabledDetails
import typings.thunderbirdWebextBrowser.browser.action.OnClickData
import typings.thunderbirdWebextBrowser.browser.action.SetBadgeBackgroundColorDetails
import typings.thunderbirdWebextBrowser.browser.action.SetBadgeTextDetails
import typings.thunderbirdWebextBrowser.browser.action.SetIconDetails
import typings.thunderbirdWebextBrowser.browser.action.SetLabelDetails
import typings.thunderbirdWebextBrowser.browser.action.SetPopupDetails
import typings.thunderbirdWebextBrowser.browser.action.SetTitleDetails
import typings.thunderbirdWebextBrowser.browser.tabs.Tab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object action {
  
  @JSGlobal("browser.action")
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
  
  @JSGlobal("browser.action.onClicked")
  @js.native
  val onClicked: WebExtEvent[js.Function2[/* tab */ Tab, /* info */ js.UndefOr[OnClickData], Unit]] = js.native
  
  inline def openPopup(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("openPopup")().asInstanceOf[js.Promise[Boolean]]
  
  inline def setBadgeBackgroundColor(details: SetBadgeBackgroundColorDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeBackgroundColor")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setBadgeText(details: SetBadgeTextDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBadgeText")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setIcon(details: SetIconDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setIcon")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setLabel(details: SetLabelDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setLabel")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setPopup(details: SetPopupDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPopup")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def setTitle(details: SetTitleDetails): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTitle")(details.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}

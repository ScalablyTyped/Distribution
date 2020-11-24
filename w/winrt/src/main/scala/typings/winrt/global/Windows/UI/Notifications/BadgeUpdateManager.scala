package typings.winrt.global.Windows.UI.Notifications

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.UI.Notifications.BadgeUpdateManager")
@js.native
class BadgeUpdateManager ()
  extends typings.winrt.Windows.UI.Notifications.BadgeUpdateManager
/* static members */
@JSGlobal("Windows.UI.Notifications.BadgeUpdateManager")
@js.native
object BadgeUpdateManager extends js.Object {
  
  def createBadgeUpdaterForApplication(): typings.winrt.Windows.UI.Notifications.BadgeUpdater = js.native
  def createBadgeUpdaterForApplication(applicationId: String): typings.winrt.Windows.UI.Notifications.BadgeUpdater = js.native
  
  def createBadgeUpdaterForSecondaryTile(tileId: String): typings.winrt.Windows.UI.Notifications.BadgeUpdater = js.native
  
  def getTemplateContent(`type`: typings.winrt.Windows.UI.Notifications.BadgeTemplateType): XmlDocument = js.native
}

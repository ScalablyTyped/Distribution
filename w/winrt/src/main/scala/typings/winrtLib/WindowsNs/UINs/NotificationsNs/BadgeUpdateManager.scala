package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.Notifications.BadgeUpdateManager")
@js.native
class BadgeUpdateManager () extends js.Object

/* static members */
@JSGlobal("Windows.UI.Notifications.BadgeUpdateManager")
@js.native
object BadgeUpdateManager extends js.Object {
  def createBadgeUpdaterForApplication(): winrtLib.WindowsNs.UINs.NotificationsNs.BadgeUpdater = js.native
  def createBadgeUpdaterForApplication(applicationId: java.lang.String): winrtLib.WindowsNs.UINs.NotificationsNs.BadgeUpdater = js.native
  def createBadgeUpdaterForSecondaryTile(tileId: java.lang.String): winrtLib.WindowsNs.UINs.NotificationsNs.BadgeUpdater = js.native
  def getTemplateContent(`type`: winrtLib.WindowsNs.UINs.NotificationsNs.BadgeTemplateType): winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
}


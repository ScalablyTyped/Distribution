package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBadgeUpdateManagerStatics extends js.Object {
  def createBadgeUpdaterForApplication(): BadgeUpdater = js.native
  def createBadgeUpdaterForApplication(applicationId: java.lang.String): BadgeUpdater = js.native
  def createBadgeUpdaterForSecondaryTile(tileId: java.lang.String): BadgeUpdater = js.native
  def getTemplateContent(`type`: BadgeTemplateType): winrtLib.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument = js.native
}


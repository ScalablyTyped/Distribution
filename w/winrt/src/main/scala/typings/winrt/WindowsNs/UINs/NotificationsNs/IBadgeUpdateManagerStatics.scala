package typings.winrt.WindowsNs.UINs.NotificationsNs

import typings.winrt.WindowsNs.DataNs.XmlNs.DomNs.XmlDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBadgeUpdateManagerStatics extends js.Object {
  def createBadgeUpdaterForApplication(): BadgeUpdater = js.native
  def createBadgeUpdaterForApplication(applicationId: String): BadgeUpdater = js.native
  def createBadgeUpdaterForSecondaryTile(tileId: String): BadgeUpdater = js.native
  def getTemplateContent(`type`: BadgeTemplateType): XmlDocument = js.native
}


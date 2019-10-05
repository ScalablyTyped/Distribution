package typings.winrt.Windows.UI.Notifications

import typings.winrt.Windows.Data.Xml.Dom.XmlDocument
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
  def createBadgeUpdaterForApplication(): BadgeUpdater = js.native
  def createBadgeUpdaterForApplication(applicationId: String): BadgeUpdater = js.native
  def createBadgeUpdaterForSecondaryTile(tileId: String): BadgeUpdater = js.native
  def getTemplateContent(`type`: BadgeTemplateType): XmlDocument = js.native
}


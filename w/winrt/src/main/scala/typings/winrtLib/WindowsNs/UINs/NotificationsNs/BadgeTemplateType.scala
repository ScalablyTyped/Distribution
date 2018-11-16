package typings
package winrtLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BadgeTemplateType extends js.Object

@JSGlobal("Windows.UI.Notifications.BadgeTemplateType")
@js.native
object BadgeTemplateType extends js.Object {
  @js.native
  sealed trait badgeGlyph
    extends winrtLib.WindowsNs.UINs.NotificationsNs.BadgeTemplateType
  
  @js.native
  sealed trait badgeNumber
    extends winrtLib.WindowsNs.UINs.NotificationsNs.BadgeTemplateType
  
  val badgeGlyph: badgeGlyph with java.lang.String = js.native
  val badgeNumber: badgeNumber with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.NotificationsNs.BadgeTemplateType with java.lang.String] = js.native
}


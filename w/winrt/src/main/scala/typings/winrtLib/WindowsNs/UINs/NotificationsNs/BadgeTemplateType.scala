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
  
  /* 0 */ val badgeGlyph: badgeGlyph with scala.Double = js.native
  /* 1 */ val badgeNumber: badgeNumber with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.NotificationsNs.BadgeTemplateType with scala.Double] = js.native
}


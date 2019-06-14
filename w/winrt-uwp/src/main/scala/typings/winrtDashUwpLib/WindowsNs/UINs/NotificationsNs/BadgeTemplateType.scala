package typings
package winrtDashUwpLib.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BadgeTemplateType extends js.Object

/** Specifies the template to use for a tile's badge overlay. Used by BadgeUpdateManager.getTemplateContent . */
@JSGlobal("Windows.UI.Notifications.BadgeTemplateType")
@js.native
object BadgeTemplateType extends js.Object {
  /** A system-provided glyph image. For more information, see Badge overview. */
  @js.native
  sealed trait badgeGlyph
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.BadgeTemplateType
  
  /** A numerical value from 1 to 99. Values greater than 99 are accepted, but in those cases "99+" is displayed instead of the actual number. In scenarios where your numbers are expected to be greater than 99, you should consider using a glyph instead. */
  @js.native
  sealed trait badgeNumber
    extends winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.BadgeTemplateType
  
  /* 0 */ val badgeGlyph: badgeGlyph with scala.Double = js.native
  /* 1 */ val badgeNumber: badgeNumber with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.UINs.NotificationsNs.BadgeTemplateType with scala.Double
  ] = js.native
}


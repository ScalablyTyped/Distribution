package typings.winrtDashUwp.WindowsNs.UINs.NotificationsNs

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
  sealed trait badgeGlyph extends BadgeTemplateType
  
  /** A numerical value from 1 to 99. Values greater than 99 are accepted, but in those cases "99+" is displayed instead of the actual number. In scenarios where your numbers are expected to be greater than 99, you should consider using a glyph instead. */
  @js.native
  sealed trait badgeNumber extends BadgeTemplateType
  
  /* 0 */ val badgeGlyph: typings.winrtDashUwp.WindowsNs.UINs.NotificationsNs.BadgeTemplateType.badgeGlyph with Double = js.native
  /* 1 */ val badgeNumber: typings.winrtDashUwp.WindowsNs.UINs.NotificationsNs.BadgeTemplateType.badgeNumber with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BadgeTemplateType with Double] = js.native
}


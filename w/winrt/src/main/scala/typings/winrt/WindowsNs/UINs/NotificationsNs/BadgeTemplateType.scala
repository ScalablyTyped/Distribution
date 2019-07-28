package typings.winrt.WindowsNs.UINs.NotificationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BadgeTemplateType extends js.Object

@JSGlobal("Windows.UI.Notifications.BadgeTemplateType")
@js.native
object BadgeTemplateType extends js.Object {
  @js.native
  sealed trait badgeGlyph extends BadgeTemplateType
  
  @js.native
  sealed trait badgeNumber extends BadgeTemplateType
  
  /* 0 */ val badgeGlyph: typings.winrt.WindowsNs.UINs.NotificationsNs.BadgeTemplateType.badgeGlyph with Double = js.native
  /* 1 */ val badgeNumber: typings.winrt.WindowsNs.UINs.NotificationsNs.BadgeTemplateType.badgeNumber with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BadgeTemplateType with Double] = js.native
}


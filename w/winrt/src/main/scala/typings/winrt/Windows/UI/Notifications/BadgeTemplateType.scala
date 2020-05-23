package typings.winrt.Windows.UI.Notifications

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
  
}


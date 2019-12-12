package typings.winrt.Windows.UI.Notifications

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.Notifications.BadgeTemplateType.badgeGlyph
import typings.winrt.Windows.UI.Notifications.BadgeTemplateType.badgeNumber
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BadgeTemplateType with Double] = js.native
  /* 0 */ @js.native
  object badgeGlyph extends TopLevel[badgeGlyph with Double]
  
  /* 1 */ @js.native
  object badgeNumber extends TopLevel[badgeNumber with Double]
  
}


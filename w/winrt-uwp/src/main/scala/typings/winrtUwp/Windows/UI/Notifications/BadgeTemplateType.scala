package typings.winrtUwp.Windows.UI.Notifications

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BadgeTemplateType with Double] = js.native
  /* 0 */ @js.native
  object badgeGlyph extends TopLevel[badgeGlyph with Double]
  
  /* 1 */ @js.native
  object badgeNumber extends TopLevel[badgeNumber with Double]
  
}


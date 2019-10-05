package typings.winrtDashUwp.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineSpacingRule extends js.Object

/** Specifies options for line-spacing rules. */
@JSGlobal("Windows.UI.Text.LineSpacingRule")
@js.native
object LineSpacingRule extends js.Object {
  /** The line-spacing value specifies the spacing from one line to the next. However, if the value is less than single spacing, text is single spaced. */
  @js.native
  sealed trait atLeast extends LineSpacingRule
  
  /** Double line spacing. The line-spacing value is ignored. */
  @js.native
  sealed trait double extends LineSpacingRule
  
  /** The line-spacing value specifies the exact spacing from one line to the next, even if the value is less than single spacing. */
  @js.native
  sealed trait exactly extends LineSpacingRule
  
  /** The line-spacing value specifies the line spacing, in lines. */
  @js.native
  sealed trait multiple extends LineSpacingRule
  
  /** One-and-a-half line spacing. The line-spacing value is ignored. */
  @js.native
  sealed trait oneAndHalf extends LineSpacingRule
  
  /** The line-spacing value specifies the line spacing by percent of line height. */
  @js.native
  sealed trait percent extends LineSpacingRule
  
  /** Single space. The line-spacing value is ignored. */
  @js.native
  sealed trait single extends LineSpacingRule
  
  /** The line spacing is undefined. */
  @js.native
  sealed trait undefined extends LineSpacingRule
  
  /* 4 */ val atLeast: typings.winrtDashUwp.Windows.UI.Text.LineSpacingRule.atLeast with Double = js.native
  /* 3 */ val double: typings.winrtDashUwp.Windows.UI.Text.LineSpacingRule.double with Double = js.native
  /* 5 */ val exactly: typings.winrtDashUwp.Windows.UI.Text.LineSpacingRule.exactly with Double = js.native
  /* 6 */ val multiple: typings.winrtDashUwp.Windows.UI.Text.LineSpacingRule.multiple with Double = js.native
  /* 2 */ val oneAndHalf: typings.winrtDashUwp.Windows.UI.Text.LineSpacingRule.oneAndHalf with Double = js.native
  /* 7 */ val percent: typings.winrtDashUwp.Windows.UI.Text.LineSpacingRule.percent with Double = js.native
  /* 1 */ val single: typings.winrtDashUwp.Windows.UI.Text.LineSpacingRule.single with Double = js.native
  /* 0 */ val undefined: typings.winrtDashUwp.Windows.UI.Text.LineSpacingRule.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineSpacingRule with Double] = js.native
}


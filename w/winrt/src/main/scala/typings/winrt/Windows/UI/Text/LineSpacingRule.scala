package typings.winrt.Windows.UI.Text

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineSpacingRule extends js.Object

@JSGlobal("Windows.UI.Text.LineSpacingRule")
@js.native
object LineSpacingRule extends js.Object {
  @js.native
  sealed trait atLeast extends LineSpacingRule
  
  @js.native
  sealed trait double extends LineSpacingRule
  
  @js.native
  sealed trait exactly extends LineSpacingRule
  
  @js.native
  sealed trait multiple extends LineSpacingRule
  
  @js.native
  sealed trait oneAndHalf extends LineSpacingRule
  
  @js.native
  sealed trait percent extends LineSpacingRule
  
  @js.native
  sealed trait single extends LineSpacingRule
  
  @js.native
  sealed trait undefined extends LineSpacingRule
  
  /* 4 */ val atLeast: typings.winrt.Windows.UI.Text.LineSpacingRule.atLeast with Double = js.native
  /* 3 */ val double: typings.winrt.Windows.UI.Text.LineSpacingRule.double with Double = js.native
  /* 5 */ val exactly: typings.winrt.Windows.UI.Text.LineSpacingRule.exactly with Double = js.native
  /* 6 */ val multiple: typings.winrt.Windows.UI.Text.LineSpacingRule.multiple with Double = js.native
  /* 2 */ val oneAndHalf: typings.winrt.Windows.UI.Text.LineSpacingRule.oneAndHalf with Double = js.native
  /* 7 */ val percent: typings.winrt.Windows.UI.Text.LineSpacingRule.percent with Double = js.native
  /* 1 */ val single: typings.winrt.Windows.UI.Text.LineSpacingRule.single with Double = js.native
  /* 0 */ val undefined: typings.winrt.Windows.UI.Text.LineSpacingRule.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineSpacingRule with Double] = js.native
}


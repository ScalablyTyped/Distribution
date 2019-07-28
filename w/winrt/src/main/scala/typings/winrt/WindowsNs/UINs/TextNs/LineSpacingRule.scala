package typings.winrt.WindowsNs.UINs.TextNs

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
  
  /* 4 */ val atLeast: typings.winrt.WindowsNs.UINs.TextNs.LineSpacingRule.atLeast with Double = js.native
  /* 3 */ val double: typings.winrt.WindowsNs.UINs.TextNs.LineSpacingRule.double with Double = js.native
  /* 5 */ val exactly: typings.winrt.WindowsNs.UINs.TextNs.LineSpacingRule.exactly with Double = js.native
  /* 6 */ val multiple: typings.winrt.WindowsNs.UINs.TextNs.LineSpacingRule.multiple with Double = js.native
  /* 2 */ val oneAndHalf: typings.winrt.WindowsNs.UINs.TextNs.LineSpacingRule.oneAndHalf with Double = js.native
  /* 7 */ val percent: typings.winrt.WindowsNs.UINs.TextNs.LineSpacingRule.percent with Double = js.native
  /* 1 */ val single: typings.winrt.WindowsNs.UINs.TextNs.LineSpacingRule.single with Double = js.native
  /* 0 */ val undefined: typings.winrt.WindowsNs.UINs.TextNs.LineSpacingRule.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineSpacingRule with Double] = js.native
}


package typings.winrt.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.Text.LineSpacingRule.atLeast
import typings.winrt.Windows.UI.Text.LineSpacingRule.double
import typings.winrt.Windows.UI.Text.LineSpacingRule.exactly
import typings.winrt.Windows.UI.Text.LineSpacingRule.multiple
import typings.winrt.Windows.UI.Text.LineSpacingRule.oneAndHalf
import typings.winrt.Windows.UI.Text.LineSpacingRule.percent
import typings.winrt.Windows.UI.Text.LineSpacingRule.single
import typings.winrt.Windows.UI.Text.LineSpacingRule.undefined
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LineSpacingRule with Double] = js.native
  /* 4 */ @js.native
  object atLeast extends TopLevel[atLeast with Double]
  
  /* 3 */ @js.native
  object double extends TopLevel[double with Double]
  
  /* 5 */ @js.native
  object exactly extends TopLevel[exactly with Double]
  
  /* 6 */ @js.native
  object multiple extends TopLevel[multiple with Double]
  
  /* 2 */ @js.native
  object oneAndHalf extends TopLevel[oneAndHalf with Double]
  
  /* 7 */ @js.native
  object percent extends TopLevel[percent with Double]
  
  /* 1 */ @js.native
  object single extends TopLevel[single with Double]
  
  /* 0 */ @js.native
  object undefined extends TopLevel[undefined with Double]
  
}


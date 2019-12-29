package typings.winrtDashUwp.Windows.UI.Text

import org.scalablytyped.runtime.TopLevel
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


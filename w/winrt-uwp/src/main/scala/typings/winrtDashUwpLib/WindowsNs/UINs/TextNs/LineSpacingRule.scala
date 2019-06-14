package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

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
  sealed trait atLeast
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LineSpacingRule
  
  /** Double line spacing. The line-spacing value is ignored. */
  @js.native
  sealed trait double
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LineSpacingRule
  
  /** The line-spacing value specifies the exact spacing from one line to the next, even if the value is less than single spacing. */
  @js.native
  sealed trait exactly
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LineSpacingRule
  
  /** The line-spacing value specifies the line spacing, in lines. */
  @js.native
  sealed trait multiple
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LineSpacingRule
  
  /** One-and-a-half line spacing. The line-spacing value is ignored. */
  @js.native
  sealed trait oneAndHalf
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LineSpacingRule
  
  /** The line-spacing value specifies the line spacing by percent of line height. */
  @js.native
  sealed trait percent
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LineSpacingRule
  
  /** Single space. The line-spacing value is ignored. */
  @js.native
  sealed trait single
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LineSpacingRule
  
  /** The line spacing is undefined. */
  @js.native
  sealed trait undefined
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.LineSpacingRule
  
  /* 4 */ val atLeast: atLeast with scala.Double = js.native
  /* 3 */ val double: double with scala.Double = js.native
  /* 5 */ val exactly: exactly with scala.Double = js.native
  /* 6 */ val multiple: multiple with scala.Double = js.native
  /* 2 */ val oneAndHalf: oneAndHalf with scala.Double = js.native
  /* 7 */ val percent: percent with scala.Double = js.native
  /* 1 */ val single: single with scala.Double = js.native
  /* 0 */ val undefined: undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.LineSpacingRule with scala.Double] = js.native
}


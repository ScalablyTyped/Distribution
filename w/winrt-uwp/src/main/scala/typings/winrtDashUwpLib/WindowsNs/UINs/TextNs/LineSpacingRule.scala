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
  
  val atLeast: atLeast with java.lang.String = js.native
  val double: double with java.lang.String = js.native
  val exactly: exactly with java.lang.String = js.native
  val multiple: multiple with java.lang.String = js.native
  val oneAndHalf: oneAndHalf with java.lang.String = js.native
  val percent: percent with java.lang.String = js.native
  val single: single with java.lang.String = js.native
  val undefined: undefined with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.LineSpacingRule with java.lang.String] = js.native
}


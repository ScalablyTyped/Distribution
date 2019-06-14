package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineSpacingRule extends js.Object

@JSGlobal("Windows.UI.Text.LineSpacingRule")
@js.native
object LineSpacingRule extends js.Object {
  @js.native
  sealed trait atLeast
    extends winrtLib.WindowsNs.UINs.TextNs.LineSpacingRule
  
  @js.native
  sealed trait double
    extends winrtLib.WindowsNs.UINs.TextNs.LineSpacingRule
  
  @js.native
  sealed trait exactly
    extends winrtLib.WindowsNs.UINs.TextNs.LineSpacingRule
  
  @js.native
  sealed trait multiple
    extends winrtLib.WindowsNs.UINs.TextNs.LineSpacingRule
  
  @js.native
  sealed trait oneAndHalf
    extends winrtLib.WindowsNs.UINs.TextNs.LineSpacingRule
  
  @js.native
  sealed trait percent
    extends winrtLib.WindowsNs.UINs.TextNs.LineSpacingRule
  
  @js.native
  sealed trait single
    extends winrtLib.WindowsNs.UINs.TextNs.LineSpacingRule
  
  @js.native
  sealed trait undefined
    extends winrtLib.WindowsNs.UINs.TextNs.LineSpacingRule
  
  /* 4 */ val atLeast: atLeast with scala.Double = js.native
  /* 3 */ val double: double with scala.Double = js.native
  /* 5 */ val exactly: exactly with scala.Double = js.native
  /* 6 */ val multiple: multiple with scala.Double = js.native
  /* 2 */ val oneAndHalf: oneAndHalf with scala.Double = js.native
  /* 7 */ val percent: percent with scala.Double = js.native
  /* 1 */ val single: single with scala.Double = js.native
  /* 0 */ val undefined: undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.LineSpacingRule with scala.Double] = js.native
}


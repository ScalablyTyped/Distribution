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
  
  val atLeast: atLeast with java.lang.String = js.native
  val double: double with java.lang.String = js.native
  val exactly: exactly with java.lang.String = js.native
  val multiple: multiple with java.lang.String = js.native
  val oneAndHalf: oneAndHalf with java.lang.String = js.native
  val percent: percent with java.lang.String = js.native
  val single: single with java.lang.String = js.native
  val undefined: undefined with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.LineSpacingRule with java.lang.String] = js.native
}


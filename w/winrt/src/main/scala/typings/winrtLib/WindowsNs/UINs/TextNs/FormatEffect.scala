package typings
package winrtLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormatEffect extends js.Object

@JSGlobal("Windows.UI.Text.FormatEffect")
@js.native
object FormatEffect extends js.Object {
  @js.native
  sealed trait off
    extends winrtLib.WindowsNs.UINs.TextNs.FormatEffect
  
  @js.native
  sealed trait on
    extends winrtLib.WindowsNs.UINs.TextNs.FormatEffect
  
  @js.native
  sealed trait toggle
    extends winrtLib.WindowsNs.UINs.TextNs.FormatEffect
  
  @js.native
  sealed trait undefined
    extends winrtLib.WindowsNs.UINs.TextNs.FormatEffect
  
  /* 0 */ val off: off with scala.Double = js.native
  /* 1 */ val on: on with scala.Double = js.native
  /* 2 */ val toggle: toggle with scala.Double = js.native
  /* 3 */ val undefined: undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.UINs.TextNs.FormatEffect with scala.Double] = js.native
}


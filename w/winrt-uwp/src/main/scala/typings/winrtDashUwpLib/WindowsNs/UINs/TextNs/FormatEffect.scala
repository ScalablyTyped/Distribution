package typings
package winrtDashUwpLib.WindowsNs.UINs.TextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormatEffect extends js.Object

/** Defines values that indicate the state of a character or paragraph formatting property. */
@JSGlobal("Windows.UI.Text.FormatEffect")
@js.native
object FormatEffect extends js.Object {
  /** Turns off the property. */
  @js.native
  sealed trait off
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FormatEffect
  
  /** Turns on the property. */
  @js.native
  sealed trait on
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FormatEffect
  
  /** Toggles the current setting. */
  @js.native
  sealed trait toggle
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FormatEffect
  
  /** No change. */
  @js.native
  sealed trait undefined
    extends winrtDashUwpLib.WindowsNs.UINs.TextNs.FormatEffect
  
  /* 0 */ val off: off with scala.Double = js.native
  /* 1 */ val on: on with scala.Double = js.native
  /* 2 */ val toggle: toggle with scala.Double = js.native
  /* 3 */ val undefined: undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.FormatEffect with scala.Double] = js.native
}


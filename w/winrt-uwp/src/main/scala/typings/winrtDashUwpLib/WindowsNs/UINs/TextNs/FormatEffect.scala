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
  
  val off: off with java.lang.String = js.native
  val on: on with java.lang.String = js.native
  val toggle: toggle with java.lang.String = js.native
  val undefined: undefined with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.UINs.TextNs.FormatEffect with java.lang.String] = js.native
}


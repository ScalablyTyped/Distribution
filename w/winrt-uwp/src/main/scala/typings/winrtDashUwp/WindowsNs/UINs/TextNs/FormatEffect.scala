package typings.winrtDashUwp.WindowsNs.UINs.TextNs

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
  sealed trait off extends FormatEffect
  
  /** Turns on the property. */
  @js.native
  sealed trait on extends FormatEffect
  
  /** Toggles the current setting. */
  @js.native
  sealed trait toggle extends FormatEffect
  
  /** No change. */
  @js.native
  sealed trait undefined extends FormatEffect
  
  /* 0 */ val off: typings.winrtDashUwp.WindowsNs.UINs.TextNs.FormatEffect.off with Double = js.native
  /* 1 */ val on: typings.winrtDashUwp.WindowsNs.UINs.TextNs.FormatEffect.on with Double = js.native
  /* 2 */ val toggle: typings.winrtDashUwp.WindowsNs.UINs.TextNs.FormatEffect.toggle with Double = js.native
  /* 3 */ val undefined: typings.winrtDashUwp.WindowsNs.UINs.TextNs.FormatEffect.undefined with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FormatEffect with Double] = js.native
}


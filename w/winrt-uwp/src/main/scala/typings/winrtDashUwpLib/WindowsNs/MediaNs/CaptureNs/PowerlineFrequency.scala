package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PowerlineFrequency extends js.Object

/** Specifies the local power line frequency. */
@JSGlobal("Windows.Media.Capture.PowerlineFrequency")
@js.native
object PowerlineFrequency extends js.Object {
  /** Power-line frequency control is disabled. */
  @js.native
  sealed trait disabled
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency
  
  /** The power-line frequency is 50 Hz. */
  @js.native
  sealed trait fiftyHertz
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency
  
  /** The power-line frequency is 60 Hz. */
  @js.native
  sealed trait sixtyHertz
    extends winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency
  
  val disabled: disabled with java.lang.String = js.native
  val fiftyHertz: fiftyHertz with java.lang.String = js.native
  val sixtyHertz: sixtyHertz with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency with java.lang.String
  ] = js.native
}


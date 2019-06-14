package typings
package winrtLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PowerlineFrequency extends js.Object

@JSGlobal("Windows.Media.Capture.PowerlineFrequency")
@js.native
object PowerlineFrequency extends js.Object {
  @js.native
  sealed trait disabled
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency
  
  @js.native
  sealed trait fiftyHertz
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency
  
  @js.native
  sealed trait sixtyHertz
    extends winrtLib.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency
  
  /* 0 */ val disabled: disabled with scala.Double = js.native
  /* 1 */ val fiftyHertz: fiftyHertz with scala.Double = js.native
  /* 2 */ val sixtyHertz: sixtyHertz with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency with scala.Double] = js.native
}


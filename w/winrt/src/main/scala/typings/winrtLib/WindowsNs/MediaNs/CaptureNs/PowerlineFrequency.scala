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
  
  val disabled: disabled with java.lang.String = js.native
  val fiftyHertz: fiftyHertz with java.lang.String = js.native
  val sixtyHertz: sixtyHertz with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency with java.lang.String] = js.native
}


package typings.winrt.Windows.Media.Capture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PowerlineFrequency extends js.Object

@JSGlobal("Windows.Media.Capture.PowerlineFrequency")
@js.native
object PowerlineFrequency extends js.Object {
  @js.native
  sealed trait disabled extends PowerlineFrequency
  
  @js.native
  sealed trait fiftyHertz extends PowerlineFrequency
  
  @js.native
  sealed trait sixtyHertz extends PowerlineFrequency
  
  /* 0 */ val disabled: typings.winrt.Windows.Media.Capture.PowerlineFrequency.disabled with Double = js.native
  /* 1 */ val fiftyHertz: typings.winrt.Windows.Media.Capture.PowerlineFrequency.fiftyHertz with Double = js.native
  /* 2 */ val sixtyHertz: typings.winrt.Windows.Media.Capture.PowerlineFrequency.sixtyHertz with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PowerlineFrequency with Double] = js.native
}


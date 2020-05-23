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
  
}


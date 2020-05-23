package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioProcessing extends js.Object

/** Defines the audio processing modes. */
@JSGlobal("Windows.Media.AudioProcessing")
@js.native
object AudioProcessing extends js.Object {
  /** Normal audio signal processing. */
  @js.native
  sealed trait default extends AudioProcessing
  
  /** Minimal audio signal processing. */
  @js.native
  sealed trait raw extends AudioProcessing
  
}


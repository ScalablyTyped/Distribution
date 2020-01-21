package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioProcessing with Double] = js.native
  /* 0 */ @js.native
  object default extends TopLevel[default with Double]
  
  /* 1 */ @js.native
  object raw extends TopLevel[raw with Double]
  
}


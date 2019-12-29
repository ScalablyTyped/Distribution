package typings.winrtDashUwp.Windows.Media.Capture

import org.scalablytyped.runtime.TopLevel
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
  sealed trait disabled extends PowerlineFrequency
  
  /** The power-line frequency is 50 Hz. */
  @js.native
  sealed trait fiftyHertz extends PowerlineFrequency
  
  /** The power-line frequency is 60 Hz. */
  @js.native
  sealed trait sixtyHertz extends PowerlineFrequency
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PowerlineFrequency with Double] = js.native
  /* 0 */ @js.native
  object disabled extends TopLevel[disabled with Double]
  
  /* 1 */ @js.native
  object fiftyHertz extends TopLevel[fiftyHertz with Double]
  
  /* 2 */ @js.native
  object sixtyHertz extends TopLevel[sixtyHertz with Double]
  
}


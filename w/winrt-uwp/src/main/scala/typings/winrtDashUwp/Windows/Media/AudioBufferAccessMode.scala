package typings.winrtDashUwp.Windows.Media

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AudioBufferAccessMode extends js.Object

/** Defines the access mode of an AudioBuffer returned by AudioFrame::LockBuffer . */
@JSGlobal("Windows.Media.AudioBufferAccessMode")
@js.native
object AudioBufferAccessMode extends js.Object {
  /** The audio buffer is read-only. */
  @js.native
  sealed trait read extends AudioBufferAccessMode
  
  /** The audio buffer can be written to and read from. */
  @js.native
  sealed trait readWrite extends AudioBufferAccessMode
  
  /** The audio buffer is write-only. */
  @js.native
  sealed trait write extends AudioBufferAccessMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioBufferAccessMode with Double] = js.native
  /* 0 */ @js.native
  object read extends TopLevel[read with Double]
  
  /* 1 */ @js.native
  object readWrite extends TopLevel[readWrite with Double]
  
  /* 2 */ @js.native
  object write extends TopLevel[write with Double]
  
}


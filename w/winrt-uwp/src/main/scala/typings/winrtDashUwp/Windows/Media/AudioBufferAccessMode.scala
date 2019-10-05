package typings.winrtDashUwp.Windows.Media

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
  
  /* 0 */ val read: typings.winrtDashUwp.Windows.Media.AudioBufferAccessMode.read with Double = js.native
  /* 1 */ val readWrite: typings.winrtDashUwp.Windows.Media.AudioBufferAccessMode.readWrite with Double = js.native
  /* 2 */ val write: typings.winrtDashUwp.Windows.Media.AudioBufferAccessMode.write with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AudioBufferAccessMode with Double] = js.native
}


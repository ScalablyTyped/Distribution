package typings.winrtUwp.Windows.Media

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
  
}


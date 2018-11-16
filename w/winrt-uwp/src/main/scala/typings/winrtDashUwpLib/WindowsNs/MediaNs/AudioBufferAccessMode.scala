package typings
package winrtDashUwpLib.WindowsNs.MediaNs

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
  sealed trait read
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioBufferAccessMode
  
  /** The audio buffer can be written to and read from. */
  @js.native
  sealed trait readWrite
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioBufferAccessMode
  
  /** The audio buffer is write-only. */
  @js.native
  sealed trait write
    extends winrtDashUwpLib.WindowsNs.MediaNs.AudioBufferAccessMode
  
  val read: read with java.lang.String = js.native
  val readWrite: readWrite with java.lang.String = js.native
  val write: write with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.MediaNs.AudioBufferAccessMode with java.lang.String] = js.native
}


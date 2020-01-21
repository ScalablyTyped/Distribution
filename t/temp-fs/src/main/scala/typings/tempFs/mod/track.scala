package typings.tempFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("temp-fs", "track")
@js.native
object track extends js.Object {
  /**
    * Use it to switch global files/directories tracking on or off.
    *
    * Turn it on if you don't want to manually delete everything. When it is
    * turned off, all recorded files and directories will not be removed but
    * still kept in case it is turned on again before the program exits.
    *
    * This switch does not affect manually tracked files through
    * {@link options#track}. They will be removed automatically on exit.
    *
    * <b>Note: When an uncaught exception occurs, all tracked temporary files
    * and directories will be removed no matter it is on or off.</b>
    */
  def apply(): Unit = js.native
  def apply(on: Boolean): Unit = js.native
}


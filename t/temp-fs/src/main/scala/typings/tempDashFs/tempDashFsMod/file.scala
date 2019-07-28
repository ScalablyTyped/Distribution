package typings.tempDashFs.tempDashFsMod

import typings.std.Error
import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tempfile.
  */
@js.native
trait file extends js.Object {
  /**
    * An integer file descriptor.
    */
  var fd: Number = js.native
  /**
    * The absolute path to the tempfile.
    */
  var path: String = js.native
  /**
    * A special function for you to delete the file.
    *
    * If the file is not tracked, it may throw when an error occurs or the
    * first argument of the callback function will be an Error object.
    *
    * @param callback makes it asynchronous.
    */
  def unlink(): js.Any = js.native
  def unlink(callback: js.Function1[/* error */ Error, _]): js.Any = js.native
}


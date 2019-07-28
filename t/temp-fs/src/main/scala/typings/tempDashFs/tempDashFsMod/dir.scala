package typings.tempDashFs.tempDashFsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tempdir.
  */
@js.native
trait dir extends js.Object {
  /**
    * The absolute path to the tempdir.
    */
  var path: String = js.native
  /**
    * Whether {@link dir#unlink} will remove the tempdir recursively.
    */
  var recursive: Boolean = js.native
  /**
    * A special function for you to remove the directory.
    *
    * If the directory is not tracked, it may throw when an error occurs or
    * the first argument of the callback function will be an Error object.
    *
    * @param callback makes it asynchronous.
    */
  def unlink(): js.Any = js.native
  def unlink(callback: js.Function1[/* error */ Error, _]): js.Any = js.native
}


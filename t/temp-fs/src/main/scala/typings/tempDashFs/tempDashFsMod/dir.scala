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

@JSImport("temp-fs", "dir")
@js.native
object dir extends js.Object {
  /**
    * Return the path of a system-provided tempdir as
    * <code>require('os').tmpdir()</code> does.
    *
    * You should not make any assumption about whether the path contains a
    * trailing path separator, or it is a real path. On most system it is not a
    * fixed path, and it can be changed by the user environment. When in doubt,
    * check it first.
    */
  def apply(): String = js.native
}


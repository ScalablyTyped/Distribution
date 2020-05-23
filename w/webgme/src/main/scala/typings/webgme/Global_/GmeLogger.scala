package typings.webgme.Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GmeLogger extends js.Object {
  def debug(fmt: String): Unit = js.native
  def debug(fmt: String, msg: String): Unit = js.native
  def error(fmt: String): Unit = js.native
  def error(fmt: String, msg: String): Unit = js.native
  /**
    Creates a new logger with the same settings
    and a name that is an augmentation of this logger and the
    provided string.
    If the second argument is true
    - the provided name will be used as is.
    */
  def fork(fmt: String): GmeLogger = js.native
  def fork(fmt: String, reuse: Boolean): GmeLogger = js.native
  def info(fmt: String): Unit = js.native
  def info(fmt: String, msg: String): Unit = js.native
  def warn(fmt: String): Unit = js.native
  def warn(fmt: String, msg: String): Unit = js.native
}


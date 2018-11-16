package typings
package webgmeLib.GlobalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GmeLogger extends js.Object {
  def debug(fmt: java.lang.String): scala.Unit = js.native
  def debug(fmt: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def error(fmt: java.lang.String): scala.Unit = js.native
  def error(fmt: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  /**
          Creates a new logger with the same settings
          and a name that is an augmentation of this logger and the
          provided string.
          If the second argument is true
          - the provided name will be used as is.
          */
  def fork(fmt: java.lang.String): GmeLogger = js.native
  /**
          Creates a new logger with the same settings
          and a name that is an augmentation of this logger and the
          provided string.
          If the second argument is true
          - the provided name will be used as is.
          */
  def fork(fmt: java.lang.String, reuse: scala.Boolean): GmeLogger = js.native
  def info(fmt: java.lang.String): scala.Unit = js.native
  def info(fmt: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def warn(fmt: java.lang.String): scala.Unit = js.native
  def warn(fmt: java.lang.String, msg: java.lang.String): scala.Unit = js.native
}


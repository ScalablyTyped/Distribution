package typings
package vscodeDashJsonrpcLib.vscodeDashJsonrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def error(message: java.lang.String): scala.Unit
  def info(message: java.lang.String): scala.Unit
  def log(message: java.lang.String): scala.Unit
  def warn(message: java.lang.String): scala.Unit
}

object Logger {
  @scala.inline
  def apply(
    error: java.lang.String => scala.Unit,
    info: java.lang.String => scala.Unit,
    log: java.lang.String => scala.Unit,
    warn: java.lang.String => scala.Unit
  ): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[Logger]
  }
}


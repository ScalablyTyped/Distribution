package typings.vscodeJsonrpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def error(message: String): Unit
  def info(message: String): Unit
  def log(message: String): Unit
  def warn(message: String): Unit
}

object Logger {
  @scala.inline
  def apply(error: String => Unit, info: String => Unit, log: String => Unit, warn: String => Unit): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), log = js.Any.fromFunction1(log), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[Logger]
  }
}


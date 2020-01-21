package typings.tslint.runnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def error(message: String): Unit
  def log(message: String): Unit
}

object Logger {
  @scala.inline
  def apply(error: String => Unit, log: String => Unit): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[Logger]
  }
}


package typings
package tslintLib.libRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  def error(message: java.lang.String): scala.Unit
  def log(message: java.lang.String): scala.Unit
}

object Logger {
  @scala.inline
  def apply(error: java.lang.String => scala.Unit, log: java.lang.String => scala.Unit): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), log = js.Any.fromFunction1(log))
  
    __obj.asInstanceOf[Logger]
  }
}


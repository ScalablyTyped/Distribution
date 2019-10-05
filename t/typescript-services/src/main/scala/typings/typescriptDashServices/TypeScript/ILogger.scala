package typings.typescriptDashServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogger extends js.Object {
  def debug(): Boolean
  def error(): Boolean
  def fatal(): Boolean
  def information(): Boolean
  def log(s: String): Unit
  def warning(): Boolean
}

object ILogger {
  @scala.inline
  def apply(
    debug: () => Boolean,
    error: () => Boolean,
    fatal: () => Boolean,
    information: () => Boolean,
    log: String => Unit,
    warning: () => Boolean
  ): ILogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), error = js.Any.fromFunction0(error), fatal = js.Any.fromFunction0(fatal), information = js.Any.fromFunction0(information), log = js.Any.fromFunction1(log), warning = js.Any.fromFunction0(warning))
  
    __obj.asInstanceOf[ILogger]
  }
}


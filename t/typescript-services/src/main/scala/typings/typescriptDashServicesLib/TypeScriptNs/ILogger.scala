package typings
package typescriptDashServicesLib.TypeScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogger extends js.Object {
  def debug(): scala.Boolean
  def error(): scala.Boolean
  def fatal(): scala.Boolean
  def information(): scala.Boolean
  def log(s: java.lang.String): scala.Unit
  def warning(): scala.Boolean
}

object ILogger {
  @scala.inline
  def apply(
    debug: () => scala.Boolean,
    error: () => scala.Boolean,
    fatal: () => scala.Boolean,
    information: () => scala.Boolean,
    log: java.lang.String => scala.Unit,
    warning: () => scala.Boolean
  ): ILogger = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction0(debug), error = js.Any.fromFunction0(error), fatal = js.Any.fromFunction0(fatal), information = js.Any.fromFunction0(information), log = js.Any.fromFunction1(log), warning = js.Any.fromFunction0(warning))
  
    __obj.asInstanceOf[ILogger]
  }
}


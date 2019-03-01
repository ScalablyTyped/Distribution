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
    error: js.Function1[java.lang.String, scala.Unit],
    info: js.Function1[java.lang.String, scala.Unit],
    log: js.Function1[java.lang.String, scala.Unit],
    warn: js.Function1[java.lang.String, scala.Unit]
  ): Logger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("log")(log)
    __obj.updateDynamic("warn")(warn)
    __obj.asInstanceOf[Logger]
  }
}


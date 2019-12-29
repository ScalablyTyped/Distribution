package typings.vegaDashUtil.vegaDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerInterface extends js.Object {
  def debug(args: js.Any*): LoggerInterface
  def error(args: js.Any*): LoggerInterface
  def info(args: js.Any*): LoggerInterface
  def level(_underscore: Double): Double | LoggerInterface
  def warn(args: js.Any*): LoggerInterface
}

object LoggerInterface {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => LoggerInterface,
    error: /* repeated */ js.Any => LoggerInterface,
    info: /* repeated */ js.Any => LoggerInterface,
    level: Double => Double | LoggerInterface,
    warn: /* repeated */ js.Any => LoggerInterface
  ): LoggerInterface = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), level = js.Any.fromFunction1(level), warn = js.Any.fromFunction1(warn))
  
    __obj.asInstanceOf[LoggerInterface]
  }
}


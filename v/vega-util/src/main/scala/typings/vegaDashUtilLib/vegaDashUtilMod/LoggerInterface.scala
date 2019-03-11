package typings
package vegaDashUtilLib.vegaDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerInterface extends js.Object {
  def debug(args: js.Any*): LoggerInterface
  def error(args: js.Any*): LoggerInterface
  def info(args: js.Any*): LoggerInterface
  def level(`_`: scala.Double): scala.Double | LoggerInterface
  def warn(args: js.Any*): LoggerInterface
}

object LoggerInterface {
  @scala.inline
  def apply(
    debug: js.Function1[/* repeated */ js.Any, LoggerInterface],
    error: js.Function1[/* repeated */ js.Any, LoggerInterface],
    info: js.Function1[/* repeated */ js.Any, LoggerInterface],
    level: js.Function1[scala.Double, scala.Double | LoggerInterface],
    warn: js.Function1[/* repeated */ js.Any, LoggerInterface]
  ): LoggerInterface = {
    val __obj = js.Dynamic.literal(debug = debug, error = error, info = info, level = level, warn = warn)
  
    __obj.asInstanceOf[LoggerInterface]
  }
}


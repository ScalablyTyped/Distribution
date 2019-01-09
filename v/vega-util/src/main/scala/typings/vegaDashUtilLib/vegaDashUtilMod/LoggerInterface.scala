package typings
package vegaDashUtilLib.vegaDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerInterface extends js.Object {
  def debug(args: js.Any*): LoggerInterface
  def info(args: js.Any*): LoggerInterface
  def level(`_`: scala.Double): scala.Double | LoggerInterface
  def warn(args: js.Any*): LoggerInterface
}


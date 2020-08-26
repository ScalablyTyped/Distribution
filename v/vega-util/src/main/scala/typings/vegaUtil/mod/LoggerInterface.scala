package typings.vegaUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoggerInterface extends js.Object {
  def debug(args: js.Any*): this.type = js.native
  def error(args: js.Any*): this.type = js.native
  def info(args: js.Any*): this.type = js.native
  def level(): Double = js.native
  def level(_underscore: Double): this.type = js.native
  def warn(args: js.Any*): this.type = js.native
}


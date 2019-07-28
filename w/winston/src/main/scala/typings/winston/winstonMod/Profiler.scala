package typings.winston.winstonMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profiler extends js.Object {
  var logger: Logger = js.native
  var start: Date = js.native
  def done(): Boolean = js.native
  def done(info: js.Any): Boolean = js.native
}


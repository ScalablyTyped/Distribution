package typings.winston.mod

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profiler extends js.Object {
  var logger: Logger = js.native
  var start: Number = js.native
  def done(): Boolean = js.native
  def done(info: js.Any): Boolean = js.native
}


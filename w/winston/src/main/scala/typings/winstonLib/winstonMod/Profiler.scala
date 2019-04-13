package typings
package winstonLib.winstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profiler extends js.Object {
  var logger: Logger = js.native
  var start: stdLib.Date = js.native
  def done(): scala.Boolean = js.native
  def done(info: js.Any): scala.Boolean = js.native
}


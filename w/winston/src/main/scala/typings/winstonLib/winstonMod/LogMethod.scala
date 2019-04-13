package typings
package winstonLib.winstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogMethod extends js.Object {
  def apply(entry: LogEntry): Logger = js.native
  def apply(level: java.lang.String, message: java.lang.String, callback: LogCallback): Logger = js.native
  def apply(level: java.lang.String, message: java.lang.String, meta: js.Any*): Logger = js.native
  def apply(level: java.lang.String, message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
}


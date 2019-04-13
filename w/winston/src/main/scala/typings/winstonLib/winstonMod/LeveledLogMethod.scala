package typings
package winstonLib.winstonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeveledLogMethod extends js.Object {
  def apply(infoObject: js.Object): Logger = js.native
  def apply(message: java.lang.String, callback: LogCallback): Logger = js.native
  def apply(message: java.lang.String, meta: js.Any*): Logger = js.native
  def apply(message: java.lang.String, meta: js.Any, callback: LogCallback): Logger = js.native
}


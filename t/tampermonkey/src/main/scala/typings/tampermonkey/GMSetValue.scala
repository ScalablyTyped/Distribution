package typings.tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_setValue")
@js.native
object GMSetValue extends js.Object {
  // Storage
  /** Sets the value of `name` to the storage */
  def apply(name: String, value: js.Any): Unit = js.native
}


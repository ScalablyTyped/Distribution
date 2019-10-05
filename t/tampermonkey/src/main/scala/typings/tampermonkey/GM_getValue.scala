package typings.tampermonkey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_getValue")
@js.native
object GM_getValue extends js.Object {
  /** Gets the value of 'name' from storage */
  def apply[TValue](name: String): TValue = js.native
  def apply[TValue](name: String, defaultValue: TValue): TValue = js.native
}


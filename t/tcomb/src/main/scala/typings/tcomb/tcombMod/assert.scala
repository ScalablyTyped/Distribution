package typings.tcomb.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tcomb", "assert")
@js.native
object assert extends js.Object {
  def apply(guard: Boolean): Unit = js.native
  def apply(guard: Boolean, message: String): Unit = js.native
  def apply(guard: Boolean, message: LazyMessage): Unit = js.native
}


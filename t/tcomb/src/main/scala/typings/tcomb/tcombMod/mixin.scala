package typings.tcomb.tcombMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tcomb", "mixin")
@js.native
object mixin extends js.Object {
  def apply[T, S](target: T, source: S): T with S = js.native
  def apply[T, S](target: T, source: S, overwrite: Boolean): T with S = js.native
}


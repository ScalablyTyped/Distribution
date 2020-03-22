package typings.xstate.jsonMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/json", "jsonify")
@js.native
object jsonify extends js.Object {
  def apply[T /* <: Record[String, _] */](value: T): T = js.native
}


package typings.superstruct.superstructMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "Kind")
@js.native
class Kind protected () extends js.Object {
  def this(
    name: String,
    `type`: String,
    validate: js.Function2[/* value */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any], js.Array[_]]
  ) = this()
  var name: String = js.native
  var `type`: String = js.native
  def validate(): js.Array[_] = js.native
  def validate(value: js.Any): js.Array[_] = js.native
  def validate(value: js.Any, data: js.Any): js.Array[_] = js.native
}


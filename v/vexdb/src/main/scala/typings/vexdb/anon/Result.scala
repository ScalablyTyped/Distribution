package typings.vexdb.anon

import typings.vexdb.responseObjectsMod.ResponseObject
import typings.vexdb.vexdbNumbers.`0`
import typings.vexdb.vexdbNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var result: js.Array[ResponseObject]
  var size: Double
  var status: `0` | `1`
}

object Result {
  @scala.inline
  def apply(result: js.Array[ResponseObject], size: Double, status: `0` | `1`): Result = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}


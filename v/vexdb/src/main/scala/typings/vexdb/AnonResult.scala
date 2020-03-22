package typings.vexdb

import typings.vexdb.vexdbNumbers.`0`
import typings.vexdb.vexdbNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResult[T] extends js.Object {
  var result: js.Array[T]
  var size: Double
  var status: `0` | `1`
}

object AnonResult {
  @scala.inline
  def apply[T](result: js.Array[T], size: Double, status: `0` | `1`): AnonResult[T] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResult[T]]
  }
}


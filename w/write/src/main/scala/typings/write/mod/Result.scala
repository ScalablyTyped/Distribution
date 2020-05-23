package typings.write.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result[T /* <: Data */] extends js.Object {
  var data: T
  var path: String
}

object Result {
  @scala.inline
  def apply[T](data: T, path: String): Result[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result[T]]
  }
}


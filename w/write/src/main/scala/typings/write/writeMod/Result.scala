package typings.write.writeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result[T /* <: Data */] extends js.Object {
  var data: T
  var path: String
}

object Result {
  @scala.inline
  def apply[T /* <: Data */](data: T, path: String): Result[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], path = path)
  
    __obj.asInstanceOf[Result[T]]
  }
}


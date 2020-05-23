package typings.urqlCore.anon

import typings.urqlCore.typesMod.OperationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var response: OperationResult[_]
  var typenames: js.Array[String]
}

object Response {
  @scala.inline
  def apply(response: OperationResult[_], typenames: js.Array[String]): Response = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], typenames = typenames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}


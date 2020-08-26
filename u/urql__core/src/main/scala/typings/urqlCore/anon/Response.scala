package typings.urqlCore.anon

import typings.urqlCore.typesMod.OperationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var response: OperationResult[_] = js.native
  var typenames: js.Array[String] = js.native
}

object Response {
  @scala.inline
  def apply(response: OperationResult[_], typenames: js.Array[String]): Response = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any], typenames = typenames.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResponse(value: OperationResult[_]): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypenamesVarargs(value: String*): Self = this.set("typenames", js.Array(value :_*))
    @scala.inline
    def setTypenames(value: js.Array[String]): Self = this.set("typenames", value.asInstanceOf[js.Any])
  }
  
}


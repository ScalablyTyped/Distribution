package typings.typedRestClient.restClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRestResponse[T] extends js.Object {
  var headers: js.Object = js.native
  var result: T | Null = js.native
  var statusCode: Double = js.native
}

object IRestResponse {
  @scala.inline
  def apply[T](headers: js.Object, statusCode: Double): IRestResponse[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRestResponse[T]]
  }
  @scala.inline
  implicit class IRestResponseOps[Self <: IRestResponse[_], T] (val x: Self with IRestResponse[T]) extends AnyVal {
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
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: T): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultNull: Self = this.set("result", null)
  }
  
}


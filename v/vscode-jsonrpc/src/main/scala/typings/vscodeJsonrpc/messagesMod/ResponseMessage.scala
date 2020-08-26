package typings.vscodeJsonrpc.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseMessage extends Message {
  /**
    * The error object in case a request fails.
    */
  var error: js.UndefOr[ResponseErrorLiteral[_]] = js.native
  /**
    * The request id.
    */
  var id: Double | String | Null = js.native
  /**
    * The result of a request. This member is REQUIRED on success.
    * This member MUST NOT exist if there was an error invoking the method.
    */
  var result: js.UndefOr[String | Double | Boolean | js.Object | Null] = js.native
}

object ResponseMessage {
  @scala.inline
  def apply(jsonrpc: String): ResponseMessage = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseMessage]
  }
  @scala.inline
  implicit class ResponseMessageOps[Self <: ResponseMessage] (val x: Self) extends AnyVal {
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
    def setError(value: ResponseErrorLiteral[_]): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setId(value: Double | String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    @scala.inline
    def setResult(value: String | Double | Boolean | js.Object): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setResultNull: Self = this.set("result", null)
  }
  
}


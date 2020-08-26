package typings.web3CoreHelpers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonRpcPayload extends js.Object {
  var id: js.UndefOr[String | Double] = js.native
  var jsonrpc: String = js.native
  var method: String = js.native
  var params: js.Array[_] = js.native
}

object JsonRpcPayload {
  @scala.inline
  def apply(jsonrpc: String, method: String, params: js.Array[_]): JsonRpcPayload = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonRpcPayload]
  }
  @scala.inline
  implicit class JsonRpcPayloadOps[Self <: JsonRpcPayload] (val x: Self) extends AnyVal {
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
    def setJsonrpc(value: String): Self = this.set("jsonrpc", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setParamsVarargs(value: js.Any*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: js.Array[_]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}


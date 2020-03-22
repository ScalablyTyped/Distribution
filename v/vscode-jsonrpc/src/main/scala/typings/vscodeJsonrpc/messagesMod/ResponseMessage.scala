package typings.vscodeJsonrpc.messagesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseMessage extends Message {
  /**
    * The error object in case a request fails.
    */
  var error: js.UndefOr[ResponseErrorLiteral[_]] = js.undefined
  /**
    * The request id.
    */
  var id: Double | String | Null
  /**
    * The result of a request. This member is REQUIRED on success.
    * This member MUST NOT exist if there was an error invoking the method.
    */
  var result: js.UndefOr[String | Double | Boolean | js.Object | Null] = js.undefined
}

object ResponseMessage {
  @scala.inline
  def apply(
    jsonrpc: String,
    error: ResponseErrorLiteral[_] = null,
    id: Double | String = null,
    result: String | Double | Boolean | js.Object = null
  ): ResponseMessage = {
    val __obj = js.Dynamic.literal(jsonrpc = jsonrpc.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseMessage]
  }
}


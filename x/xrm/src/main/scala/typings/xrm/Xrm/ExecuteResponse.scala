package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the WebAPI Execute request response
  */
trait ExecuteResponse extends js.Object {
  /**
    * (Optional). Object.Response body.
    */
  var body: String
  /**
    * Response headers.
    */
  var headers: js.Any
  /**
    * Indicates whether the request was successful.
    */
  var ok: Boolean
  /**
    * Numeric value in the response status code.
    * @example 200
    */
  var status: Double
  /**
    * Description of the response status code.
    * @example "OK"
    */
  var statusText: String
  /**
    * Response type.Values are: the empty string (default), "arraybuffer", "blob", "document", "json", and "text".
    */
  var `type`: String
  /**
    * Request URL of the action, function, or CRUD request that was sent to the Web API endpoint.
    */
  var url: String
}

object ExecuteResponse {
  @scala.inline
  def apply(
    body: String,
    headers: js.Any,
    ok: Boolean,
    status: Double,
    statusText: String,
    `type`: String,
    url: String
  ): ExecuteResponse = {
    val __obj = js.Dynamic.literal(body = body, headers = headers, ok = ok, status = status, statusText = statusText, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ExecuteResponse]
  }
}


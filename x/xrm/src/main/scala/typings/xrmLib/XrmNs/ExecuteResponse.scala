package typings
package xrmLib.XrmNs

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
  var body: java.lang.String
  /**
    * Response headers.
    */
  var headers: js.Any
  /**
    * Indicates whether the request was successful.
    */
  var ok: scala.Boolean
  /**
    * Numeric value in the response status code.
    * @example 200
    */
  var status: scala.Double
  /**
    * Description of the response status code.
    * @example "OK"
    */
  var statusText: java.lang.String
  /**
    * Response type.Values are: the empty string (default), "arraybuffer", "blob", "document", "json", and "text".
    */
  var `type`: java.lang.String
  /**
    * Request URL of the action, function, or CRUD request that was sent to the Web API endpoint.
    */
  var url: java.lang.String
}

object ExecuteResponse {
  @scala.inline
  def apply(
    body: java.lang.String,
    headers: js.Any,
    ok: scala.Boolean,
    status: scala.Double,
    statusText: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String
  ): ExecuteResponse = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("ok")(ok)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusText")(statusText)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ExecuteResponse]
  }
}


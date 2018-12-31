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


package typings
package vscodeDashJsonrpcLib.libMessagesMod

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
  var id: scala.Double | java.lang.String | scala.Null
  /**
    * The result of a request. This can be omitted in
    * the case of an error.
    */
  var result: js.UndefOr[js.Any] = js.undefined
}


package typings
package superagentLib.superagentMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseError
  extends stdLib.Error {
  var method: java.lang.String
  var path: java.lang.String
  var status: scala.Double
  var text: java.lang.String
}

object ResponseError {
  @scala.inline
  def apply(
    message: java.lang.String,
    method: java.lang.String,
    name: java.lang.String,
    path: java.lang.String,
    status: scala.Double,
    text: java.lang.String,
    stack: java.lang.String = null
  ): ResponseError = {
    val __obj = js.Dynamic.literal(message = message, method = method, name = name, path = path, status = status, text = text)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ResponseError]
  }
}


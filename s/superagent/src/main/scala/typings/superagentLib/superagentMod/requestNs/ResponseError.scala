package typings
package superagentLib.superagentMod.requestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseError
  extends nodeLib.Error {
  var method: java.lang.String
  var path: java.lang.String
  var status: scala.Double
  var text: java.lang.String
}

object ResponseError {
  @scala.inline
  def apply(
    method: java.lang.String,
    path: java.lang.String,
    status: scala.Double,
    text: java.lang.String,
    stack: java.lang.String = null
  ): ResponseError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("text")(text)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ResponseError]
  }
}


package typings
package webDashPushLib.webDashPushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendResult extends js.Object {
  var body: java.lang.String
  var headers: Headers
  var statusCode: scala.Double
}

object SendResult {
  @scala.inline
  def apply(body: java.lang.String, headers: Headers, statusCode: scala.Double): SendResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[SendResult]
  }
}


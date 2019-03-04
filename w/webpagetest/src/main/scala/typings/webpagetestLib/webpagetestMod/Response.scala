package typings
package webpagetestLib.webpagetestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[R] extends js.Object {
  var data: R
  var statusCode: scala.Double
  var statusText: java.lang.String
}

object Response {
  @scala.inline
  def apply[R](data: R, statusCode: scala.Double, statusText: java.lang.String): Response[R] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], statusCode = statusCode, statusText = statusText)
  
    __obj.asInstanceOf[Response[R]]
  }
}


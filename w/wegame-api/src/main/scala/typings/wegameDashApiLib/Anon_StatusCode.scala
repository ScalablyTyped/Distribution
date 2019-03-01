package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_StatusCode extends js.Object {
  var statusCode: scala.Double
  var tempFilePath: java.lang.String
}

object Anon_StatusCode {
  @scala.inline
  def apply(statusCode: scala.Double, tempFilePath: java.lang.String): Anon_StatusCode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.updateDynamic("tempFilePath")(tempFilePath)
    __obj.asInstanceOf[Anon_StatusCode]
  }
}


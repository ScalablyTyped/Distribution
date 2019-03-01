package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataStatusCode extends js.Object {
  var data: java.lang.String
  var statusCode: scala.Double
}

object Anon_DataStatusCode {
  @scala.inline
  def apply(data: java.lang.String, statusCode: scala.Double): Anon_DataStatusCode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[Anon_DataStatusCode]
  }
}


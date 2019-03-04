package typings
package wegameDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataHeader extends js.Object {
  var data: js.Any
  var header: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var statusCode: scala.Double
}

object Anon_DataHeader {
  @scala.inline
  def apply(
    data: js.Any,
    statusCode: scala.Double,
    header: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Anon_DataHeader = {
    val __obj = js.Dynamic.literal(data = data, statusCode = statusCode)
    if (header != null) __obj.updateDynamic("header")(header)
    __obj.asInstanceOf[Anon_DataHeader]
  }
}


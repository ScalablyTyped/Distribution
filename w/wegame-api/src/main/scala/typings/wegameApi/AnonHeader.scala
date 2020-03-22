package typings.wegameApi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeader extends js.Object {
  var data: js.Any
  var header: js.UndefOr[StringDictionary[String]] = js.undefined
  var statusCode: Double
}

object AnonHeader {
  @scala.inline
  def apply(data: js.Any, statusCode: Double, header: StringDictionary[String] = null): AnonHeader = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeader]
  }
}


package typings.wegameApi.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var data: js.Any
  var header: js.UndefOr[StringDictionary[String]] = js.undefined
  var statusCode: Double
}

object Header {
  @scala.inline
  def apply(data: js.Any, statusCode: Double, header: StringDictionary[String] = null): Header = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}


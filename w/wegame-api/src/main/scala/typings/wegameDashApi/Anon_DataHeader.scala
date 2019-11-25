package typings.wegameDashApi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataHeader extends js.Object {
  var data: js.Any
  var header: js.UndefOr[StringDictionary[String]] = js.undefined
  var statusCode: Double
}

object Anon_DataHeader {
  @scala.inline
  def apply(data: js.Any, statusCode: Double, header: StringDictionary[String] = null): Anon_DataHeader = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataHeader]
  }
}


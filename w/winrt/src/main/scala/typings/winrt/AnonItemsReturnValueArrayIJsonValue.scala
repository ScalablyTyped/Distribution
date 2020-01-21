package typings.winrt

import typings.winrt.Windows.Data.Json.IJsonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsReturnValueArrayIJsonValue extends js.Object {
  var items: js.Array[IJsonValue]
  var returnValue: Double
}

object AnonItemsReturnValueArrayIJsonValue {
  @scala.inline
  def apply(items: js.Array[IJsonValue], returnValue: Double): AnonItemsReturnValueArrayIJsonValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsReturnValueArrayIJsonValue]
  }
}


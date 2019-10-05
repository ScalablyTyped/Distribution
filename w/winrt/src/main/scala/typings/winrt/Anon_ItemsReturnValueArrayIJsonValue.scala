package typings.winrt

import typings.winrt.Windows.Data.Json.IJsonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArrayIJsonValue extends js.Object {
  var items: js.Array[IJsonValue]
  var returnValue: Double
}

object Anon_ItemsReturnValueArrayIJsonValue {
  @scala.inline
  def apply(items: js.Array[IJsonValue], returnValue: Double): Anon_ItemsReturnValueArrayIJsonValue = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueArrayIJsonValue]
  }
}


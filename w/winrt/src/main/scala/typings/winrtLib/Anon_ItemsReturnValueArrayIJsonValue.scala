package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArrayIJsonValue extends js.Object {
  var items: js.Array[winrtLib.WindowsNs.DataNs.JsonNs.IJsonValue]
  var returnValue: scala.Double
}

object Anon_ItemsReturnValueArrayIJsonValue {
  @scala.inline
  def apply(items: js.Array[winrtLib.WindowsNs.DataNs.JsonNs.IJsonValue], returnValue: scala.Double): Anon_ItemsReturnValueArrayIJsonValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueArrayIJsonValue]
  }
}


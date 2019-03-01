package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValue extends js.Object {
  var items: js.Array[winrtLib.WindowsNs.FoundationNs.IWwwFormUrlDecoderEntry]
  var returnValue: scala.Double
}

object Anon_ItemsReturnValue {
  @scala.inline
  def apply(
    items: js.Array[winrtLib.WindowsNs.FoundationNs.IWwwFormUrlDecoderEntry],
    returnValue: scala.Double
  ): Anon_ItemsReturnValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValue]
  }
}


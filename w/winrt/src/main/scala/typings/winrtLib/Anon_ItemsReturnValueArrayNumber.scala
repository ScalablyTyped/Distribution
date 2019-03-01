package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArrayNumber extends js.Object {
  var items: js.Array[winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceQualifier]
  var returnValue: scala.Double
}

object Anon_ItemsReturnValueArrayNumber {
  @scala.inline
  def apply(
    items: js.Array[winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceQualifier],
    returnValue: scala.Double
  ): Anon_ItemsReturnValueArrayNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueArrayNumber]
  }
}


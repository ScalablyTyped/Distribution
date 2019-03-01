package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArrayNumberResourceCandidate extends js.Object {
  var items: js.Array[winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceCandidate]
  var returnValue: scala.Double
}

object Anon_ItemsReturnValueArrayNumberResourceCandidate {
  @scala.inline
  def apply(
    items: js.Array[winrtLib.WindowsNs.ApplicationModelNs.ResourcesNs.CoreNs.ResourceCandidate],
    returnValue: scala.Double
  ): Anon_ItemsReturnValueArrayNumberResourceCandidate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueArrayNumberResourceCandidate]
  }
}


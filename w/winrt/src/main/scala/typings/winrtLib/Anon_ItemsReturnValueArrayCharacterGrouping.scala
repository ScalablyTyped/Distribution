package typings
package winrtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArrayCharacterGrouping extends js.Object {
  var items: js.Array[winrtLib.WindowsNs.GlobalizationNs.CollationNs.CharacterGrouping]
  var returnValue: scala.Double
}

object Anon_ItemsReturnValueArrayCharacterGrouping {
  @scala.inline
  def apply(
    items: js.Array[winrtLib.WindowsNs.GlobalizationNs.CollationNs.CharacterGrouping],
    returnValue: scala.Double
  ): Anon_ItemsReturnValueArrayCharacterGrouping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueArrayCharacterGrouping]
  }
}


package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueCharacterGrouping extends js.Object {
  /** The CharacterGrouping objects in the set that start at startIndex. */ var items: winrtDashUwpLib.WindowsNs.GlobalizationNs.CollationNs.CharacterGrouping
  /** The number of objects returned. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueCharacterGrouping {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.GlobalizationNs.CollationNs.CharacterGrouping,
    returnValue: scala.Double
  ): Anon_ItemsReturnValueCharacterGrouping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[Anon_ItemsReturnValueCharacterGrouping]
  }
}


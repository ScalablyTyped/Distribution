package typings
package winrtLib.WindowsNs.GlobalizationNs.CollationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICharacterGrouping extends js.Object {
  var first: java.lang.String
  var label: java.lang.String
}

object ICharacterGrouping {
  @scala.inline
  def apply(first: java.lang.String, label: java.lang.String): ICharacterGrouping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("label")(label)
    __obj.asInstanceOf[ICharacterGrouping]
  }
}


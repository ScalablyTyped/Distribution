package typings.winrtUwp

import typings.winrtUwp.Windows.Globalization.Collation.CharacterGrouping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsReturnValueCharacterGrouping extends js.Object {
  /** The CharacterGrouping objects in the set that start at startIndex. */ var items: CharacterGrouping
  /** The number of objects returned. */ var returnValue: Double
}

object AnonItemsReturnValueCharacterGrouping {
  @scala.inline
  def apply(items: CharacterGrouping, returnValue: Double): AnonItemsReturnValueCharacterGrouping = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsReturnValueCharacterGrouping]
  }
}


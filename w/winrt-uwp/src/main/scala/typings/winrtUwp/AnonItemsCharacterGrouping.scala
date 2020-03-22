package typings.winrtUwp

import typings.winrtUwp.Windows.Globalization.Collation.CharacterGrouping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsCharacterGrouping extends js.Object {
  /** The CharacterGrouping objects in the set that start at startIndex. */ var items: CharacterGrouping
  /** The number of objects returned. */ var returnValue: Double
}

object AnonItemsCharacterGrouping {
  @scala.inline
  def apply(items: CharacterGrouping, returnValue: Double): AnonItemsCharacterGrouping = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsCharacterGrouping]
  }
}


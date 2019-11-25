package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Globalization.Collation.CharacterGrouping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueCharacterGrouping extends js.Object {
  /** The CharacterGrouping objects in the set that start at startIndex. */ var items: CharacterGrouping
  /** The number of objects returned. */ var returnValue: Double
}

object Anon_ItemsReturnValueCharacterGrouping {
  @scala.inline
  def apply(items: CharacterGrouping, returnValue: Double): Anon_ItemsReturnValueCharacterGrouping = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ItemsReturnValueCharacterGrouping]
  }
}


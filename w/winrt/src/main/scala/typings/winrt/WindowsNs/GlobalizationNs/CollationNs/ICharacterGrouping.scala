package typings.winrt.WindowsNs.GlobalizationNs.CollationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICharacterGrouping extends js.Object {
  var first: String
  var label: String
}

object ICharacterGrouping {
  @scala.inline
  def apply(first: String, label: String): ICharacterGrouping = {
    val __obj = js.Dynamic.literal(first = first, label = label)
  
    __obj.asInstanceOf[ICharacterGrouping]
  }
}


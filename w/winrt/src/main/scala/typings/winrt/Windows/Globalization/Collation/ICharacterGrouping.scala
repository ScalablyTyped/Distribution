package typings.winrt.Windows.Globalization.Collation

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
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICharacterGrouping]
  }
}


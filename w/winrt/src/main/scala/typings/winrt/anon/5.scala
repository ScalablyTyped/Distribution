package typings.winrt.anon

import typings.winrt.Windows.Globalization.Collation.CharacterGrouping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `5` extends js.Object {
  var items: js.Array[CharacterGrouping]
  var returnValue: Double
}

object `5` {
  @scala.inline
  def apply(items: js.Array[CharacterGrouping], returnValue: Double): `5` = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
}


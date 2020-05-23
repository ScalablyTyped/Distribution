package typings.winrt.anon

import typings.winrt.Windows.Storage.Search.SortEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `9` extends js.Object {
  var items: js.Array[SortEntry]
  var returnValue: Double
}

object `9` {
  @scala.inline
  def apply(items: js.Array[SortEntry], returnValue: Double): `9` = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`]
  }
}


package typings.winrt

import typings.winrt.Windows.Storage.Search.SortEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsReturnValueArrayNumberSortEntry extends js.Object {
  var items: js.Array[SortEntry]
  var returnValue: Double
}

object AnonItemsReturnValueArrayNumberSortEntry {
  @scala.inline
  def apply(items: js.Array[SortEntry], returnValue: Double): AnonItemsReturnValueArrayNumberSortEntry = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsReturnValueArrayNumberSortEntry]
  }
}


package typings.winrt

import typings.winrt.Windows.Storage.Search.SortEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueArrayNumberSortEntry extends js.Object {
  var items: js.Array[SortEntry]
  var returnValue: Double
}

object Anon_ItemsReturnValueArrayNumberSortEntry {
  @scala.inline
  def apply(items: js.Array[SortEntry], returnValue: Double): Anon_ItemsReturnValueArrayNumberSortEntry = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ItemsReturnValueArrayNumberSortEntry]
  }
}


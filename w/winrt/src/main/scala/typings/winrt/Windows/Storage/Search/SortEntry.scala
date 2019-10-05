package typings.winrt.Windows.Storage.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortEntry extends js.Object {
  var ascendingOrder: Boolean
  var propertyName: String
}

object SortEntry {
  @scala.inline
  def apply(ascendingOrder: Boolean, propertyName: String): SortEntry = {
    val __obj = js.Dynamic.literal(ascendingOrder = ascendingOrder, propertyName = propertyName)
  
    __obj.asInstanceOf[SortEntry]
  }
}


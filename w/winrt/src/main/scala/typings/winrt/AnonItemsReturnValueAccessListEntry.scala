package typings.winrt

import typings.winrt.Windows.Storage.AccessCache.AccessListEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsReturnValueAccessListEntry extends js.Object {
  var items: js.Array[AccessListEntry]
  var returnValue: Double
}

object AnonItemsReturnValueAccessListEntry {
  @scala.inline
  def apply(items: js.Array[AccessListEntry], returnValue: Double): AnonItemsReturnValueAccessListEntry = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsReturnValueAccessListEntry]
  }
}


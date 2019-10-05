package typings.winrt

import typings.winrt.Windows.Storage.AccessCache.AccessListEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueAccessListEntry extends js.Object {
  var items: js.Array[AccessListEntry]
  var returnValue: Double
}

object Anon_ItemsReturnValueAccessListEntry {
  @scala.inline
  def apply(items: js.Array[AccessListEntry], returnValue: Double): Anon_ItemsReturnValueAccessListEntry = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueAccessListEntry]
  }
}


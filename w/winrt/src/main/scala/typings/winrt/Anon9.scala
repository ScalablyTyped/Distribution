package typings.winrt

import typings.winrt.Windows.Storage.Search.SortEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon9 extends js.Object {
  var items: js.Array[SortEntry]
  var returnValue: Double
}

object Anon9 {
  @scala.inline
  def apply(items: js.Array[SortEntry], returnValue: Double): Anon9 = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon9]
  }
}


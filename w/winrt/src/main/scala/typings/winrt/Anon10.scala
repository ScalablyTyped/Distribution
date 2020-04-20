package typings.winrt

import typings.winrt.Windows.Storage.AccessCache.AccessListEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon10 extends js.Object {
  var items: js.Array[AccessListEntry]
  var returnValue: Double
}

object Anon10 {
  @scala.inline
  def apply(items: js.Array[AccessListEntry], returnValue: Double): Anon10 = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon10]
  }
}


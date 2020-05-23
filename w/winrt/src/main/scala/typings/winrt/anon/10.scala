package typings.winrt.anon

import typings.winrt.Windows.Storage.AccessCache.AccessListEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `10` extends js.Object {
  var items: js.Array[AccessListEntry]
  var returnValue: Double
}

object `10` {
  @scala.inline
  def apply(items: js.Array[AccessListEntry], returnValue: Double): `10` = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
}


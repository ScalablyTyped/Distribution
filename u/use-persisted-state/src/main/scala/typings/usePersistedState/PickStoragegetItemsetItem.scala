package typings.usePersistedState

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<std.Storage, 'getItem' | 'setItem'> */
trait PickStoragegetItemsetItem extends js.Object {
  var getItem: js.Function1[/* key */ String, String | Null]
  var setItem: js.Function2[/* key */ String, /* value */ String, Unit]
}

object PickStoragegetItemsetItem {
  @scala.inline
  def apply(
    getItem: /* key */ String => String | Null,
    setItem: (/* key */ String, /* value */ String) => Unit
  ): PickStoragegetItemsetItem = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[PickStoragegetItemsetItem]
  }
}


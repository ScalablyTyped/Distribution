package typings.wordpressData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<std.Storage, 'getItem' | 'setItem'> & std.Partial<std.Storage> */
trait PickStoragegetItemsetItem extends js.Object {
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  var getItem: js.UndefOr[js.Function1[/* key */ String, String | Null]] = js.undefined
  var key: js.UndefOr[js.Function1[/* index */ Double, String | Null]] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var removeItem: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
  var setItem: js.UndefOr[js.Function2[/* key */ String, /* value */ String, Unit]] = js.undefined
}

object PickStoragegetItemsetItem {
  @scala.inline
  def apply(
    clear: () => Unit = null,
    getItem: /* key */ String => String | Null = null,
    key: /* index */ Double => String | Null = null,
    length: Int | Double = null,
    removeItem: /* key */ String => Unit = null,
    setItem: (/* key */ String, /* value */ String) => Unit = null
  ): PickStoragegetItemsetItem = {
    val __obj = js.Dynamic.literal()
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction0(clear))
    if (getItem != null) __obj.updateDynamic("getItem")(js.Any.fromFunction1(getItem))
    if (key != null) __obj.updateDynamic("key")(js.Any.fromFunction1(key))
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (removeItem != null) __obj.updateDynamic("removeItem")(js.Any.fromFunction1(removeItem))
    if (setItem != null) __obj.updateDynamic("setItem")(js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[PickStoragegetItemsetItem]
  }
}


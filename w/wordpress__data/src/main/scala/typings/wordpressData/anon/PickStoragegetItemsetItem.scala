package typings.wordpressData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<std.Storage, 'getItem' | 'setItem'> & std.Partial<std.Storage> */
@js.native
trait PickStoragegetItemsetItem extends js.Object {
  var clear: js.UndefOr[js.Function0[Unit]] = js.native
  var getItem: (js.Function1[/* key */ String, String | Null]) with (js.UndefOr[js.Function1[/* key */ String, String | Null]]) = js.native
  var key: js.UndefOr[js.Function1[/* index */ Double, String | Null]] = js.native
  var length: js.UndefOr[Double] = js.native
  var removeItem: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.native
  var setItem: (js.Function2[/* key */ String, /* value */ String, Unit]) with (js.UndefOr[js.Function2[/* key */ String, /* value */ String, Unit]]) = js.native
}

object PickStoragegetItemsetItem {
  @scala.inline
  def apply(
    getItem: (js.Function1[/* key */ String, String | Null]) with (js.UndefOr[js.Function1[/* key */ String, String | Null]]),
    setItem: (js.Function2[/* key */ String, /* value */ String, Unit]) with (js.UndefOr[js.Function2[/* key */ String, /* value */ String, Unit]])
  ): PickStoragegetItemsetItem = {
    val __obj = js.Dynamic.literal(getItem = getItem.asInstanceOf[js.Any], setItem = setItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickStoragegetItemsetItem]
  }
  @scala.inline
  implicit class PickStoragegetItemsetItemOps[Self <: PickStoragegetItemsetItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetItem(
      value: (js.Function1[/* key */ String, String | Null]) with (js.UndefOr[js.Function1[/* key */ String, String | Null]])
    ): Self = this.set("getItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetItem(
      value: (js.Function2[/* key */ String, /* value */ String, Unit]) with (js.UndefOr[js.Function2[/* key */ String, /* value */ String, Unit]])
    ): Self = this.set("setItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setKey(value: /* index */ Double => String | Null): Self = this.set("key", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setRemoveItem(value: /* key */ String => Unit): Self = this.set("removeItem", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRemoveItem: Self = this.set("removeItem", js.undefined)
  }
  
}


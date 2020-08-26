package typings.usePersistedState.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<std.Storage, 'getItem' | 'setItem'> */
@js.native
trait PickStoragegetItemsetItem extends js.Object {
  var getItem: js.Function1[/* key */ String, String | Null] = js.native
  var setItem: js.Function2[/* key */ String, /* value */ String, Unit] = js.native
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
    def setGetItem(value: /* key */ String => String | Null): Self = this.set("getItem", js.Any.fromFunction1(value))
    @scala.inline
    def setSetItem(value: (/* key */ String, /* value */ String) => Unit): Self = this.set("setItem", js.Any.fromFunction2(value))
  }
  
}


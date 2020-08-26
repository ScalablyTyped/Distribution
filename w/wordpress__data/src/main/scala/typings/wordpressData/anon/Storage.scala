package typings.wordpressData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Storage extends js.Object {
  var storage: js.UndefOr[PickStoragegetItemsetItem] = js.native
  var storageKey: js.UndefOr[String] = js.native
}

object Storage {
  @scala.inline
  def apply(): Storage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Storage]
  }
  @scala.inline
  implicit class StorageOps[Self <: Storage] (val x: Self) extends AnyVal {
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
    def setStorage(value: PickStoragegetItemsetItem): Self = this.set("storage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage: Self = this.set("storage", js.undefined)
    @scala.inline
    def setStorageKey(value: String): Self = this.set("storageKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageKey: Self = this.set("storageKey", js.undefined)
  }
  
}


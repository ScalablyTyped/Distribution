package typings.wordpressData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage extends js.Object {
  var storage: js.UndefOr[PickStoragegetItemsetItem] = js.undefined
  var storageKey: js.UndefOr[String] = js.undefined
}

object Storage {
  @scala.inline
  def apply(storage: PickStoragegetItemsetItem = null, storageKey: String = null): Storage = {
    val __obj = js.Dynamic.literal()
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Storage]
  }
}


package typings.wordpressData

import typings.std.Partial
import typings.std.Pick
import typings.std.Storage
import typings.wordpressData.wordpressDataStrings.getItem
import typings.wordpressData.wordpressDataStrings.setItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetItem extends js.Object {
  var storage: js.UndefOr[(Pick[Storage, getItem | setItem]) with Partial[Storage]] = js.undefined
  var storageKey: js.UndefOr[String] = js.undefined
}

object AnonGetItem {
  @scala.inline
  def apply(
    storage: (Pick[Storage, getItem | setItem]) with Partial[Storage] = null,
    storageKey: String = null
  ): AnonGetItem = {
    val __obj = js.Dynamic.literal()
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGetItem]
  }
}


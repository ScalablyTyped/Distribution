package typings.atWordpressData

import typings.atWordpressData.atWordpressDataStrings.getItem
import typings.atWordpressData.atWordpressDataStrings.setItem
import typings.std.Partial
import typings.std.Pick
import typings.std.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GetItem extends js.Object {
  var storage: js.UndefOr[(Pick[Storage, getItem | setItem]) with Partial[Storage]] = js.undefined
  var storageKey: js.UndefOr[String] = js.undefined
}

object Anon_GetItem {
  @scala.inline
  def apply(
    storage: (Pick[Storage, getItem | setItem]) with Partial[Storage] = null,
    storageKey: String = null
  ): Anon_GetItem = {
    val __obj = js.Dynamic.literal()
    if (storage != null) __obj.updateDynamic("storage")(storage.asInstanceOf[js.Any])
    if (storageKey != null) __obj.updateDynamic("storageKey")(storageKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GetItem]
  }
}


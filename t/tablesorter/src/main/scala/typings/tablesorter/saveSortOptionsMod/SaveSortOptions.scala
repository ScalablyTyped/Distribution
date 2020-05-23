package typings.tablesorter.saveSortOptionsMod

import typings.tablesorter.storageTypeMod.StorageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveSortOptions extends js.Object {
  /**
    * A value indicating whether the sorting should be saved locally.
    */
  var saveSort: js.UndefOr[Boolean] = js.undefined
  /**
    * A url to a table for grouping settings together.
    */
  var storage_fixedUrl: js.UndefOr[String] = js.undefined
  /**
    * The name of the data-attribute to obtain an id for the table which allows grouping multiple tables together.
    */
  var storage_group: js.UndefOr[String] = js.undefined
  /**
    * The name of the data-attribute to obtain a table url which allows grouping tables together across pages.
    */
  var storage_page: js.UndefOr[String] = js.undefined
  /**
    * The storage-type to use.
    */
  var storage_storageType: js.UndefOr[StorageType] = js.undefined
  /**
    * The id of the `saveSort`-settings.
    */
  var storage_tableId: js.UndefOr[String] = js.undefined
}

object SaveSortOptions {
  @scala.inline
  def apply(
    saveSort: js.UndefOr[Boolean] = js.undefined,
    storage_fixedUrl: String = null,
    storage_group: String = null,
    storage_page: String = null,
    storage_storageType: StorageType = null,
    storage_tableId: String = null
  ): SaveSortOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(saveSort)) __obj.updateDynamic("saveSort")(saveSort.get.asInstanceOf[js.Any])
    if (storage_fixedUrl != null) __obj.updateDynamic("storage_fixedUrl")(storage_fixedUrl.asInstanceOf[js.Any])
    if (storage_group != null) __obj.updateDynamic("storage_group")(storage_group.asInstanceOf[js.Any])
    if (storage_page != null) __obj.updateDynamic("storage_page")(storage_page.asInstanceOf[js.Any])
    if (storage_storageType != null) __obj.updateDynamic("storage_storageType")(storage_storageType.asInstanceOf[js.Any])
    if (storage_tableId != null) __obj.updateDynamic("storage_tableId")(storage_tableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveSortOptions]
  }
}


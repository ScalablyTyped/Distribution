package typings.tablesorter.saveSortOptionsMod

import typings.tablesorter.storageTypeMod.StorageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveSortOptions extends js.Object {
  /**
    * A value indicating whether the sorting should be saved locally.
    */
  var saveSort: js.UndefOr[Boolean] = js.native
  /**
    * A url to a table for grouping settings together.
    */
  var storage_fixedUrl: js.UndefOr[String] = js.native
  /**
    * The name of the data-attribute to obtain an id for the table which allows grouping multiple tables together.
    */
  var storage_group: js.UndefOr[String] = js.native
  /**
    * The name of the data-attribute to obtain a table url which allows grouping tables together across pages.
    */
  var storage_page: js.UndefOr[String] = js.native
  /**
    * The storage-type to use.
    */
  var storage_storageType: js.UndefOr[StorageType] = js.native
  /**
    * The id of the `saveSort`-settings.
    */
  var storage_tableId: js.UndefOr[String] = js.native
}

object SaveSortOptions {
  @scala.inline
  def apply(): SaveSortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveSortOptions]
  }
  @scala.inline
  implicit class SaveSortOptionsOps[Self <: SaveSortOptions] (val x: Self) extends AnyVal {
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
    def setSaveSort(value: Boolean): Self = this.set("saveSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaveSort: Self = this.set("saveSort", js.undefined)
    @scala.inline
    def setStorage_fixedUrl(value: String): Self = this.set("storage_fixedUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage_fixedUrl: Self = this.set("storage_fixedUrl", js.undefined)
    @scala.inline
    def setStorage_group(value: String): Self = this.set("storage_group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage_group: Self = this.set("storage_group", js.undefined)
    @scala.inline
    def setStorage_page(value: String): Self = this.set("storage_page", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage_page: Self = this.set("storage_page", js.undefined)
    @scala.inline
    def setStorage_storageType(value: StorageType): Self = this.set("storage_storageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage_storageType: Self = this.set("storage_storageType", js.undefined)
    @scala.inline
    def setStorage_tableId(value: String): Self = this.set("storage_tableId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorage_tableId: Self = this.set("storage_tableId", js.undefined)
  }
  
}


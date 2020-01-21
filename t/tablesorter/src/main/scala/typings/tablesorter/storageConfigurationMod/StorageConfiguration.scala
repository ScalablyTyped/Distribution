package typings.tablesorter.storageConfigurationMod

import typings.tablesorter.storageTypeMod.StorageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageConfiguration extends js.Object {
  /**
    * The `data-attribute`-name to automatically get the id of the table from.
    */
  var group: js.UndefOr[String] = js.undefined
  /**
    * The id of the storage to save to.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The `data-attribute`-name to automatically get the url of the table from.
    */
  var page: js.UndefOr[String] = js.undefined
  /**
    * The medium to save the storage to.
    */
  var storageType: js.UndefOr[StorageType] = js.undefined
  /**
    * The url to save the storage to.
    */
  var url: js.UndefOr[String] = js.undefined
}

object StorageConfiguration {
  @scala.inline
  def apply(
    group: String = null,
    id: String = null,
    page: String = null,
    storageType: StorageType = null,
    url: String = null
  ): StorageConfiguration = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (storageType != null) __obj.updateDynamic("storageType")(storageType.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageConfiguration]
  }
}


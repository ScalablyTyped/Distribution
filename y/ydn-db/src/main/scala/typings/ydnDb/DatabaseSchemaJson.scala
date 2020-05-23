package typings.ydnDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseSchemaJson extends js.Object {
  var fullTextCatalogs: js.UndefOr[js.Array[FullTextCatalog]] = js.undefined
  var stores: js.Array[StoreSchemaJson]
  var version: js.UndefOr[Double] = js.undefined
}

object DatabaseSchemaJson {
  @scala.inline
  def apply(
    stores: js.Array[StoreSchemaJson],
    fullTextCatalogs: js.Array[FullTextCatalog] = null,
    version: js.UndefOr[Double] = js.undefined
  ): DatabaseSchemaJson = {
    val __obj = js.Dynamic.literal(stores = stores.asInstanceOf[js.Any])
    if (fullTextCatalogs != null) __obj.updateDynamic("fullTextCatalogs")(fullTextCatalogs.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseSchemaJson]
  }
}


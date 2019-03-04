package typings
package ydnDashDbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabaseSchemaJson extends js.Object {
  var fullTextCatalogs: js.UndefOr[js.Array[FullTextCatalog]] = js.undefined
  var stores: js.Array[StoreSchemaJson]
  var version: js.UndefOr[scala.Double] = js.undefined
}

object DatabaseSchemaJson {
  @scala.inline
  def apply(
    stores: js.Array[StoreSchemaJson],
    fullTextCatalogs: js.Array[FullTextCatalog] = null,
    version: scala.Int | scala.Double = null
  ): DatabaseSchemaJson = {
    val __obj = js.Dynamic.literal(stores = stores)
    if (fullTextCatalogs != null) __obj.updateDynamic("fullTextCatalogs")(fullTextCatalogs)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseSchemaJson]
  }
}


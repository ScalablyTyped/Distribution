package typings.ydnDb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseSchemaJson extends js.Object {
  var fullTextCatalogs: js.UndefOr[js.Array[FullTextCatalog]] = js.native
  var stores: js.Array[StoreSchemaJson] = js.native
  var version: js.UndefOr[Double] = js.native
}

object DatabaseSchemaJson {
  @scala.inline
  def apply(stores: js.Array[StoreSchemaJson]): DatabaseSchemaJson = {
    val __obj = js.Dynamic.literal(stores = stores.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseSchemaJson]
  }
  @scala.inline
  implicit class DatabaseSchemaJsonOps[Self <: DatabaseSchemaJson] (val x: Self) extends AnyVal {
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
    def setStoresVarargs(value: StoreSchemaJson*): Self = this.set("stores", js.Array(value :_*))
    @scala.inline
    def setStores(value: js.Array[StoreSchemaJson]): Self = this.set("stores", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullTextCatalogsVarargs(value: FullTextCatalog*): Self = this.set("fullTextCatalogs", js.Array(value :_*))
    @scala.inline
    def setFullTextCatalogs(value: js.Array[FullTextCatalog]): Self = this.set("fullTextCatalogs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullTextCatalogs: Self = this.set("fullTextCatalogs", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}


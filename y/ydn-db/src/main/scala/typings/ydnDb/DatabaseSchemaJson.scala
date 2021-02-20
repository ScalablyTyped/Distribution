package typings.ydnDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseSchemaJson extends StObject {
  
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
  implicit class DatabaseSchemaJsonMutableBuilder[Self <: DatabaseSchemaJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullTextCatalogs(value: js.Array[FullTextCatalog]): Self = StObject.set(x, "fullTextCatalogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullTextCatalogsUndefined: Self = StObject.set(x, "fullTextCatalogs", js.undefined)
    
    @scala.inline
    def setFullTextCatalogsVarargs(value: FullTextCatalog*): Self = StObject.set(x, "fullTextCatalogs", js.Array(value :_*))
    
    @scala.inline
    def setStores(value: js.Array[StoreSchemaJson]): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoresVarargs(value: StoreSchemaJson*): Self = StObject.set(x, "stores", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

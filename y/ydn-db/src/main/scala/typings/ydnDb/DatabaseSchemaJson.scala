package typings.ydnDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseSchemaJson extends StObject {
  
  var fullTextCatalogs: js.UndefOr[js.Array[FullTextCatalog]] = js.undefined
  
  var stores: js.Array[StoreSchemaJson]
  
  var version: js.UndefOr[Double] = js.undefined
}
object DatabaseSchemaJson {
  
  inline def apply(stores: js.Array[StoreSchemaJson]): DatabaseSchemaJson = {
    val __obj = js.Dynamic.literal(stores = stores.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseSchemaJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatabaseSchemaJson] (val x: Self) extends AnyVal {
    
    inline def setFullTextCatalogs(value: js.Array[FullTextCatalog]): Self = StObject.set(x, "fullTextCatalogs", value.asInstanceOf[js.Any])
    
    inline def setFullTextCatalogsUndefined: Self = StObject.set(x, "fullTextCatalogs", js.undefined)
    
    inline def setFullTextCatalogsVarargs(value: FullTextCatalog*): Self = StObject.set(x, "fullTextCatalogs", js.Array(value*))
    
    inline def setStores(value: js.Array[StoreSchemaJson]): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
    
    inline def setStoresVarargs(value: StoreSchemaJson*): Self = StObject.set(x, "stores", js.Array(value*))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

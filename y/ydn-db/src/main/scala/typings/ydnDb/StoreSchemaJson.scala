package typings.ydnDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreSchemaJson extends StObject {
  
  var autoIncrement: js.UndefOr[Boolean] = js.undefined
  
  var dispatchEvents: js.UndefOr[Boolean] = js.undefined
  
  var indexes: js.UndefOr[js.Array[IndexSchemaJson]] = js.undefined
  
  var keyPath: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object StoreSchemaJson {
  
  inline def apply(): StoreSchemaJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreSchemaJson]
  }
  
  extension [Self <: StoreSchemaJson](x: Self) {
    
    inline def setAutoIncrement(value: Boolean): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
    
    inline def setAutoIncrementUndefined: Self = StObject.set(x, "autoIncrement", js.undefined)
    
    inline def setDispatchEvents(value: Boolean): Self = StObject.set(x, "dispatchEvents", value.asInstanceOf[js.Any])
    
    inline def setDispatchEventsUndefined: Self = StObject.set(x, "dispatchEvents", js.undefined)
    
    inline def setIndexes(value: js.Array[IndexSchemaJson]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setIndexesVarargs(value: IndexSchemaJson*): Self = StObject.set(x, "indexes", js.Array(value*))
    
    inline def setKeyPath(value: String): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    inline def setKeyPathUndefined: Self = StObject.set(x, "keyPath", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

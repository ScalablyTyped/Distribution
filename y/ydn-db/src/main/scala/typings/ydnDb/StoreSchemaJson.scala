package typings.ydnDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreSchemaJson extends StObject {
  
  var autoIncrement: js.UndefOr[Boolean] = js.native
  
  var dispatchEvents: js.UndefOr[Boolean] = js.native
  
  var indexes: js.UndefOr[js.Array[IndexSchemaJson]] = js.native
  
  var keyPath: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object StoreSchemaJson {
  
  @scala.inline
  def apply(): StoreSchemaJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreSchemaJson]
  }
  
  @scala.inline
  implicit class StoreSchemaJsonMutableBuilder[Self <: StoreSchemaJson] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoIncrement(value: Boolean): Self = StObject.set(x, "autoIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoIncrementUndefined: Self = StObject.set(x, "autoIncrement", js.undefined)
    
    @scala.inline
    def setDispatchEvents(value: Boolean): Self = StObject.set(x, "dispatchEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispatchEventsUndefined: Self = StObject.set(x, "dispatchEvents", js.undefined)
    
    @scala.inline
    def setIndexes(value: js.Array[IndexSchemaJson]): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    @scala.inline
    def setIndexesVarargs(value: IndexSchemaJson*): Self = StObject.set(x, "indexes", js.Array(value :_*))
    
    @scala.inline
    def setKeyPath(value: String): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPathUndefined: Self = StObject.set(x, "keyPath", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}

package typings.ydnDb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexSchemaJson extends StObject {
  
  var keyPath: String | js.Array[String]
  
  var multiEntry: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var unique: js.UndefOr[Boolean] = js.undefined
}
object IndexSchemaJson {
  
  inline def apply(keyPath: String | js.Array[String]): IndexSchemaJson = {
    val __obj = js.Dynamic.literal(keyPath = keyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexSchemaJson]
  }
  
  extension [Self <: IndexSchemaJson](x: Self) {
    
    inline def setKeyPath(value: String | js.Array[String]): Self = StObject.set(x, "keyPath", value.asInstanceOf[js.Any])
    
    inline def setKeyPathVarargs(value: String*): Self = StObject.set(x, "keyPath", js.Array(value :_*))
    
    inline def setMultiEntry(value: Boolean): Self = StObject.set(x, "multiEntry", value.asInstanceOf[js.Any])
    
    inline def setMultiEntryUndefined: Self = StObject.set(x, "multiEntry", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
  }
}

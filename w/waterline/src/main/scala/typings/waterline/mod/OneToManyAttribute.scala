package typings.waterline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OneToManyAttribute
  extends StObject
     with BaseAttribute[js.Any]
     with _Attribute {
  
  var collection: String
  
  var via: String
}
object OneToManyAttribute {
  
  inline def apply(collection: String, via: String): OneToManyAttribute = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneToManyAttribute]
  }
  
  extension [Self <: OneToManyAttribute](x: Self) {
    
    inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setVia(value: String): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
  }
}

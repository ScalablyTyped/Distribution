package typings.waterline.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManyToManyAttribute
  extends StObject
     with BaseAttribute[Any]
     with _Attribute {
  
  var collection: String
  
  var dominant: js.UndefOr[Boolean] = js.undefined
  
  var via: String
}
object ManyToManyAttribute {
  
  inline def apply(collection: String, via: String): ManyToManyAttribute = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManyToManyAttribute]
  }
  
  extension [Self <: ManyToManyAttribute](x: Self) {
    
    inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    inline def setDominant(value: Boolean): Self = StObject.set(x, "dominant", value.asInstanceOf[js.Any])
    
    inline def setDominantUndefined: Self = StObject.set(x, "dominant", js.undefined)
    
    inline def setVia(value: String): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
  }
}

package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var key: String
  
  var name: Double
  
  var related: String
  
  var relating: String
}
object Key {
  
  inline def apply(key: String, name: Double, related: String, relating: String): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], related = related.asInstanceOf[js.Any], relating = relating.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRelated(value: String): Self = StObject.set(x, "related", value.asInstanceOf[js.Any])
    
    inline def setRelating(value: String): Self = StObject.set(x, "relating", value.asInstanceOf[js.Any])
  }
}

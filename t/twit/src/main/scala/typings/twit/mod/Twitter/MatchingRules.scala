package typings.twit.mod.Twitter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchingRules extends StObject {
  
  var id: Double
  
  var id_str: String
  
  var tag: Null
}
object MatchingRules {
  
  inline def apply(id: Double, id_str: String, tag: Null): MatchingRules = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchingRules]
  }
  
  extension [Self <: MatchingRules](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setId_str(value: String): Self = StObject.set(x, "id_str", value.asInstanceOf[js.Any])
    
    inline def setTag(value: Null): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}

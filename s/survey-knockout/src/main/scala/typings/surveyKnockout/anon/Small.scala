package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Small extends StObject {
  
  var root: String
  
  var small: String
}
object Small {
  
  inline def apply(root: String, small: String): Small = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[Small]
  }
  
  extension [Self <: Small](x: Self) {
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
  }
}

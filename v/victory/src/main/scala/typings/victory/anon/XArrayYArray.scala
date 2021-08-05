package typings.victory.anon

import typings.victory.mod._CategoryPropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XArrayYArray
  extends StObject
     with _CategoryPropType {
  
  var x: js.Array[String]
  
  var y: js.Array[String]
}
object XArrayYArray {
  
  inline def apply(x: js.Array[String], y: js.Array[String]): XArrayYArray = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XArrayYArray]
  }
  
  extension [Self <: XArrayYArray](x: Self) {
    
    inline def setX(value: js.Array[String]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXVarargs(value: String*): Self = StObject.set(x, "x", js.Array(value :_*))
    
    inline def setY(value: js.Array[String]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYVarargs(value: String*): Self = StObject.set(x, "y", js.Array(value :_*))
  }
}

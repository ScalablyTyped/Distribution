package typings.victory.anon

import typings.victory.mod._CategoryPropType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XArray
  extends StObject
     with _CategoryPropType {
  
  var x: js.Array[String]
}
object XArray {
  
  inline def apply(x: js.Array[String]): XArray = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[XArray]
  }
  
  extension [Self <: XArray](x: Self) {
    
    inline def setX(value: js.Array[String]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXVarargs(value: String*): Self = StObject.set(x, "x", js.Array(value :_*))
  }
}

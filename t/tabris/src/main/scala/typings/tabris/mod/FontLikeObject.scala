package typings.tabris.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontLikeObject
  extends StObject
     with _FontValue {
  
  var family: js.UndefOr[js.Array[String]] = js.undefined
  
  var size: Double
  
  var style: js.UndefOr[FontStyle] = js.undefined
  
  var weight: js.UndefOr[FontWeight] = js.undefined
}
object FontLikeObject {
  
  inline def apply(size: Double): FontLikeObject = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontLikeObject]
  }
  
  extension [Self <: FontLikeObject](x: Self) {
    
    inline def setFamily(value: js.Array[String]): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setFamilyVarargs(value: String*): Self = StObject.set(x, "family", js.Array(value*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: FontStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWeight(value: FontWeight): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}

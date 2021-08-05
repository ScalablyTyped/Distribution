package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialIndex extends StObject {
  
  var count: Double
  
  var materialIndex: js.UndefOr[Double] = js.undefined
  
  var start: Double
}
object MaterialIndex {
  
  inline def apply(count: Double, start: Double): MaterialIndex = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialIndex]
  }
  
  extension [Self <: MaterialIndex](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setMaterialIndex(value: Double): Self = StObject.set(x, "materialIndex", value.asInstanceOf[js.Any])
    
    inline def setMaterialIndexUndefined: Self = StObject.set(x, "materialIndex", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}

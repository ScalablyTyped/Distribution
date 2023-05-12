package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialIndex extends StObject {
  
  /**
    * Specifies how many vertices (or indices) are included.
    * @remarks Expects a `Integer`
    */
  var count: Double
  
  /**
    * Specifies the material array index to use.
    * @remarks Expects a `Integer`
    */
  var materialIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the first element in this draw call – the first vertex for non-indexed geometry, otherwise the first triangle index.
    * @remarks Expects a `Integer`
    */
  var start: Double
}
object MaterialIndex {
  
  inline def apply(count: Double, start: Double): MaterialIndex = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialIndex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaterialIndex] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setMaterialIndex(value: Double): Self = StObject.set(x, "materialIndex", value.asInstanceOf[js.Any])
    
    inline def setMaterialIndexUndefined: Self = StObject.set(x, "materialIndex", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}

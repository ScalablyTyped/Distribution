package typings.vectorious

import typings.vectorious.distTypesMod.DType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dtype extends StObject {
    
    var dtype: js.UndefOr[DType] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var shape: js.UndefOr[js.Array[Double]] = js.undefined
    
    var strides: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object Dtype {
    
    inline def apply(): Dtype = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dtype]
    }
    
    extension [Self <: Dtype](x: Self) {
      
      inline def setDtype(value: DType): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
      
      inline def setDtypeUndefined: Self = StObject.set(x, "dtype", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setShape(value: js.Array[Double]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setShapeVarargs(value: Double*): Self = StObject.set(x, "shape", js.Array(value*))
      
      inline def setStrides(value: js.Array[Double]): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
      
      inline def setStridesUndefined: Self = StObject.set(x, "strides", js.undefined)
      
      inline def setStridesVarargs(value: Double*): Self = StObject.set(x, "strides", js.Array(value*))
    }
  }
}

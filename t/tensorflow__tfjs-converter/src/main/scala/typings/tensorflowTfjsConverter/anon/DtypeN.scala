package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DtypeN extends StObject {
  
  var N: I
  
  var T: Type
  
  var Tidx: Type
  
  var dtype: Unit
  
  var shape: Unit
  
  var transpose_a: Unit
  
  var transpose_b: Unit
  
  var value: Unit
}
object DtypeN {
  
  inline def apply(
    N: I,
    T: Type,
    Tidx: Type,
    dtype: Unit,
    shape: Unit,
    transpose_a: Unit,
    transpose_b: Unit,
    value: Unit
  ): DtypeN = {
    val __obj = js.Dynamic.literal(N = N.asInstanceOf[js.Any], T = T.asInstanceOf[js.Any], Tidx = Tidx.asInstanceOf[js.Any], dtype = dtype.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], transpose_a = transpose_a.asInstanceOf[js.Any], transpose_b = transpose_b.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DtypeN]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DtypeN] (val x: Self) extends AnyVal {
    
    inline def setDtype(value: Unit): Self = StObject.set(x, "dtype", value.asInstanceOf[js.Any])
    
    inline def setN(value: I): Self = StObject.set(x, "N", value.asInstanceOf[js.Any])
    
    inline def setShape(value: Unit): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setT(value: Type): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
    
    inline def setTidx(value: Type): Self = StObject.set(x, "Tidx", value.asInstanceOf[js.Any])
    
    inline def setTranspose_a(value: Unit): Self = StObject.set(x, "transpose_a", value.asInstanceOf[js.Any])
    
    inline def setTranspose_b(value: Unit): Self = StObject.set(x, "transpose_b", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

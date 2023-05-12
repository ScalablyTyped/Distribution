package typings.tensorflowTfjsBackendWebgl.anon

import typings.tensorflowTfjsCore.distTensorInfoMod.TensorInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Imag extends StObject {
  
  var imag: TensorInfo
  
  var real: TensorInfo
}
object Imag {
  
  inline def apply(imag: TensorInfo, real: TensorInfo): Imag = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[Imag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Imag] (val x: Self) extends AnyVal {
    
    inline def setImag(value: TensorInfo): Self = StObject.set(x, "imag", value.asInstanceOf[js.Any])
    
    inline def setReal(value: TensorInfo): Self = StObject.set(x, "real", value.asInstanceOf[js.Any])
  }
}

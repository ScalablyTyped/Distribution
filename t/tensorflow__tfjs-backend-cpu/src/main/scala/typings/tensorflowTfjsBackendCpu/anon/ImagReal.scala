package typings.tensorflowTfjsBackendCpu.anon

import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagReal extends StObject {
  
  var imag: Float32Array = js.native
  
  var real: Float32Array = js.native
}
object ImagReal {
  
  @scala.inline
  def apply(imag: Float32Array, real: Float32Array): ImagReal = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagReal]
  }
  
  @scala.inline
  implicit class ImagRealMutableBuilder[Self <: ImagReal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImag(value: Float32Array): Self = StObject.set(x, "imag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReal(value: Float32Array): Self = StObject.set(x, "real", value.asInstanceOf[js.Any])
  }
}

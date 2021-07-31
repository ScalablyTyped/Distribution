package typings.tensorflowTfjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Real extends StObject {
  
  var imag: Double
  
  var real: Double
}
object Real {
  
  @scala.inline
  def apply(imag: Double, real: Double): Real = {
    val __obj = js.Dynamic.literal(imag = imag.asInstanceOf[js.Any], real = real.asInstanceOf[js.Any])
    __obj.asInstanceOf[Real]
  }
  
  @scala.inline
  implicit class RealMutableBuilder[Self <: Real] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImag(value: Double): Self = StObject.set(x, "imag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReal(value: Double): Self = StObject.set(x, "real", value.asInstanceOf[js.Any])
  }
}

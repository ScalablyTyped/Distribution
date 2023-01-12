package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromPixelsAttrs extends StObject {
  
  var numChannels: Double
}
object FromPixelsAttrs {
  
  inline def apply(numChannels: Double): FromPixelsAttrs = {
    val __obj = js.Dynamic.literal(numChannels = numChannels.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromPixelsAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromPixelsAttrs] (val x: Self) extends AnyVal {
    
    inline def setNumChannels(value: Double): Self = StObject.set(x, "numChannels", value.asInstanceOf[js.Any])
  }
}

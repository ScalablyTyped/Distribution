package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnpackAttrs extends StObject {
  
  var axis: Double
}
object UnpackAttrs {
  
  inline def apply(axis: Double): UnpackAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnpackAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnpackAttrs] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
  }
}

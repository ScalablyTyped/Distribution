package typings.tensorflowTfjsCore.distKernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogSoftmaxAttrs extends StObject {
  
  var axis: Double
}
object LogSoftmaxAttrs {
  
  inline def apply(axis: Double): LogSoftmaxAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogSoftmaxAttrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogSoftmaxAttrs] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
  }
}

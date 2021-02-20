package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogSoftmaxAttrs extends StObject {
  
  var axis: Double = js.native
}
object LogSoftmaxAttrs {
  
  @scala.inline
  def apply(axis: Double): LogSoftmaxAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogSoftmaxAttrs]
  }
  
  @scala.inline
  implicit class LogSoftmaxAttrsMutableBuilder[Self <: LogSoftmaxAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
  }
}

package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnpackAttrs extends StObject {
  
  var axis: Double = js.native
}
object UnpackAttrs {
  
  @scala.inline
  def apply(axis: Double): UnpackAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnpackAttrs]
  }
  
  @scala.inline
  implicit class UnpackAttrsMutableBuilder[Self <: UnpackAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
  }
}

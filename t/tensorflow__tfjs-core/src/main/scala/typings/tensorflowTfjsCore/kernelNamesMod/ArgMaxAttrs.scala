package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgMaxAttrs extends StObject {
  
  var axis: Double = js.native
}
object ArgMaxAttrs {
  
  @scala.inline
  def apply(axis: Double): ArgMaxAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgMaxAttrs]
  }
  
  @scala.inline
  implicit class ArgMaxAttrsMutableBuilder[Self <: ArgMaxAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
  }
}

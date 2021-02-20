package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgMinAttrs extends StObject {
  
  var axis: Double = js.native
}
object ArgMinAttrs {
  
  @scala.inline
  def apply(axis: Double): ArgMinAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgMinAttrs]
  }
  
  @scala.inline
  implicit class ArgMinAttrsMutableBuilder[Self <: ArgMinAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
  }
}

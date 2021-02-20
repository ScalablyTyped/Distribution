package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GatherV2Attrs extends StObject {
  
  var axis: Double = js.native
}
object GatherV2Attrs {
  
  @scala.inline
  def apply(axis: Double): GatherV2Attrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatherV2Attrs]
  }
  
  @scala.inline
  implicit class GatherV2AttrsMutableBuilder[Self <: GatherV2Attrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
  }
}

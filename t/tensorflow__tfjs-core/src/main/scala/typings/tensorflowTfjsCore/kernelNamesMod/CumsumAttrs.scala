package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CumsumAttrs extends StObject {
  
  var axis: Double = js.native
  
  var exclusive: Boolean = js.native
  
  var reverse: Boolean = js.native
}
object CumsumAttrs {
  
  @scala.inline
  def apply(axis: Double, exclusive: Boolean, reverse: Boolean): CumsumAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], reverse = reverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[CumsumAttrs]
  }
  
  @scala.inline
  implicit class CumsumAttrsMutableBuilder[Self <: CumsumAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
  }
}

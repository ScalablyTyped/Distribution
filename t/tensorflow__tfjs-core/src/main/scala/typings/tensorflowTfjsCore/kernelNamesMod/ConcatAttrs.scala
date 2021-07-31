package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConcatAttrs extends StObject {
  
  var axis: Double
}
object ConcatAttrs {
  
  @scala.inline
  def apply(axis: Double): ConcatAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcatAttrs]
  }
  
  @scala.inline
  implicit class ConcatAttrsMutableBuilder[Self <: ConcatAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
  }
}

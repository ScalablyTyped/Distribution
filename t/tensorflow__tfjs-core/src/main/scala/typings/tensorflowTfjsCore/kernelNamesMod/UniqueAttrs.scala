package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniqueAttrs extends StObject {
  
  var axis: Double = js.native
}
object UniqueAttrs {
  
  @scala.inline
  def apply(axis: Double): UniqueAttrs = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any])
    __obj.asInstanceOf[UniqueAttrs]
  }
  
  @scala.inline
  implicit class UniqueAttrsMutableBuilder[Self <: UniqueAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: Double): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
  }
}

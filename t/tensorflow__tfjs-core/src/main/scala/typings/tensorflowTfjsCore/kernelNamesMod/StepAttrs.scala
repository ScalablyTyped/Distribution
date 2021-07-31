package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepAttrs extends StObject {
  
  var alpha: Double
}
object StepAttrs {
  
  @scala.inline
  def apply(alpha: Double): StepAttrs = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepAttrs]
  }
  
  @scala.inline
  implicit class StepAttrsMutableBuilder[Self <: StepAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
  }
}

package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolationOptions extends StObject {
  
  var parametrization: ParametrizationInterpolationType
}
object InterpolationOptions {
  
  @scala.inline
  def apply(parametrization: ParametrizationInterpolationType): InterpolationOptions = {
    val __obj = js.Dynamic.literal(parametrization = parametrization.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolationOptions]
  }
  
  @scala.inline
  implicit class InterpolationOptionsMutableBuilder[Self <: InterpolationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParametrization(value: ParametrizationInterpolationType): Self = StObject.set(x, "parametrization", value.asInstanceOf[js.Any])
  }
}

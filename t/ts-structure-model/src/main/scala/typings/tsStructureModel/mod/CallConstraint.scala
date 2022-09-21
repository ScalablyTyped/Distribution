package typings.tsStructureModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallConstraint
  extends StObject
     with Constraint {
  
  @JSName("value")
  var value_CallConstraint: Annotation
}
object CallConstraint {
  
  inline def apply(isCallConstraint: Boolean, value: Annotation): CallConstraint = {
    val __obj = js.Dynamic.literal(isCallConstraint = isCallConstraint.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallConstraint]
  }
  
  extension [Self <: CallConstraint](x: Self) {
    
    inline def setValue(value: Annotation): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

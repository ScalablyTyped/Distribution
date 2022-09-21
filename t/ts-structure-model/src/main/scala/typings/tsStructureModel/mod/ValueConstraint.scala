package typings.tsStructureModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueConstraint
  extends StObject
     with Constraint {
  
  @JSName("value")
  var value_ValueConstraint: String | Double | Boolean
}
object ValueConstraint {
  
  inline def apply(isCallConstraint: Boolean, value: String | Double | Boolean): ValueConstraint = {
    val __obj = js.Dynamic.literal(isCallConstraint = isCallConstraint.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueConstraint]
  }
  
  extension [Self <: ValueConstraint](x: Self) {
    
    inline def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}

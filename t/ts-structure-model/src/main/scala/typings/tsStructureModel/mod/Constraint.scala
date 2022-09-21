package typings.tsStructureModel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Constraint extends StObject {
  
  var isCallConstraint: Boolean
  
  var value: js.UndefOr[Any] = js.undefined
}
object Constraint {
  
  inline def apply(isCallConstraint: Boolean): Constraint = {
    val __obj = js.Dynamic.literal(isCallConstraint = isCallConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constraint]
  }
  
  extension [Self <: Constraint](x: Self) {
    
    inline def setIsCallConstraint(value: Boolean): Self = StObject.set(x, "isCallConstraint", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}

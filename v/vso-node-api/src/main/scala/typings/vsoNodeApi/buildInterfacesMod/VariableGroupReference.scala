package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableGroupReference extends StObject {
  
  /**
    * The ID of the variable group.
    */
  var id: Double
}
object VariableGroupReference {
  
  inline def apply(id: Double): VariableGroupReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableGroupReference]
  }
  
  extension [Self <: VariableGroupReference](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}

package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestSessionWorkItemReference extends StObject {
  
  /**
    * Id of the workitem
    */
  var id: Double
  
  /**
    * Type of the workitem
    */
  var `type`: String
}
object TestSessionWorkItemReference {
  
  inline def apply(id: Double, `type`: String): TestSessionWorkItemReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestSessionWorkItemReference]
  }
  
  extension [Self <: TestSessionWorkItemReference](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

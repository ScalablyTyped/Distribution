package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestEnvironment extends StObject {
  
  var environmentId: String
  
  var environmentName: String
}
object TestEnvironment {
  
  inline def apply(environmentId: String, environmentName: String): TestEnvironment = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEnvironment]
  }
  
  extension [Self <: TestEnvironment](x: Self) {
    
    inline def setEnvironmentId(value: String): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
  }
}

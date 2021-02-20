package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestEnvironment extends StObject {
  
  var environmentId: String = js.native
  
  var environmentName: String = js.native
}
object TestEnvironment {
  
  @scala.inline
  def apply(environmentId: String, environmentName: String): TestEnvironment = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestEnvironment]
  }
  
  @scala.inline
  implicit class TestEnvironmentMutableBuilder[Self <: TestEnvironment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentId(value: String): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
  }
}

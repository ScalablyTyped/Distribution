package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentTest
  extends StObject
     with Deployment {
  
  var runId: Double
}
object DeploymentTest {
  
  inline def apply(runId: Double, `type`: String): DeploymentTest = {
    val __obj = js.Dynamic.literal(runId = runId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentTest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentTest] (val x: Self) extends AnyVal {
    
    inline def setRunId(value: Double): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
  }
}

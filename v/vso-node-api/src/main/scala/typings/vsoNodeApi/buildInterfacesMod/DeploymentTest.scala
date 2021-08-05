package typings.vsoNodeApi.buildInterfacesMod

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
  
  extension [Self <: DeploymentTest](x: Self) {
    
    inline def setRunId(value: Double): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
  }
}

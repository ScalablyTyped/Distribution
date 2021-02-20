package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentTest extends Deployment {
  
  var runId: Double = js.native
}
object DeploymentTest {
  
  @scala.inline
  def apply(runId: Double, `type`: String): DeploymentTest = {
    val __obj = js.Dynamic.literal(runId = runId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentTest]
  }
  
  @scala.inline
  implicit class DeploymentTestMutableBuilder[Self <: DeploymentTest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRunId(value: Double): Self = StObject.set(x, "runId", value.asInstanceOf[js.Any])
  }
}

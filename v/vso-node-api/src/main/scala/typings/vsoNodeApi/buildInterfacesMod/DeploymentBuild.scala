package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentBuild extends Deployment {
  
  var buildId: Double = js.native
}
object DeploymentBuild {
  
  @scala.inline
  def apply(buildId: Double, `type`: String): DeploymentBuild = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentBuild]
  }
  
  @scala.inline
  implicit class DeploymentBuildMutableBuilder[Self <: DeploymentBuild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildId(value: Double): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
  }
}

package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentBuild
  extends StObject
     with Deployment {
  
  var buildId: Double
}
object DeploymentBuild {
  
  inline def apply(buildId: Double, `type`: String): DeploymentBuild = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentBuild]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentBuild] (val x: Self) extends AnyVal {
    
    inline def setBuildId(value: Double): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
  }
}

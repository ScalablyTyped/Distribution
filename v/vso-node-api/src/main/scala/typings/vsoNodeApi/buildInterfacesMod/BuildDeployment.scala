package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildDeployment extends StObject {
  
  var deployment: BuildSummary = js.native
  
  var sourceBuild: XamlBuildReference = js.native
}
object BuildDeployment {
  
  @scala.inline
  def apply(deployment: BuildSummary, sourceBuild: XamlBuildReference): BuildDeployment = {
    val __obj = js.Dynamic.literal(deployment = deployment.asInstanceOf[js.Any], sourceBuild = sourceBuild.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDeployment]
  }
  
  @scala.inline
  implicit class BuildDeploymentMutableBuilder[Self <: BuildDeployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployment(value: BuildSummary): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBuild(value: XamlBuildReference): Self = StObject.set(x, "sourceBuild", value.asInstanceOf[js.Any])
  }
}

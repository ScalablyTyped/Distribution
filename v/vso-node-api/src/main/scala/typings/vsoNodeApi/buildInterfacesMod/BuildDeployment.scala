package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildDeployment extends js.Object {
  
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
  implicit class BuildDeploymentOps[Self <: BuildDeployment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeployment(value: BuildSummary): Self = this.set("deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceBuild(value: XamlBuildReference): Self = this.set("sourceBuild", value.asInstanceOf[js.Any])
  }
}

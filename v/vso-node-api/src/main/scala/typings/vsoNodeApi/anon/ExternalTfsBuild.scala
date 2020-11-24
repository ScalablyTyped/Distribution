package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalTfsBuild extends js.Object {
  
  var build: scala.Double = js.native
  
  var custom: scala.Double = js.native
  
  var externalTfsBuild: scala.Double = js.native
  
  var fileShare: scala.Double = js.native
  
  var gitHub: scala.Double = js.native
  
  var jenkins: scala.Double = js.native
  
  var nuget: scala.Double = js.native
  
  var tFGit: scala.Double = js.native
  
  var tfsOnPrem: scala.Double = js.native
  
  var tfvc: scala.Double = js.native
  
  var xamlBuild: scala.Double = js.native
}
object ExternalTfsBuild {
  
  @scala.inline
  def apply(
    build: scala.Double,
    custom: scala.Double,
    externalTfsBuild: scala.Double,
    fileShare: scala.Double,
    gitHub: scala.Double,
    jenkins: scala.Double,
    nuget: scala.Double,
    tFGit: scala.Double,
    tfsOnPrem: scala.Double,
    tfvc: scala.Double,
    xamlBuild: scala.Double
  ): ExternalTfsBuild = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], externalTfsBuild = externalTfsBuild.asInstanceOf[js.Any], fileShare = fileShare.asInstanceOf[js.Any], gitHub = gitHub.asInstanceOf[js.Any], jenkins = jenkins.asInstanceOf[js.Any], nuget = nuget.asInstanceOf[js.Any], tFGit = tFGit.asInstanceOf[js.Any], tfsOnPrem = tfsOnPrem.asInstanceOf[js.Any], tfvc = tfvc.asInstanceOf[js.Any], xamlBuild = xamlBuild.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalTfsBuild]
  }
  
  @scala.inline
  implicit class ExternalTfsBuildOps[Self <: ExternalTfsBuild] (val x: Self) extends AnyVal {
    
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
    def setBuild(value: scala.Double): Self = this.set("build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: scala.Double): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalTfsBuild(value: scala.Double): Self = this.set("externalTfsBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShare(value: scala.Double): Self = this.set("fileShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitHub(value: scala.Double): Self = this.set("gitHub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJenkins(value: scala.Double): Self = this.set("jenkins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNuget(value: scala.Double): Self = this.set("nuget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTFGit(value: scala.Double): Self = this.set("tFGit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfsOnPrem(value: scala.Double): Self = this.set("tfsOnPrem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfvc(value: scala.Double): Self = this.set("tfvc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXamlBuild(value: scala.Double): Self = this.set("xamlBuild", value.asInstanceOf[js.Any])
  }
}

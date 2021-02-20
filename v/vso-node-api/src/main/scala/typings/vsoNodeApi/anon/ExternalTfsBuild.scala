package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExternalTfsBuild extends StObject {
  
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
  implicit class ExternalTfsBuildMutableBuilder[Self <: ExternalTfsBuild] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuild(value: scala.Double): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: scala.Double): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalTfsBuild(value: scala.Double): Self = StObject.set(x, "externalTfsBuild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileShare(value: scala.Double): Self = StObject.set(x, "fileShare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitHub(value: scala.Double): Self = StObject.set(x, "gitHub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJenkins(value: scala.Double): Self = StObject.set(x, "jenkins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNuget(value: scala.Double): Self = StObject.set(x, "nuget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTFGit(value: scala.Double): Self = StObject.set(x, "tFGit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfsOnPrem(value: scala.Double): Self = StObject.set(x, "tfsOnPrem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfvc(value: scala.Double): Self = StObject.set(x, "tfvc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXamlBuild(value: scala.Double): Self = StObject.set(x, "xamlBuild", value.asInstanceOf[js.Any])
  }
}

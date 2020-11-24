package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildProcessTemplate extends js.Object {
  
  var description: String = js.native
  
  var fileExists: Boolean = js.native
  
  var id: Double = js.native
  
  var parameters: String = js.native
  
  var serverPath: String = js.native
  
  var supportedReasons: BuildReason = js.native
  
  var teamProject: String = js.native
  
  var templateType: ProcessTemplateType = js.native
  
  var url: String = js.native
  
  var version: String = js.native
}
object BuildProcessTemplate {
  
  @scala.inline
  def apply(
    description: String,
    fileExists: Boolean,
    id: Double,
    parameters: String,
    serverPath: String,
    supportedReasons: BuildReason,
    teamProject: String,
    templateType: ProcessTemplateType,
    url: String,
    version: String
  ): BuildProcessTemplate = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fileExists = fileExists.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], serverPath = serverPath.asInstanceOf[js.Any], supportedReasons = supportedReasons.asInstanceOf[js.Any], teamProject = teamProject.asInstanceOf[js.Any], templateType = templateType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildProcessTemplate]
  }
  
  @scala.inline
  implicit class BuildProcessTemplateOps[Self <: BuildProcessTemplate] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileExists(value: Boolean): Self = this.set("fileExists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: String): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerPath(value: String): Self = this.set("serverPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedReasons(value: BuildReason): Self = this.set("supportedReasons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamProject(value: String): Self = this.set("teamProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateType(value: ProcessTemplateType): Self = this.set("templateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}

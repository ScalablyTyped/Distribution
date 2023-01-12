package typings.vsoNodeApi.interfacesBuildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildProcessTemplate extends StObject {
  
  var description: String
  
  var fileExists: Boolean
  
  var id: Double
  
  var parameters: String
  
  var serverPath: String
  
  var supportedReasons: BuildReason
  
  var teamProject: String
  
  var templateType: ProcessTemplateType
  
  var url: String
  
  var version: String
}
object BuildProcessTemplate {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: BuildProcessTemplate] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setFileExists(value: Boolean): Self = StObject.set(x, "fileExists", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: String): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setServerPath(value: String): Self = StObject.set(x, "serverPath", value.asInstanceOf[js.Any])
    
    inline def setSupportedReasons(value: BuildReason): Self = StObject.set(x, "supportedReasons", value.asInstanceOf[js.Any])
    
    inline def setTeamProject(value: String): Self = StObject.set(x, "teamProject", value.asInstanceOf[js.Any])
    
    inline def setTemplateType(value: ProcessTemplateType): Self = StObject.set(x, "templateType", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

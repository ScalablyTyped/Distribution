package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AgentArtifactDefinition extends StObject {
  
  var alias: String = js.native
  
  var artifactType: AgentArtifactType = js.native
  
  var details: String = js.native
  
  var name: String = js.native
  
  var version: String = js.native
}
object AgentArtifactDefinition {
  
  @scala.inline
  def apply(alias: String, artifactType: AgentArtifactType, details: String, name: String, version: String): AgentArtifactDefinition = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentArtifactDefinition]
  }
  
  @scala.inline
  implicit class AgentArtifactDefinitionMutableBuilder[Self <: AgentArtifactDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactType(value: AgentArtifactType): Self = StObject.set(x, "artifactType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

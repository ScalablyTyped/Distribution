package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentArtifactDefinition extends StObject {
  
  var alias: String
  
  var artifactType: AgentArtifactType
  
  var details: String
  
  var name: String
  
  var version: String
}
object AgentArtifactDefinition {
  
  inline def apply(alias: String, artifactType: AgentArtifactType, details: String, name: String, version: String): AgentArtifactDefinition = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], artifactType = artifactType.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentArtifactDefinition]
  }
  
  extension [Self <: AgentArtifactDefinition](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setArtifactType(value: AgentArtifactType): Self = StObject.set(x, "artifactType", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

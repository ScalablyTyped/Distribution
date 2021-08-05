package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Artifact extends StObject {
  
  /**
    * Gets or sets alias.
    */
  var alias: String
  
  /**
    * Gets or sets definition reference. e.g. {"project":{"id":"fed755ea-49c5-4399-acea-fd5b5aa90a6c","name":"myProject"},"definition":{"id":"1","name":"mybuildDefinition"},"connection":{"id":"1","name":"myConnection"}}
    */
  var definitionReference: StringDictionary[ArtifactSourceReference]
  
  /**
    * Gets or sets as artifact is primary or not.
    */
  var isPrimary: Boolean
  
  var sourceId: String
  
  /**
    * Gets or sets type. It can have value as 'Build', 'Jenkins', 'GitHub', 'Nuget', 'Team Build (external)', 'ExternalTFSBuild', 'Git', 'TFVC', 'ExternalTfsXamlBuild'.
    */
  var `type`: String
}
object Artifact {
  
  inline def apply(
    alias: String,
    definitionReference: StringDictionary[ArtifactSourceReference],
    isPrimary: Boolean,
    sourceId: String,
    `type`: String
  ): Artifact = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], definitionReference = definitionReference.asInstanceOf[js.Any], isPrimary = isPrimary.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artifact]
  }
  
  extension [Self <: Artifact](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setDefinitionReference(value: StringDictionary[ArtifactSourceReference]): Self = StObject.set(x, "definitionReference", value.asInstanceOf[js.Any])
    
    inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

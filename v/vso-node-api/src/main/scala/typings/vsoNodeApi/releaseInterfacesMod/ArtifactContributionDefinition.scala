package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.formInputInterfacesMod.InputDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactContributionDefinition extends StObject {
  
  var artifactType: String
  
  var artifactTypeStreamMapping: StringDictionary[String]
  
  var browsableArtifactTypeMapping: StringDictionary[String]
  
  var dataSourceBindings: js.Array[DataSourceBinding]
  
  var displayName: String
  
  var downloadTaskId: String
  
  var endpointTypeId: String
  
  var inputDescriptors: js.Array[InputDescriptor]
  
  var name: String
  
  var uniqueSourceIdentifier: String
}
object ArtifactContributionDefinition {
  
  inline def apply(
    artifactType: String,
    artifactTypeStreamMapping: StringDictionary[String],
    browsableArtifactTypeMapping: StringDictionary[String],
    dataSourceBindings: js.Array[DataSourceBinding],
    displayName: String,
    downloadTaskId: String,
    endpointTypeId: String,
    inputDescriptors: js.Array[InputDescriptor],
    name: String,
    uniqueSourceIdentifier: String
  ): ArtifactContributionDefinition = {
    val __obj = js.Dynamic.literal(artifactType = artifactType.asInstanceOf[js.Any], artifactTypeStreamMapping = artifactTypeStreamMapping.asInstanceOf[js.Any], browsableArtifactTypeMapping = browsableArtifactTypeMapping.asInstanceOf[js.Any], dataSourceBindings = dataSourceBindings.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], downloadTaskId = downloadTaskId.asInstanceOf[js.Any], endpointTypeId = endpointTypeId.asInstanceOf[js.Any], inputDescriptors = inputDescriptors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uniqueSourceIdentifier = uniqueSourceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactContributionDefinition]
  }
  
  extension [Self <: ArtifactContributionDefinition](x: Self) {
    
    inline def setArtifactType(value: String): Self = StObject.set(x, "artifactType", value.asInstanceOf[js.Any])
    
    inline def setArtifactTypeStreamMapping(value: StringDictionary[String]): Self = StObject.set(x, "artifactTypeStreamMapping", value.asInstanceOf[js.Any])
    
    inline def setBrowsableArtifactTypeMapping(value: StringDictionary[String]): Self = StObject.set(x, "browsableArtifactTypeMapping", value.asInstanceOf[js.Any])
    
    inline def setDataSourceBindings(value: js.Array[DataSourceBinding]): Self = StObject.set(x, "dataSourceBindings", value.asInstanceOf[js.Any])
    
    inline def setDataSourceBindingsVarargs(value: DataSourceBinding*): Self = StObject.set(x, "dataSourceBindings", js.Array(value :_*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDownloadTaskId(value: String): Self = StObject.set(x, "downloadTaskId", value.asInstanceOf[js.Any])
    
    inline def setEndpointTypeId(value: String): Self = StObject.set(x, "endpointTypeId", value.asInstanceOf[js.Any])
    
    inline def setInputDescriptors(value: js.Array[InputDescriptor]): Self = StObject.set(x, "inputDescriptors", value.asInstanceOf[js.Any])
    
    inline def setInputDescriptorsVarargs(value: InputDescriptor*): Self = StObject.set(x, "inputDescriptors", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUniqueSourceIdentifier(value: String): Self = StObject.set(x, "uniqueSourceIdentifier", value.asInstanceOf[js.Any])
  }
}

package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.formInputInterfacesMod.InputDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactContributionDefinition extends StObject {
  
  var artifactType: String = js.native
  
  var artifactTypeStreamMapping: StringDictionary[String] = js.native
  
  var browsableArtifactTypeMapping: StringDictionary[String] = js.native
  
  var dataSourceBindings: js.Array[DataSourceBinding] = js.native
  
  var displayName: String = js.native
  
  var downloadTaskId: String = js.native
  
  var endpointTypeId: String = js.native
  
  var inputDescriptors: js.Array[InputDescriptor] = js.native
  
  var name: String = js.native
  
  var uniqueSourceIdentifier: String = js.native
}
object ArtifactContributionDefinition {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ArtifactContributionDefinitionMutableBuilder[Self <: ArtifactContributionDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactType(value: String): Self = StObject.set(x, "artifactType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactTypeStreamMapping(value: StringDictionary[String]): Self = StObject.set(x, "artifactTypeStreamMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowsableArtifactTypeMapping(value: StringDictionary[String]): Self = StObject.set(x, "browsableArtifactTypeMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceBindings(value: js.Array[DataSourceBinding]): Self = StObject.set(x, "dataSourceBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceBindingsVarargs(value: DataSourceBinding*): Self = StObject.set(x, "dataSourceBindings", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadTaskId(value: String): Self = StObject.set(x, "downloadTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointTypeId(value: String): Self = StObject.set(x, "endpointTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescriptors(value: js.Array[InputDescriptor]): Self = StObject.set(x, "inputDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescriptorsVarargs(value: InputDescriptor*): Self = StObject.set(x, "inputDescriptors", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueSourceIdentifier(value: String): Self = StObject.set(x, "uniqueSourceIdentifier", value.asInstanceOf[js.Any])
  }
}

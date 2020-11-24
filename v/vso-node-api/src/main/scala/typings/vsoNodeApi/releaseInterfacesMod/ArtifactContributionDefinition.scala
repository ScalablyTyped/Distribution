package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.vsoNodeApi.formInputInterfacesMod.InputDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactContributionDefinition extends js.Object {
  
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
  implicit class ArtifactContributionDefinitionOps[Self <: ArtifactContributionDefinition] (val x: Self) extends AnyVal {
    
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
    def setArtifactType(value: String): Self = this.set("artifactType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactTypeStreamMapping(value: StringDictionary[String]): Self = this.set("artifactTypeStreamMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrowsableArtifactTypeMapping(value: StringDictionary[String]): Self = this.set("browsableArtifactTypeMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceBindingsVarargs(value: DataSourceBinding*): Self = this.set("dataSourceBindings", js.Array(value :_*))
    
    @scala.inline
    def setDataSourceBindings(value: js.Array[DataSourceBinding]): Self = this.set("dataSourceBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadTaskId(value: String): Self = this.set("downloadTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointTypeId(value: String): Self = this.set("endpointTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputDescriptorsVarargs(value: InputDescriptor*): Self = this.set("inputDescriptors", js.Array(value :_*))
    
    @scala.inline
    def setInputDescriptors(value: js.Array[InputDescriptor]): Self = this.set("inputDescriptors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueSourceIdentifier(value: String): Self = this.set("uniqueSourceIdentifier", value.asInstanceOf[js.Any])
  }
}

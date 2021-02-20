package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildConfiguration extends StObject {
  
  var branchName: String = js.native
  
  var buildDefinitionId: Double = js.native
  
  var flavor: String = js.native
  
  var id: Double = js.native
  
  var number: String = js.native
  
  var platform: String = js.native
  
  var project: ShallowReference = js.native
  
  var repositoryId: Double = js.native
  
  var sourceVersion: String = js.native
  
  var uri: String = js.native
}
object BuildConfiguration {
  
  @scala.inline
  def apply(
    branchName: String,
    buildDefinitionId: Double,
    flavor: String,
    id: Double,
    number: String,
    platform: String,
    project: ShallowReference,
    repositoryId: Double,
    sourceVersion: String,
    uri: String
  ): BuildConfiguration = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], buildDefinitionId = buildDefinitionId.asInstanceOf[js.Any], flavor = flavor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any], sourceVersion = sourceVersion.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildConfiguration]
  }
  
  @scala.inline
  implicit class BuildConfigurationMutableBuilder[Self <: BuildConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranchName(value: String): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildDefinitionId(value: Double): Self = StObject.set(x, "buildDefinitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlavor(value: String): Self = StObject.set(x, "flavor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: ShallowReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryId(value: Double): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceVersion(value: String): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}

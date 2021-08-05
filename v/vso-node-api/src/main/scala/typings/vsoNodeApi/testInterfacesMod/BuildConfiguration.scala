package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildConfiguration extends StObject {
  
  var branchName: String
  
  var buildDefinitionId: Double
  
  var flavor: String
  
  var id: Double
  
  var number: String
  
  var platform: String
  
  var project: ShallowReference
  
  var repositoryId: Double
  
  var sourceVersion: String
  
  var uri: String
}
object BuildConfiguration {
  
  inline def apply(
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
  
  extension [Self <: BuildConfiguration](x: Self) {
    
    inline def setBranchName(value: String): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setBuildDefinitionId(value: Double): Self = StObject.set(x, "buildDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setFlavor(value: String): Self = StObject.set(x, "flavor", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setProject(value: ShallowReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setRepositoryId(value: Double): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    
    inline def setSourceVersion(value: String): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}

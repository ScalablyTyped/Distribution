package typings.vsoNodeApi.interfacesGitInterfacesMod

import typings.vsoNodeApi.interfacesCoreInterfacesMod.TeamProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitRepositoryCreateOptions extends StObject {
  
  var name: String
  
  var parentRepository: GitRepositoryRef
  
  var project: TeamProjectReference
}
object GitRepositoryCreateOptions {
  
  inline def apply(name: String, parentRepository: GitRepositoryRef, project: TeamProjectReference): GitRepositoryCreateOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parentRepository = parentRepository.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRepositoryCreateOptions]
  }
  
  extension [Self <: GitRepositoryCreateOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParentRepository(value: GitRepositoryRef): Self = StObject.set(x, "parentRepository", value.asInstanceOf[js.Any])
    
    inline def setProject(value: TeamProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}

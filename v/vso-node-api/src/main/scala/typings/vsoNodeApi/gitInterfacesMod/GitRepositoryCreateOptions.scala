package typings.vsoNodeApi.gitInterfacesMod

import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitRepositoryCreateOptions extends StObject {
  
  var name: String = js.native
  
  var parentRepository: GitRepositoryRef = js.native
  
  var project: TeamProjectReference = js.native
}
object GitRepositoryCreateOptions {
  
  @scala.inline
  def apply(name: String, parentRepository: GitRepositoryRef, project: TeamProjectReference): GitRepositoryCreateOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parentRepository = parentRepository.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRepositoryCreateOptions]
  }
  
  @scala.inline
  implicit class GitRepositoryCreateOptionsMutableBuilder[Self <: GitRepositoryCreateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentRepository(value: GitRepositoryRef): Self = StObject.set(x, "parentRepository", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: TeamProjectReference): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
  }
}

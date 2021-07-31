package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalGitRepositoryKey extends StObject {
  
  /**
    * Team Project Collection ID of the collection for the repository.
    */
  var collectionId: String
  
  /**
    * Team Project ID of the project for the repository.
    */
  var projectId: String
  
  /**
    * ID of the repository.
    */
  var repositoryId: String
}
object GlobalGitRepositoryKey {
  
  @scala.inline
  def apply(collectionId: String, projectId: String, repositoryId: String): GlobalGitRepositoryKey = {
    val __obj = js.Dynamic.literal(collectionId = collectionId.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalGitRepositoryKey]
  }
  
  @scala.inline
  implicit class GlobalGitRepositoryKeyMutableBuilder[Self <: GlobalGitRepositoryKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollectionId(value: String): Self = StObject.set(x, "collectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
  }
}

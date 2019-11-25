package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalGitRepositoryKey extends js.Object {
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
}


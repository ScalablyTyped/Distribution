package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalGitRepositoryKey extends js.Object {
  /**
    * Team Project Collection ID of the collection for the repository.
    */
  var collectionId: java.lang.String
  /**
    * Team Project ID of the project for the repository.
    */
  var projectId: java.lang.String
  /**
    * ID of the repository.
    */
  var repositoryId: java.lang.String
}

object GlobalGitRepositoryKey {
  @scala.inline
  def apply(collectionId: java.lang.String, projectId: java.lang.String, repositoryId: java.lang.String): GlobalGitRepositoryKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collectionId")(collectionId)
    __obj.updateDynamic("projectId")(projectId)
    __obj.updateDynamic("repositoryId")(repositoryId)
    __obj.asInstanceOf[GlobalGitRepositoryKey]
  }
}


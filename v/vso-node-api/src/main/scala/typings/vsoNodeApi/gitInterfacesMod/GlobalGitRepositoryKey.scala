package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalGitRepositoryKey extends js.Object {
  /**
    * Team Project Collection ID of the collection for the repository.
    */
  var collectionId: String = js.native
  /**
    * Team Project ID of the project for the repository.
    */
  var projectId: String = js.native
  /**
    * ID of the repository.
    */
  var repositoryId: String = js.native
}

object GlobalGitRepositoryKey {
  @scala.inline
  def apply(collectionId: String, projectId: String, repositoryId: String): GlobalGitRepositoryKey = {
    val __obj = js.Dynamic.literal(collectionId = collectionId.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalGitRepositoryKey]
  }
  @scala.inline
  implicit class GlobalGitRepositoryKeyOps[Self <: GlobalGitRepositoryKey] (val x: Self) extends AnyVal {
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
    def setCollectionId(value: String): Self = this.set("collectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryId(value: String): Self = this.set("repositoryId", value.asInstanceOf[js.Any])
  }
  
}


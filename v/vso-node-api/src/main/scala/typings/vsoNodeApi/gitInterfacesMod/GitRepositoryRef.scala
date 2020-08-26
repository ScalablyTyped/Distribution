package typings.vsoNodeApi.gitInterfacesMod

import typings.vsoNodeApi.coreInterfacesMod.TeamProjectCollectionReference
import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitRepositoryRef extends js.Object {
  /**
    * Team Project Collection where this Fork resides
    */
  var collection: TeamProjectCollectionReference = js.native
  var id: String = js.native
  /**
    * True if the repository was created as a fork
    */
  var isFork: Boolean = js.native
  var name: String = js.native
  var project: TeamProjectReference = js.native
  var remoteUrl: String = js.native
  var sshUrl: String = js.native
  var url: String = js.native
}

object GitRepositoryRef {
  @scala.inline
  def apply(
    collection: TeamProjectCollectionReference,
    id: String,
    isFork: Boolean,
    name: String,
    project: TeamProjectReference,
    remoteUrl: String,
    sshUrl: String,
    url: String
  ): GitRepositoryRef = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFork = isFork.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], remoteUrl = remoteUrl.asInstanceOf[js.Any], sshUrl = sshUrl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRepositoryRef]
  }
  @scala.inline
  implicit class GitRepositoryRefOps[Self <: GitRepositoryRef] (val x: Self) extends AnyVal {
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
    def setCollection(value: TeamProjectCollectionReference): Self = this.set("collection", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFork(value: Boolean): Self = this.set("isFork", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: TeamProjectReference): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteUrl(value: String): Self = this.set("remoteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSshUrl(value: String): Self = this.set("sshUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}


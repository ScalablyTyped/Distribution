package typings.vsoNodeApi.tfvcInterfacesMod

import typings.vsoNodeApi.coreInterfacesMod.TeamProjectCollectionReference
import typings.vsoNodeApi.coreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRepositoryRef extends js.Object {
  /**
    * Team Project Collection where this Fork resides
    */
  var collection: TeamProjectCollectionReference
  var id: String
  /**
    * True if the repository was created as a fork
    */
  var isFork: Boolean
  var name: String
  var project: TeamProjectReference
  var remoteUrl: String
  var sshUrl: String
  var url: String
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
}


package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import typings.vsoDashNodeDashApi.interfacesCoreInterfacesMod.TeamProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRepository extends js.Object {
  var _links: js.Any
  var defaultBranch: String
  var id: String
  /**
    * True if the repository was created as a fork
    */
  var isFork: Boolean
  var name: String
  var parentRepository: GitRepositoryRef
  var project: TeamProjectReference
  var remoteUrl: String
  var sshUrl: String
  var url: String
  var validRemoteUrls: js.Array[String]
}

object GitRepository {
  @scala.inline
  def apply(
    _links: js.Any,
    defaultBranch: String,
    id: String,
    isFork: Boolean,
    name: String,
    parentRepository: GitRepositoryRef,
    project: TeamProjectReference,
    remoteUrl: String,
    sshUrl: String,
    url: String,
    validRemoteUrls: js.Array[String]
  ): GitRepository = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], defaultBranch = defaultBranch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isFork = isFork.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentRepository = parentRepository.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], remoteUrl = remoteUrl.asInstanceOf[js.Any], sshUrl = sshUrl.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], validRemoteUrls = validRemoteUrls.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitRepository]
  }
}


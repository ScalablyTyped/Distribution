package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRepository extends js.Object {
  var _links: js.Any
  var defaultBranch: java.lang.String
  var id: java.lang.String
  /**
    * True if the repository was created as a fork
    */
  var isFork: scala.Boolean
  var name: java.lang.String
  var parentRepository: GitRepositoryRef
  var project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference
  var remoteUrl: java.lang.String
  var sshUrl: java.lang.String
  var url: java.lang.String
  var validRemoteUrls: js.Array[java.lang.String]
}

object GitRepository {
  @scala.inline
  def apply(
    _links: js.Any,
    defaultBranch: java.lang.String,
    id: java.lang.String,
    isFork: scala.Boolean,
    name: java.lang.String,
    parentRepository: GitRepositoryRef,
    project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference,
    remoteUrl: java.lang.String,
    sshUrl: java.lang.String,
    url: java.lang.String,
    validRemoteUrls: js.Array[java.lang.String]
  ): GitRepository = {
    val __obj = js.Dynamic.literal(_links = _links, defaultBranch = defaultBranch, id = id, isFork = isFork, name = name, parentRepository = parentRepository, project = project, remoteUrl = remoteUrl, sshUrl = sshUrl, url = url, validRemoteUrls = validRemoteUrls)
  
    __obj.asInstanceOf[GitRepository]
  }
}


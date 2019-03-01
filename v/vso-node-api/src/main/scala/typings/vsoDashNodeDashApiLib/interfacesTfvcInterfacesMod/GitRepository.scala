package typings
package vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_links")(_links)
    __obj.updateDynamic("defaultBranch")(defaultBranch)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isFork")(isFork)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parentRepository")(parentRepository)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("remoteUrl")(remoteUrl)
    __obj.updateDynamic("sshUrl")(sshUrl)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("validRemoteUrls")(validRemoteUrls)
    __obj.asInstanceOf[GitRepository]
  }
}


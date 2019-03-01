package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRepositoryRef extends js.Object {
  /**
    * Team Project Collection where this Fork resides
    */
  var collection: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectCollectionReference
  var id: java.lang.String
  /**
    * True if the repository was created as a fork
    */
  var isFork: scala.Boolean
  var name: java.lang.String
  var project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference
  var remoteUrl: java.lang.String
  var sshUrl: java.lang.String
  var url: java.lang.String
}

object GitRepositoryRef {
  @scala.inline
  def apply(
    collection: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectCollectionReference,
    id: java.lang.String,
    isFork: scala.Boolean,
    name: java.lang.String,
    project: vsoDashNodeDashApiLib.interfacesCoreInterfacesMod.TeamProjectReference,
    remoteUrl: java.lang.String,
    sshUrl: java.lang.String,
    url: java.lang.String
  ): GitRepositoryRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collection")(collection)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("isFork")(isFork)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("remoteUrl")(remoteUrl)
    __obj.updateDynamic("sshUrl")(sshUrl)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[GitRepositoryRef]
  }
}


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


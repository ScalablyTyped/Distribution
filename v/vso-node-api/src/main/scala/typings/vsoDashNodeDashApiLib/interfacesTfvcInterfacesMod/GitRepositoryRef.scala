package typings
package vsoDashNodeDashApiLib.interfacesTfvcInterfacesMod

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


package typings
package typedDashGithubDashApiLib.distInterfacesBranchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BranchRef extends js.Object {
  val name: java.lang.String
  val repository: typedDashGithubDashApiLib.distInterfacesRepositoryMod.RepositoryRef
  def loadAsync(): stdLib.Promise[Branch | scala.Null]
}


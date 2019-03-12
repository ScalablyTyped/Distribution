package typings
package typedDashGithubDashApiLib.distInterfacesBranchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchRef extends js.Object {
  val name: java.lang.String
  val repository: typedDashGithubDashApiLib.distInterfacesRepositoryMod.RepositoryRef
  def loadAsync(): js.Promise[Branch | scala.Null]
}

object BranchRef {
  @scala.inline
  def apply(
    loadAsync: () => js.Promise[Branch | scala.Null],
    name: java.lang.String,
    repository: typedDashGithubDashApiLib.distInterfacesRepositoryMod.RepositoryRef
  ): BranchRef = {
    val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction0(loadAsync), name = name, repository = repository)
  
    __obj.asInstanceOf[BranchRef]
  }
}


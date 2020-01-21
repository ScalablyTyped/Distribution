package typings.typedGithubApi.interfacesBranchMod

import typings.typedGithubApi.interfacesRepositoryMod.RepositoryRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchRef extends js.Object {
  val name: String
  val repository: RepositoryRef
  def loadAsync(): js.Promise[Branch | Null]
}

object BranchRef {
  @scala.inline
  def apply(loadAsync: () => js.Promise[Branch | Null], name: String, repository: RepositoryRef): BranchRef = {
    val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction0(loadAsync), name = name.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BranchRef]
  }
}


package typings.typedGithubApi.interfacesIssueMod

import typings.typedGithubApi.interfacesRepositoryMod.Repository
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueRef extends js.Object {
  val number: Double
  def loadAsync(): js.Promise[Issue | Null]
  def loadRepositoryAsync(): js.Promise[Repository]
}

object IssueRef {
  @scala.inline
  def apply(
    loadAsync: () => js.Promise[Issue | Null],
    loadRepositoryAsync: () => js.Promise[Repository],
    number: Double
  ): IssueRef = {
    val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction0(loadAsync), loadRepositoryAsync = js.Any.fromFunction0(loadRepositoryAsync), number = number.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IssueRef]
  }
}


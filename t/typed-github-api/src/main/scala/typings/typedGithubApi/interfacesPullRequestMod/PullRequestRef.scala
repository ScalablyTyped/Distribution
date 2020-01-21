package typings.typedGithubApi.interfacesPullRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestRef extends js.Object {
  val number: Double
  def loadAsync(): js.Promise[PullRequest | Null]
}

object PullRequestRef {
  @scala.inline
  def apply(loadAsync: () => js.Promise[PullRequest | Null], number: Double): PullRequestRef = {
    val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction0(loadAsync), number = number.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullRequestRef]
  }
}


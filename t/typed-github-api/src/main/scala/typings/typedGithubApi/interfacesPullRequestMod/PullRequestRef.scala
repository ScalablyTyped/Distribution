package typings.typedGithubApi.interfacesPullRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullRequestRef extends js.Object {
  val number: Double = js.native
  def loadAsync(): js.Promise[PullRequest | Null] = js.native
}

object PullRequestRef {
  @scala.inline
  def apply(loadAsync: () => js.Promise[PullRequest | Null], number: Double): PullRequestRef = {
    val __obj = js.Dynamic.literal(loadAsync = js.Any.fromFunction0(loadAsync), number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullRequestRef]
  }
  @scala.inline
  implicit class PullRequestRefOps[Self <: PullRequestRef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoadAsync(value: () => js.Promise[PullRequest | Null]): Self = this.set("loadAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
  }
  
}


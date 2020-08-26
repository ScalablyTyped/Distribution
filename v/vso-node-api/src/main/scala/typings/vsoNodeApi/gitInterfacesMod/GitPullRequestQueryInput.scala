package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitPullRequestQueryInput extends js.Object {
  /**
    * The list of commit IDs to search for.
    */
  var items: js.Array[String] = js.native
  /**
    * The type of query to perform.
    */
  var `type`: GitPullRequestQueryType = js.native
}

object GitPullRequestQueryInput {
  @scala.inline
  def apply(items: js.Array[String], `type`: GitPullRequestQueryType): GitPullRequestQueryInput = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitPullRequestQueryInput]
  }
  @scala.inline
  implicit class GitPullRequestQueryInputOps[Self <: GitPullRequestQueryInput] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: String*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[String]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: GitPullRequestQueryType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


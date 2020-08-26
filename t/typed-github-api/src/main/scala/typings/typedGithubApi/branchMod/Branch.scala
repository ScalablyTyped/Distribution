package typings.typedGithubApi.branchMod

import typings.typedGithubApi.anon.Html
import typings.typedGithubApi.commitMod.CommitSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Branch extends js.Object {
  var _links: Html = js.native
  var commit: CommitSummary = js.native
  var name: String = js.native
  var `protected`: js.UndefOr[Boolean] = js.native
  var protection_url: js.UndefOr[String] = js.native
}

object Branch {
  @scala.inline
  def apply(_links: Html, commit: CommitSummary, name: String): Branch = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branch]
  }
  @scala.inline
  implicit class BranchOps[Self <: Branch] (val x: Self) extends AnyVal {
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
    def set_links(value: Html): Self = this.set("_links", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommit(value: CommitSummary): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtected(value: Boolean): Self = this.set("protected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtected: Self = this.set("protected", js.undefined)
    @scala.inline
    def setProtection_url(value: String): Self = this.set("protection_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtection_url: Self = this.set("protection_url", js.undefined)
  }
  
}


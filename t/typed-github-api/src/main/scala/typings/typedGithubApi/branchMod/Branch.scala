package typings.typedGithubApi.branchMod

import typings.typedGithubApi.anon.Html
import typings.typedGithubApi.commitMod.CommitSummary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Branch extends js.Object {
  var _links: Html
  var commit: CommitSummary
  var name: String
  var `protected`: js.UndefOr[Boolean] = js.undefined
  var protection_url: js.UndefOr[String] = js.undefined
}

object Branch {
  @scala.inline
  def apply(
    _links: Html,
    commit: CommitSummary,
    name: String,
    `protected`: js.UndefOr[Boolean] = js.undefined,
    protection_url: String = null
  ): Branch = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(`protected`)) __obj.updateDynamic("protected")(`protected`.get.asInstanceOf[js.Any])
    if (protection_url != null) __obj.updateDynamic("protection_url")(protection_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branch]
  }
}


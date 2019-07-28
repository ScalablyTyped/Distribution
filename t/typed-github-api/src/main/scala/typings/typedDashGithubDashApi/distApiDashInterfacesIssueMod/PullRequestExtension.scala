package typings.typedDashGithubDashApi.distApiDashInterfacesIssueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestExtension extends js.Object {
  var diff_url: String
  var html_url: String
  var patch_url: String
  var url: String
}

object PullRequestExtension {
  @scala.inline
  def apply(diff_url: String, html_url: String, patch_url: String, url: String): PullRequestExtension = {
    val __obj = js.Dynamic.literal(diff_url = diff_url, html_url = html_url, patch_url = patch_url, url = url)
  
    __obj.asInstanceOf[PullRequestExtension]
  }
}


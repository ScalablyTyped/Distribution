package typings
package typedDashGithubDashApiLib.distApiDashInterfacesIssueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullRequestExtension extends js.Object {
  var diff_url: java.lang.String
  var html_url: java.lang.String
  var patch_url: java.lang.String
  var url: java.lang.String
}

object PullRequestExtension {
  @scala.inline
  def apply(
    diff_url: java.lang.String,
    html_url: java.lang.String,
    patch_url: java.lang.String,
    url: java.lang.String
  ): PullRequestExtension = {
    val __obj = js.Dynamic.literal(diff_url = diff_url, html_url = html_url, patch_url = patch_url, url = url)
  
    __obj.asInstanceOf[PullRequestExtension]
  }
}


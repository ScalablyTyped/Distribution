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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("diff_url")(diff_url)
    __obj.updateDynamic("html_url")(html_url)
    __obj.updateDynamic("patch_url")(patch_url)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[PullRequestExtension]
  }
}


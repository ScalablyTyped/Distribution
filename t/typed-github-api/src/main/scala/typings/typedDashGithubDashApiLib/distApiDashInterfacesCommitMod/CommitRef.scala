package typings
package typedDashGithubDashApiLib.distApiDashInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitRef extends GitRef {
  var html_url: java.lang.String
}

object CommitRef {
  @scala.inline
  def apply(html_url: java.lang.String, sha: java.lang.String, url: java.lang.String): CommitRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("html_url")(html_url)
    __obj.updateDynamic("sha")(sha)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CommitRef]
  }
}


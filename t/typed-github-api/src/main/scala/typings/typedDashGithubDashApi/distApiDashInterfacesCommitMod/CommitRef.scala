package typings.typedDashGithubDashApi.distApiDashInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommitRef extends GitRef {
  var html_url: String
}

object CommitRef {
  @scala.inline
  def apply(html_url: String, sha: String, url: String): CommitRef = {
    val __obj = js.Dynamic.literal(html_url = html_url.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommitRef]
  }
}


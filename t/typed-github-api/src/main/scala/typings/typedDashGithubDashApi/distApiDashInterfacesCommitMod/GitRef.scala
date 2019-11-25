package typings.typedDashGithubDashApi.distApiDashInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRef extends js.Object {
  var sha: String
  var url: String
}

object GitRef {
  @scala.inline
  def apply(sha: String, url: String): GitRef = {
    val __obj = js.Dynamic.literal(sha = sha.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitRef]
  }
}


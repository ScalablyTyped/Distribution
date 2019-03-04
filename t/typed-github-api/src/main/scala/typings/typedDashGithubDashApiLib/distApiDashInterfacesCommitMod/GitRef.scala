package typings
package typedDashGithubDashApiLib.distApiDashInterfacesCommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRef extends js.Object {
  var sha: java.lang.String
  var url: java.lang.String
}

object GitRef {
  @scala.inline
  def apply(sha: java.lang.String, url: java.lang.String): GitRef = {
    val __obj = js.Dynamic.literal(sha = sha, url = url)
  
    __obj.asInstanceOf[GitRef]
  }
}


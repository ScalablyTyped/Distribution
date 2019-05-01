package typings
package typestubDashIpfsLib.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  var commit: java.lang.String
  var repo: java.lang.String
  var version: java.lang.String
}

object Version {
  @scala.inline
  def apply(commit: java.lang.String, repo: java.lang.String, version: java.lang.String): Version = {
    val __obj = js.Dynamic.literal(commit = commit, repo = repo, version = version)
  
    __obj.asInstanceOf[Version]
  }
}


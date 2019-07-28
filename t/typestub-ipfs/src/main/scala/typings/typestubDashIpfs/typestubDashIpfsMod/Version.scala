package typings.typestubDashIpfs.typestubDashIpfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  var commit: String
  var repo: String
  var version: String
}

object Version {
  @scala.inline
  def apply(commit: String, repo: String, version: String): Version = {
    val __obj = js.Dynamic.literal(commit = commit, repo = repo, version = version)
  
    __obj.asInstanceOf[Version]
  }
}


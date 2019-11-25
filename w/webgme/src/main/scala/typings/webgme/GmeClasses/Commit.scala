package typings.webgme.GmeClasses

import typings.webgme.GmeCommon.MetadataHash
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commit extends js.Object {
  var branchName: String
  var commitHash: MetadataHash
  var status: String
}

object Commit {
  @scala.inline
  def apply(branchName: String, commitHash: MetadataHash, status: String): Commit = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], commitHash = commitHash.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Commit]
  }
}


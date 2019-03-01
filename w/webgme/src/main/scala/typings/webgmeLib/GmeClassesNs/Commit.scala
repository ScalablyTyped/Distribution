package typings
package webgmeLib.GmeClassesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Commit extends js.Object {
  var branchName: java.lang.String
  var commitHash: webgmeLib.GmeCommonNs.MetadataHash
  var status: java.lang.String
}

object Commit {
  @scala.inline
  def apply(
    branchName: java.lang.String,
    commitHash: webgmeLib.GmeCommonNs.MetadataHash,
    status: java.lang.String
  ): Commit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("branchName")(branchName)
    __obj.updateDynamic("commitHash")(commitHash)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Commit]
  }
}


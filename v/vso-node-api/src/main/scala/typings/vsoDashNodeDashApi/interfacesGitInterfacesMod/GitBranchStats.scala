package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitBranchStats extends js.Object {
  /**
    * Number of commits ahead.
    */
  var aheadCount: Double
  /**
    * Number of commits behind.
    */
  var behindCount: Double
  /**
    * Current commit.
    */
  var commit: GitCommitRef
  /**
    * True if this is the result for the base version.
    */
  var isBaseVersion: Boolean
  /**
    * Name of the ref.
    */
  var name: String
}

object GitBranchStats {
  @scala.inline
  def apply(
    aheadCount: Double,
    behindCount: Double,
    commit: GitCommitRef,
    isBaseVersion: Boolean,
    name: String
  ): GitBranchStats = {
    val __obj = js.Dynamic.literal(aheadCount = aheadCount.asInstanceOf[js.Any], behindCount = behindCount.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], isBaseVersion = isBaseVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitBranchStats]
  }
}


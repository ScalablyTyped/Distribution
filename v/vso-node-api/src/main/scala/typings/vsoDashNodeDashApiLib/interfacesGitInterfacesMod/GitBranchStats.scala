package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitBranchStats extends js.Object {
  /**
    * Number of commits ahead.
    */
  var aheadCount: scala.Double
  /**
    * Number of commits behind.
    */
  var behindCount: scala.Double
  /**
    * Current commit.
    */
  var commit: GitCommitRef
  /**
    * True if this is the result for the base version.
    */
  var isBaseVersion: scala.Boolean
  /**
    * Name of the ref.
    */
  var name: java.lang.String
}

object GitBranchStats {
  @scala.inline
  def apply(
    aheadCount: scala.Double,
    behindCount: scala.Double,
    commit: GitCommitRef,
    isBaseVersion: scala.Boolean,
    name: java.lang.String
  ): GitBranchStats = {
    val __obj = js.Dynamic.literal(aheadCount = aheadCount, behindCount = behindCount, commit = commit, isBaseVersion = isBaseVersion, name = name)
  
    __obj.asInstanceOf[GitBranchStats]
  }
}


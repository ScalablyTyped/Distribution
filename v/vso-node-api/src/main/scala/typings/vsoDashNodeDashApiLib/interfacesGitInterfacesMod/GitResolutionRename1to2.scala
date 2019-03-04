package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitResolutionRename1to2 extends GitResolutionMergeContent {
  var action: GitResolutionRename1to2Action
}

object GitResolutionRename1to2 {
  @scala.inline
  def apply(
    action: GitResolutionRename1to2Action,
    mergeType: GitResolutionMergeType,
    userMergedBlob: GitBlobRef,
    userMergedContent: js.Array[scala.Double]
  ): GitResolutionRename1to2 = {
    val __obj = js.Dynamic.literal(action = action, mergeType = mergeType, userMergedBlob = userMergedBlob, userMergedContent = userMergedContent)
  
    __obj.asInstanceOf[GitResolutionRename1to2]
  }
}


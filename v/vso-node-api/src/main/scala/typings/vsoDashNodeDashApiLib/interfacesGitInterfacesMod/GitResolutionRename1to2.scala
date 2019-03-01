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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("mergeType")(mergeType)
    __obj.updateDynamic("userMergedBlob")(userMergedBlob)
    __obj.updateDynamic("userMergedContent")(userMergedContent)
    __obj.asInstanceOf[GitResolutionRename1to2]
  }
}


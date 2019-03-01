package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitResolutionMergeContent extends GitResolution {
  var mergeType: GitResolutionMergeType
  var userMergedBlob: GitBlobRef
  var userMergedContent: js.Array[scala.Double]
}

object GitResolutionMergeContent {
  @scala.inline
  def apply(
    mergeType: GitResolutionMergeType,
    userMergedBlob: GitBlobRef,
    userMergedContent: js.Array[scala.Double]
  ): GitResolutionMergeContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mergeType")(mergeType)
    __obj.updateDynamic("userMergedBlob")(userMergedBlob)
    __obj.updateDynamic("userMergedContent")(userMergedContent)
    __obj.asInstanceOf[GitResolutionMergeContent]
  }
}


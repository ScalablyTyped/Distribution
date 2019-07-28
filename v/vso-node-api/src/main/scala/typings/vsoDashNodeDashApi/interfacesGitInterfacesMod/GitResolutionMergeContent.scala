package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitResolutionMergeContent extends GitResolution {
  var mergeType: GitResolutionMergeType
  var userMergedBlob: GitBlobRef
  var userMergedContent: js.Array[Double]
}

object GitResolutionMergeContent {
  @scala.inline
  def apply(mergeType: GitResolutionMergeType, userMergedBlob: GitBlobRef, userMergedContent: js.Array[Double]): GitResolutionMergeContent = {
    val __obj = js.Dynamic.literal(mergeType = mergeType, userMergedBlob = userMergedBlob, userMergedContent = userMergedContent)
  
    __obj.asInstanceOf[GitResolutionMergeContent]
  }
}


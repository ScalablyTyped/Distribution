package typings.vsoNodeApi.gitInterfacesMod

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
    val __obj = js.Dynamic.literal(mergeType = mergeType.asInstanceOf[js.Any], userMergedBlob = userMergedBlob.asInstanceOf[js.Any], userMergedContent = userMergedContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitResolutionMergeContent]
  }
}


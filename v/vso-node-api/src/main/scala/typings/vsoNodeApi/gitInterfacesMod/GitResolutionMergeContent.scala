package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitResolutionMergeContent extends GitResolution {
  
  var mergeType: GitResolutionMergeType = js.native
  
  var userMergedBlob: GitBlobRef = js.native
  
  var userMergedContent: js.Array[Double] = js.native
}
object GitResolutionMergeContent {
  
  @scala.inline
  def apply(mergeType: GitResolutionMergeType, userMergedBlob: GitBlobRef, userMergedContent: js.Array[Double]): GitResolutionMergeContent = {
    val __obj = js.Dynamic.literal(mergeType = mergeType.asInstanceOf[js.Any], userMergedBlob = userMergedBlob.asInstanceOf[js.Any], userMergedContent = userMergedContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitResolutionMergeContent]
  }
  
  @scala.inline
  implicit class GitResolutionMergeContentOps[Self <: GitResolutionMergeContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMergeType(value: GitResolutionMergeType): Self = this.set("mergeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMergedBlob(value: GitBlobRef): Self = this.set("userMergedBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMergedContentVarargs(value: Double*): Self = this.set("userMergedContent", js.Array(value :_*))
    
    @scala.inline
    def setUserMergedContent(value: js.Array[Double]): Self = this.set("userMergedContent", value.asInstanceOf[js.Any])
  }
}

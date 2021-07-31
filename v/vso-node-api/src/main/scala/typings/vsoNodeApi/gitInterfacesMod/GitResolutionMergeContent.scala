package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitResolutionMergeContent
  extends StObject
     with GitResolution {
  
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
  
  @scala.inline
  implicit class GitResolutionMergeContentMutableBuilder[Self <: GitResolutionMergeContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMergeType(value: GitResolutionMergeType): Self = StObject.set(x, "mergeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMergedBlob(value: GitBlobRef): Self = StObject.set(x, "userMergedBlob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMergedContent(value: js.Array[Double]): Self = StObject.set(x, "userMergedContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserMergedContentVarargs(value: Double*): Self = StObject.set(x, "userMergedContent", js.Array(value :_*))
  }
}

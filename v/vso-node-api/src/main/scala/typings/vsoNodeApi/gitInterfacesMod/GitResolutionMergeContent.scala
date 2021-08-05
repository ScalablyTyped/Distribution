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
  
  inline def apply(mergeType: GitResolutionMergeType, userMergedBlob: GitBlobRef, userMergedContent: js.Array[Double]): GitResolutionMergeContent = {
    val __obj = js.Dynamic.literal(mergeType = mergeType.asInstanceOf[js.Any], userMergedBlob = userMergedBlob.asInstanceOf[js.Any], userMergedContent = userMergedContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitResolutionMergeContent]
  }
  
  extension [Self <: GitResolutionMergeContent](x: Self) {
    
    inline def setMergeType(value: GitResolutionMergeType): Self = StObject.set(x, "mergeType", value.asInstanceOf[js.Any])
    
    inline def setUserMergedBlob(value: GitBlobRef): Self = StObject.set(x, "userMergedBlob", value.asInstanceOf[js.Any])
    
    inline def setUserMergedContent(value: js.Array[Double]): Self = StObject.set(x, "userMergedContent", value.asInstanceOf[js.Any])
    
    inline def setUserMergedContentVarargs(value: Double*): Self = StObject.set(x, "userMergedContent", js.Array(value :_*))
  }
}

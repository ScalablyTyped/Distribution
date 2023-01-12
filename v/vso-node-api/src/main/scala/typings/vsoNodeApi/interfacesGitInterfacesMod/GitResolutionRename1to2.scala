package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitResolutionRename1to2
  extends StObject
     with GitResolutionMergeContent {
  
  var action: GitResolutionRename1to2Action
}
object GitResolutionRename1to2 {
  
  inline def apply(
    action: GitResolutionRename1to2Action,
    mergeType: GitResolutionMergeType,
    userMergedBlob: GitBlobRef,
    userMergedContent: js.Array[Double]
  ): GitResolutionRename1to2 = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], mergeType = mergeType.asInstanceOf[js.Any], userMergedBlob = userMergedBlob.asInstanceOf[js.Any], userMergedContent = userMergedContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitResolutionRename1to2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GitResolutionRename1to2] (val x: Self) extends AnyVal {
    
    inline def setAction(value: GitResolutionRename1to2Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
  }
}

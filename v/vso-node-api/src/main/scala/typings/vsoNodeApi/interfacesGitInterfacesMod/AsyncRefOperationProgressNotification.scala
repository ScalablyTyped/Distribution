package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncRefOperationProgressNotification
  extends StObject
     with AsyncRefOperationCommitLevelEventNotification {
  
  var progress: Double
}
object AsyncRefOperationProgressNotification {
  
  inline def apply(commitId: String, operationId: Double, progress: Double): AsyncRefOperationProgressNotification = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], operationId = operationId.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncRefOperationProgressNotification]
  }
  
  extension [Self <: AsyncRefOperationProgressNotification](x: Self) {
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
  }
}

package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitRevert
  extends StObject
     with GitAsyncRefOperation {
  
  var revertId: Double
}
object GitRevert {
  
  @scala.inline
  def apply(
    _links: js.Any,
    detailedStatus: GitAsyncRefOperationDetail,
    parameters: GitAsyncRefOperationParameters,
    revertId: Double,
    status: GitAsyncOperationStatus,
    url: String
  ): GitRevert = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], detailedStatus = detailedStatus.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], revertId = revertId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRevert]
  }
  
  @scala.inline
  implicit class GitRevertMutableBuilder[Self <: GitRevert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRevertId(value: Double): Self = StObject.set(x, "revertId", value.asInstanceOf[js.Any])
  }
}

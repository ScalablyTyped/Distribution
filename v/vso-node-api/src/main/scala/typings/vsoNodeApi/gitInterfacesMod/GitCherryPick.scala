package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitCherryPick extends GitAsyncRefOperation {
  
  var cherryPickId: Double = js.native
}
object GitCherryPick {
  
  @scala.inline
  def apply(
    _links: js.Any,
    cherryPickId: Double,
    detailedStatus: GitAsyncRefOperationDetail,
    parameters: GitAsyncRefOperationParameters,
    status: GitAsyncOperationStatus,
    url: String
  ): GitCherryPick = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], cherryPickId = cherryPickId.asInstanceOf[js.Any], detailedStatus = detailedStatus.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCherryPick]
  }
  
  @scala.inline
  implicit class GitCherryPickMutableBuilder[Self <: GitCherryPick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCherryPickId(value: Double): Self = StObject.set(x, "cherryPickId", value.asInstanceOf[js.Any])
  }
}

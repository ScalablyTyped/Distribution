package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitAsyncRefOperation extends js.Object {
  
  var _links: js.Any = js.native
  
  var detailedStatus: GitAsyncRefOperationDetail = js.native
  
  var parameters: GitAsyncRefOperationParameters = js.native
  
  var status: GitAsyncOperationStatus = js.native
  
  /**
    * A URL that can be used to make further requests for status about the operation
    */
  var url: String = js.native
}
object GitAsyncRefOperation {
  
  @scala.inline
  def apply(
    _links: js.Any,
    detailedStatus: GitAsyncRefOperationDetail,
    parameters: GitAsyncRefOperationParameters,
    status: GitAsyncOperationStatus,
    url: String
  ): GitAsyncRefOperation = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], detailedStatus = detailedStatus.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitAsyncRefOperation]
  }
  
  @scala.inline
  implicit class GitAsyncRefOperationOps[Self <: GitAsyncRefOperation] (val x: Self) extends AnyVal {
    
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedStatus(value: GitAsyncRefOperationDetail): Self = this.set("detailedStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: GitAsyncRefOperationParameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: GitAsyncOperationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}

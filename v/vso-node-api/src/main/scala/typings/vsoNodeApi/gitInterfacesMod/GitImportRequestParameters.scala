package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitImportRequestParameters extends js.Object {
  
  /**
    * Option to delete service endpoint when import is done
    */
  var deleteServiceEndpointAfterImportIsDone: Boolean = js.native
  
  /**
    * Source for importing git repository
    */
  var gitSource: GitImportGitSource = js.native
  
  /**
    * Service Endpoint for connection to external endpoint
    */
  var serviceEndpointId: String = js.native
  
  /**
    * Source for importing tfvc repository
    */
  var tfvcSource: GitImportTfvcSource = js.native
}
object GitImportRequestParameters {
  
  @scala.inline
  def apply(
    deleteServiceEndpointAfterImportIsDone: Boolean,
    gitSource: GitImportGitSource,
    serviceEndpointId: String,
    tfvcSource: GitImportTfvcSource
  ): GitImportRequestParameters = {
    val __obj = js.Dynamic.literal(deleteServiceEndpointAfterImportIsDone = deleteServiceEndpointAfterImportIsDone.asInstanceOf[js.Any], gitSource = gitSource.asInstanceOf[js.Any], serviceEndpointId = serviceEndpointId.asInstanceOf[js.Any], tfvcSource = tfvcSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitImportRequestParameters]
  }
  
  @scala.inline
  implicit class GitImportRequestParametersOps[Self <: GitImportRequestParameters] (val x: Self) extends AnyVal {
    
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
    def setDeleteServiceEndpointAfterImportIsDone(value: Boolean): Self = this.set("deleteServiceEndpointAfterImportIsDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitSource(value: GitImportGitSource): Self = this.set("gitSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceEndpointId(value: String): Self = this.set("serviceEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfvcSource(value: GitImportTfvcSource): Self = this.set("tfvcSource", value.asInstanceOf[js.Any])
  }
}

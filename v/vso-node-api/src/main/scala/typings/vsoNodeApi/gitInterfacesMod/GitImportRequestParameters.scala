package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitImportRequestParameters extends StObject {
  
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
  implicit class GitImportRequestParametersMutableBuilder[Self <: GitImportRequestParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteServiceEndpointAfterImportIsDone(value: Boolean): Self = StObject.set(x, "deleteServiceEndpointAfterImportIsDone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGitSource(value: GitImportGitSource): Self = StObject.set(x, "gitSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceEndpointId(value: String): Self = StObject.set(x, "serviceEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTfvcSource(value: GitImportTfvcSource): Self = StObject.set(x, "tfvcSource", value.asInstanceOf[js.Any])
  }
}

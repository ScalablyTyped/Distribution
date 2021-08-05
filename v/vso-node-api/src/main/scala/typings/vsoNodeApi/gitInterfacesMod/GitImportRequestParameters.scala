package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitImportRequestParameters extends StObject {
  
  /**
    * Option to delete service endpoint when import is done
    */
  var deleteServiceEndpointAfterImportIsDone: Boolean
  
  /**
    * Source for importing git repository
    */
  var gitSource: GitImportGitSource
  
  /**
    * Service Endpoint for connection to external endpoint
    */
  var serviceEndpointId: String
  
  /**
    * Source for importing tfvc repository
    */
  var tfvcSource: GitImportTfvcSource
}
object GitImportRequestParameters {
  
  inline def apply(
    deleteServiceEndpointAfterImportIsDone: Boolean,
    gitSource: GitImportGitSource,
    serviceEndpointId: String,
    tfvcSource: GitImportTfvcSource
  ): GitImportRequestParameters = {
    val __obj = js.Dynamic.literal(deleteServiceEndpointAfterImportIsDone = deleteServiceEndpointAfterImportIsDone.asInstanceOf[js.Any], gitSource = gitSource.asInstanceOf[js.Any], serviceEndpointId = serviceEndpointId.asInstanceOf[js.Any], tfvcSource = tfvcSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitImportRequestParameters]
  }
  
  extension [Self <: GitImportRequestParameters](x: Self) {
    
    inline def setDeleteServiceEndpointAfterImportIsDone(value: Boolean): Self = StObject.set(x, "deleteServiceEndpointAfterImportIsDone", value.asInstanceOf[js.Any])
    
    inline def setGitSource(value: GitImportGitSource): Self = StObject.set(x, "gitSource", value.asInstanceOf[js.Any])
    
    inline def setServiceEndpointId(value: String): Self = StObject.set(x, "serviceEndpointId", value.asInstanceOf[js.Any])
    
    inline def setTfvcSource(value: GitImportTfvcSource): Self = StObject.set(x, "tfvcSource", value.asInstanceOf[js.Any])
  }
}

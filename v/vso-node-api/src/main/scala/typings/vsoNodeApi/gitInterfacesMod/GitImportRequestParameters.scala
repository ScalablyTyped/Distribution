package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitImportRequestParameters extends js.Object {
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
}


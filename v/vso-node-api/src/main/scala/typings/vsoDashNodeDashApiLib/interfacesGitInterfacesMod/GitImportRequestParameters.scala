package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GitImportRequestParameters extends js.Object {
  /**
       * Option to delete service endpoint when import is done
       */
  var deleteServiceEndpointAfterImportIsDone: scala.Boolean
  /**
       * Source for importing git repository
       */
  var gitSource: GitImportGitSource
  /**
       * Service Endpoint for connection to external endpoint
       */
  var serviceEndpointId: java.lang.String
  /**
       * Source for importing tfvc repository
       */
  var tfvcSource: GitImportTfvcSource
}


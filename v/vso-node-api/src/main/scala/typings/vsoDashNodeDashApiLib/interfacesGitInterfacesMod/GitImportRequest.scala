package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GitImportRequest extends js.Object {
  /**
       * Links to related resources.
       */
  var _links: js.Any
  /**
       * Detailed status of the import, including the current step and an error message, if applicable.
       */
  var detailedStatus: GitImportStatusDetail
  /**
       * The unique identifier for this import request.
       */
  var importRequestId: scala.Double
  /**
       * Parameters for creating the import request.
       */
  var parameters: GitImportRequestParameters
  /**
       * The target repository for this import.
       */
  var repository: GitRepository
  /**
       * Current status of the import.
       */
  var status: GitAsyncOperationStatus
  /**
       * A link back to this import request resource.
       */
  var url: java.lang.String
}


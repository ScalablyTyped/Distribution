package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GitForkSyncRequest extends js.Object {
  /**
       * Collection of related links
       */
  var _links: js.Any
  var detailedStatus: GitForkOperationStatusDetail
  /**
       * Unique identifier for the operation.
       */
  var operationId: scala.Double
  /**
       * Fully-qualified identifier for the source repository.
       */
  var source: GlobalGitRepositoryKey
  /**
       * If supplied, the set of ref mappings to use when performing a "sync" or create. If missing, all refs will be synchronized.
       */
  var sourceToTargetRefs: js.Array[SourceToTargetRef]
  var status: GitAsyncOperationStatus
}


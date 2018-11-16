package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GitForkSyncRequestParameters extends js.Object {
  /**
       * Fully-qualified identifier for the source repository.
       */
  var source: GlobalGitRepositoryKey
  /**
       * If supplied, the set of ref mappings to use when performing a "sync" or create. If missing, all refs will be synchronized.
       */
  var sourceToTargetRefs: js.Array[SourceToTargetRef]
}


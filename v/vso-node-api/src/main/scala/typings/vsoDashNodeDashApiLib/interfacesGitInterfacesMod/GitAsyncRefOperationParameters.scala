package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GitAsyncRefOperationParameters extends js.Object {
  /**
       * Proposed target branch name for the cherry pick or revert operation.
       */
  var generatedRefName: java.lang.String
  /**
       * The target branch for the cherry pick or revert operation.
       */
  var ontoRefName: java.lang.String
  /**
       * The git repository for the cherry pick or revert operation.
       */
  var repository: GitRepository
  /**
       * Details about the source of the cherry pick or revert operation (e.g. A pull request or a specific commit).
       */
  var source: GitAsyncRefOperationSource
}


package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GitConflictDeleteRename extends GitConflict {
  var baseBlob: GitBlobRef
  var resolution: GitResolutionPickOneAction
  var targetBlob: GitBlobRef
  var targetNewPath: java.lang.String
}


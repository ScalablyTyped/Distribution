package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitConflictAddRename extends GitConflict {
  var baseBlob: GitBlobRef
  var resolution: GitResolutionPathConflict
  var sourceBlob: GitBlobRef
  var targetBlob: GitBlobRef
  var targetOriginalPath: java.lang.String
}


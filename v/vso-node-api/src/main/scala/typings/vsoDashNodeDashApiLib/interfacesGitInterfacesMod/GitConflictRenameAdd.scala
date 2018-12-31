package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitConflictRenameAdd extends GitConflict {
  var baseBlob: GitBlobRef
  var resolution: GitResolutionPathConflict
  var sourceBlob: GitBlobRef
  var sourceOriginalPath: java.lang.String
  var targetBlob: GitBlobRef
}


package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Either a parsed command line or a parsed tsconfig.json */
trait ParsedCommandLine extends js.Object {
  var compileOnSave: js.UndefOr[scala.Boolean] = js.undefined
  var errors: js.Array[Diagnostic]
  var fileNames: js.Array[java.lang.String]
  var options: CompilerOptions
  var projectReferences: js.UndefOr[js.Array[ProjectReference]] = js.undefined
  var raw: js.UndefOr[js.Any] = js.undefined
  var typeAcquisition: js.UndefOr[TypeAcquisition] = js.undefined
  var wildcardDirectories: js.UndefOr[MapLike[WatchDirectoryFlags]] = js.undefined
}


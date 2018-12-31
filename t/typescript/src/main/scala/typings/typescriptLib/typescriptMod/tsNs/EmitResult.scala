package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitResult extends js.Object {
  /** Contains declaration emit diagnostics */
  var diagnostics: js.Array[Diagnostic]
  var emitSkipped: scala.Boolean
  var emittedFiles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}


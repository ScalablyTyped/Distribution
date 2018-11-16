package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExitStatus extends js.Object

/** Return code used by getEmitOutput function to indicate status of the function */
@JSImport("typescript/ts", "ExitStatus")
@js.native
object ExitStatus extends js.Object {
  @js.native
  sealed trait DiagnosticsPresent_OutputsGenerated
    extends typescriptLib.typescriptMod.tsNs.ExitStatus
  
  @js.native
  sealed trait DiagnosticsPresent_OutputsSkipped
    extends typescriptLib.typescriptMod.tsNs.ExitStatus
  
  @js.native
  sealed trait Success
    extends typescriptLib.typescriptMod.tsNs.ExitStatus
  
}


package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExitStatus extends js.Object

/** Return code used by getEmitOutput function to indicate status of the function */
@JSImport("typescript", "ExitStatus")
@js.native
object ExitStatus extends js.Object {
  @js.native
  sealed trait DiagnosticsPresent_OutputsGenerated
    extends typescriptLib.typescriptMod.ExitStatus
  
  @js.native
  sealed trait DiagnosticsPresent_OutputsSkipped
    extends typescriptLib.typescriptMod.ExitStatus
  
  @js.native
  sealed trait Success
    extends typescriptLib.typescriptMod.ExitStatus
  
  /* 2 */ val DiagnosticsPresent_OutputsGenerated: DiagnosticsPresent_OutputsGenerated with scala.Double = js.native
  /* 1 */ val DiagnosticsPresent_OutputsSkipped: DiagnosticsPresent_OutputsSkipped with scala.Double = js.native
  /* 0 */ val Success: Success with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.ExitStatus with scala.Double] = js.native
}


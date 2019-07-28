package typings.typescript.typescriptMod

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
  sealed trait DiagnosticsPresent_OutputsGenerated extends ExitStatus
  
  @js.native
  sealed trait DiagnosticsPresent_OutputsSkipped extends ExitStatus
  
  @js.native
  sealed trait Success extends ExitStatus
  
  /* 2 */ val DiagnosticsPresent_OutputsGenerated: typings.typescript.typescriptMod.ExitStatus.DiagnosticsPresent_OutputsGenerated with Double = js.native
  /* 1 */ val DiagnosticsPresent_OutputsSkipped: typings.typescript.typescriptMod.ExitStatus.DiagnosticsPresent_OutputsSkipped with Double = js.native
  /* 0 */ val Success: typings.typescript.typescriptMod.ExitStatus.Success with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ExitStatus with Double] = js.native
}


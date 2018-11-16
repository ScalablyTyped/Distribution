package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Return code used by getEmitOutput function to indicate status of the function */
@JSImport("typescript", "ExitStatus")
@js.native
object ExitStatus extends js.Object {
  /* 2 */ val DiagnosticsPresent_OutputsGenerated: typescriptLib.typescriptMod.tsNs.ExitStatus.DiagnosticsPresent_OutputsGenerated with scala.Double = js.native
  /* 1 */ val DiagnosticsPresent_OutputsSkipped: typescriptLib.typescriptMod.tsNs.ExitStatus.DiagnosticsPresent_OutputsSkipped with scala.Double = js.native
  /* 0 */ val Success: typescriptLib.typescriptMod.tsNs.ExitStatus.Success with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typescriptLib.typescriptMod.tsNs.ExitStatus with scala.Double] = js.native
}


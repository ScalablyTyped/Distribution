package typings
package tslintLib.libRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Status extends js.Object

@JSImport("tslint/lib/runner", "Status")
@js.native
object Status extends js.Object {
  @js.native
  sealed trait FatalError
    extends tslintLib.libRunnerMod.Status
  
  @js.native
  sealed trait LintError
    extends tslintLib.libRunnerMod.Status
  
  @js.native
  sealed trait Ok
    extends tslintLib.libRunnerMod.Status
  
  /* 1 */ val FatalError: FatalError with scala.Double = js.native
  /* 2 */ val LintError: LintError with scala.Double = js.native
  /* 0 */ val Ok: Ok with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[tslintLib.libRunnerMod.Status with scala.Double] = js.native
}


package typings
package typedocLib.distLibCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExitCode extends js.Object

@JSImport("typedoc/dist/lib/cli", "ExitCode")
@js.native
object ExitCode extends js.Object {
  @js.native
  sealed trait CompileError
    extends typedocLib.distLibCliMod.ExitCode
  
  @js.native
  sealed trait NoInputFiles
    extends typedocLib.distLibCliMod.ExitCode
  
  @js.native
  sealed trait NoOutput
    extends typedocLib.distLibCliMod.ExitCode
  
  @js.native
  sealed trait OptionError
    extends typedocLib.distLibCliMod.ExitCode
  
  @js.native
  sealed trait OutputError
    extends typedocLib.distLibCliMod.ExitCode
  
  /* 4 */ val CompileError: CompileError with scala.Double = js.native
  /* 2 */ val NoInputFiles: NoInputFiles with scala.Double = js.native
  /* 3 */ val NoOutput: NoOutput with scala.Double = js.native
  /* 1 */ val OptionError: OptionError with scala.Double = js.native
  /* 5 */ val OutputError: OutputError with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typedocLib.distLibCliMod.ExitCode with scala.Double] = js.native
}


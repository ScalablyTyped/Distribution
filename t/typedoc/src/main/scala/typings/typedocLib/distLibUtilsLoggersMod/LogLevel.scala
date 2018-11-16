package typings
package typedocLib.distLibUtilsLoggersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogLevel extends js.Object

@JSImport("typedoc/dist/lib/utils/loggers", "LogLevel")
@js.native
object LogLevel extends js.Object {
  @js.native
  sealed trait Error
    extends typedocLib.distLibUtilsLoggersMod.LogLevel
  
  @js.native
  sealed trait Info
    extends typedocLib.distLibUtilsLoggersMod.LogLevel
  
  @js.native
  sealed trait Success
    extends typedocLib.distLibUtilsLoggersMod.LogLevel
  
  @js.native
  sealed trait Verbose
    extends typedocLib.distLibUtilsLoggersMod.LogLevel
  
  @js.native
  sealed trait Warn
    extends typedocLib.distLibUtilsLoggersMod.LogLevel
  
  /* 3 */ val Error: Error with scala.Double = js.native
  /* 1 */ val Info: Info with scala.Double = js.native
  /* 4 */ val Success: Success with scala.Double = js.native
  /* 0 */ val Verbose: Verbose with scala.Double = js.native
  /* 2 */ val Warn: Warn with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[typedocLib.distLibUtilsLoggersMod.LogLevel with scala.Double] = js.native
}


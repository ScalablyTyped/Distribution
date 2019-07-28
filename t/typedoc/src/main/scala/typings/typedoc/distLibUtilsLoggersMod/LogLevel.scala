package typings.typedoc.distLibUtilsLoggersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogLevel extends js.Object

@JSImport("typedoc/dist/lib/utils/loggers", "LogLevel")
@js.native
object LogLevel extends js.Object {
  @js.native
  sealed trait Error extends LogLevel
  
  @js.native
  sealed trait Info extends LogLevel
  
  @js.native
  sealed trait Success extends LogLevel
  
  @js.native
  sealed trait Verbose extends LogLevel
  
  @js.native
  sealed trait Warn extends LogLevel
  
  /* 3 */ val Error: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Error with Double = js.native
  /* 1 */ val Info: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Info with Double = js.native
  /* 4 */ val Success: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Success with Double = js.native
  /* 0 */ val Verbose: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Verbose with Double = js.native
  /* 2 */ val Warn: typings.typedoc.distLibUtilsLoggersMod.LogLevel.Warn with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
}


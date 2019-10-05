package typings.stropheDotJs.stropheDotJsMod.Strophe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogLevel extends js.Object

/** Constants: Log Level Constants
  *  Logging level indicators.
  *
  *  LogLevel.DEBUG - Debug output
  *  LogLevel.INFO - Informational output
  *  LogLevel.WARN - Warnings
  *  LogLevel.ERROR - Errors
  *  LogLevel.FATAL - Fatal errors
  */
@JSImport("strophe.js", "Strophe.LogLevel")
@js.native
object LogLevel extends js.Object {
  @js.native
  sealed trait DEBUG extends LogLevel
  
  @js.native
  sealed trait ERROR extends LogLevel
  
  @js.native
  sealed trait FATAL extends LogLevel
  
  @js.native
  sealed trait INFO extends LogLevel
  
  @js.native
  sealed trait WARN extends LogLevel
  
  /* 0 */ val DEBUG: typings.stropheDotJs.stropheDotJsMod.Strophe.LogLevel.DEBUG with Double = js.native
  /* 3 */ val ERROR: typings.stropheDotJs.stropheDotJsMod.Strophe.LogLevel.ERROR with Double = js.native
  /* 4 */ val FATAL: typings.stropheDotJs.stropheDotJsMod.Strophe.LogLevel.FATAL with Double = js.native
  /* 1 */ val INFO: typings.stropheDotJs.stropheDotJsMod.Strophe.LogLevel.INFO with Double = js.native
  /* 2 */ val WARN: typings.stropheDotJs.stropheDotJsMod.Strophe.LogLevel.WARN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
}


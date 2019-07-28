package typings.strophe.stropheMod.stropheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants: Log Level Constants
  *  Logging level indicators.
  *
  *  LogLevel.DEBUG - Debug output
  *  LogLevel.INFO - Informational output
  *  LogLevel.WARN - Warnings
  *  LogLevel.ERROR - Errors
  *  LogLevel.FATAL - Fatal errors
  */
@JSImport("Strophe", "LogLevel")
@js.native
object LogLevel extends js.Object {
  /* 0 */ val DEBUG: typings.strophe.stropheMod.StropheNs.LogLevel.DEBUG with Double = js.native
  /* 3 */ val ERROR: typings.strophe.stropheMod.StropheNs.LogLevel.ERROR with Double = js.native
  /* 4 */ val FATAL: typings.strophe.stropheMod.StropheNs.LogLevel.FATAL with Double = js.native
  /* 1 */ val INFO: typings.strophe.stropheMod.StropheNs.LogLevel.INFO with Double = js.native
  /* 2 */ val WARN: typings.strophe.stropheMod.StropheNs.LogLevel.WARN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.strophe.stropheMod.StropheNs.LogLevel with Double] = js.native
}


package typings
package stropheLib.stropheMod.stropheMod

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
  /* 0 */ val DEBUG: stropheLib.stropheMod.StropheNs.LogLevel.DEBUG with scala.Double = js.native
  /* 3 */ val ERROR: stropheLib.stropheMod.StropheNs.LogLevel.ERROR with scala.Double = js.native
  /* 4 */ val FATAL: stropheLib.stropheMod.StropheNs.LogLevel.FATAL with scala.Double = js.native
  /* 1 */ val INFO: stropheLib.stropheMod.StropheNs.LogLevel.INFO with scala.Double = js.native
  /* 2 */ val WARN: stropheLib.stropheMod.StropheNs.LogLevel.WARN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[stropheLib.stropheMod.StropheNs.LogLevel with scala.Double] = js.native
}


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
  val DEBUG: stropheLib.stropheMod.StropheNs.LogLevel.DEBUG with java.lang.String = js.native
  val ERROR: stropheLib.stropheMod.StropheNs.LogLevel.ERROR with java.lang.String = js.native
  val FATAL: stropheLib.stropheMod.StropheNs.LogLevel.FATAL with java.lang.String = js.native
  val INFO: stropheLib.stropheMod.StropheNs.LogLevel.INFO with java.lang.String = js.native
  val WARN: stropheLib.stropheMod.StropheNs.LogLevel.WARN with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[stropheLib.stropheMod.StropheNs.LogLevel with java.lang.String] = js.native
}


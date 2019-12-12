package typings.stropheDotJs.stropheDotJsMod.Strophe

import org.scalablytyped.runtime.TopLevel
import typings.stropheDotJs.stropheDotJsMod.Strophe.LogLevel.DEBUG
import typings.stropheDotJs.stropheDotJsMod.Strophe.LogLevel.ERROR
import typings.stropheDotJs.stropheDotJsMod.Strophe.LogLevel.FATAL
import typings.stropheDotJs.stropheDotJsMod.Strophe.LogLevel.INFO
import typings.stropheDotJs.stropheDotJsMod.Strophe.LogLevel.WARN
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogLevel with Double] = js.native
  /* 0 */ @js.native
  object DEBUG extends TopLevel[DEBUG with Double]
  
  /* 3 */ @js.native
  object ERROR extends TopLevel[ERROR with Double]
  
  /* 4 */ @js.native
  object FATAL extends TopLevel[FATAL with Double]
  
  /* 1 */ @js.native
  object INFO extends TopLevel[INFO with Double]
  
  /* 2 */ @js.native
  object WARN extends TopLevel[WARN with Double]
  
}


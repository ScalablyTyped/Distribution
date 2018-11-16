package typings
package webdriverDashManagerLib.builtLibCliLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogLevel extends js.Object

@JSImport("webdriver-manager/built/lib/cli/logger", "LogLevel")
@js.native
object LogLevel extends js.Object {
  @js.native
  sealed trait DEBUG
    extends webdriverDashManagerLib.builtLibCliLoggerMod.LogLevel
  
  @js.native
  sealed trait ERROR
    extends webdriverDashManagerLib.builtLibCliLoggerMod.LogLevel
  
  @js.native
  sealed trait INFO
    extends webdriverDashManagerLib.builtLibCliLoggerMod.LogLevel
  
  @js.native
  sealed trait WARN
    extends webdriverDashManagerLib.builtLibCliLoggerMod.LogLevel
  
  /* 3 */ val DEBUG: DEBUG with scala.Double = js.native
  /* 0 */ val ERROR: ERROR with scala.Double = js.native
  /* 2 */ val INFO: INFO with scala.Double = js.native
  /* 1 */ val WARN: WARN with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webdriverDashManagerLib.builtLibCliLoggerMod.LogLevel with scala.Double] = js.native
}


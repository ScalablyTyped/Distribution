package typings
package webdriverDashManagerLib.builtLibCliLoggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WriteTo extends js.Object

@JSImport("webdriver-manager/built/lib/cli/logger", "WriteTo")
@js.native
object WriteTo extends js.Object {
  @js.native
  sealed trait BOTH
    extends webdriverDashManagerLib.builtLibCliLoggerMod.WriteTo
  
  @js.native
  sealed trait CONSOLE
    extends webdriverDashManagerLib.builtLibCliLoggerMod.WriteTo
  
  @js.native
  sealed trait FILE
    extends webdriverDashManagerLib.builtLibCliLoggerMod.WriteTo
  
  @js.native
  sealed trait NONE
    extends webdriverDashManagerLib.builtLibCliLoggerMod.WriteTo
  
  /* 2 */ val BOTH: BOTH with scala.Double = js.native
  /* 0 */ val CONSOLE: CONSOLE with scala.Double = js.native
  /* 1 */ val FILE: FILE with scala.Double = js.native
  /* 3 */ val NONE: NONE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[webdriverDashManagerLib.builtLibCliLoggerMod.WriteTo with scala.Double] = js.native
}


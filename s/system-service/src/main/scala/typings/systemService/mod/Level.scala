package typings.systemService.mod

import typings.systemLogger.mod.level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("system-service", "Level")
@js.native
object Level extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[level with Double] = js.native
  
  /* 4 */ val debug: typings.systemLogger.mod.level.debug with Double = js.native
  
  /* 0 */ val error: typings.systemLogger.mod.level.error with Double = js.native
  
  /* 2 */ val info: typings.systemLogger.mod.level.info with Double = js.native
  
  /* 5 */ val silly: typings.systemLogger.mod.level.silly with Double = js.native
  
  /* 3 */ val verbose: typings.systemLogger.mod.level.verbose with Double = js.native
  
  /* 1 */ val warn: typings.systemLogger.mod.level.warn with Double = js.native
}

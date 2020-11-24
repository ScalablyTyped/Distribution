package typings.systemService.mod

import typings.systemLogger.mod.fileRotateType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("system-service", "FileRotateType")
@js.native
object FileRotateType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[fileRotateType with Double] = js.native
  
  /* 2 */ val daily: typings.systemLogger.mod.fileRotateType.daily with Double = js.native
  
  /* 3 */ val hourly: typings.systemLogger.mod.fileRotateType.hourly with Double = js.native
  
  /* 4 */ val minutely: typings.systemLogger.mod.fileRotateType.minutely with Double = js.native
  
  /* 0 */ val monthly: typings.systemLogger.mod.fileRotateType.monthly with Double = js.native
  
  /* 1 */ val weekly: typings.systemLogger.mod.fileRotateType.weekly with Double = js.native
}

package typings.yogLog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yog-log", "getLogger")
@js.native
object getLogger extends js.Object {
  
  def apply(): Logger = js.native
  def apply(config: LogConfig): Logger = js.native
}

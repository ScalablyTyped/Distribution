package typings.systeminformation.mod

import typings.systeminformation.mod.Systeminformation.BatteryData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("systeminformation", "battery")
@js.native
object battery extends js.Object {
  
  def apply(): js.Promise[BatteryData] = js.native
  def apply(cb: js.Function1[/* data */ BatteryData, _]): js.Promise[BatteryData] = js.native
}

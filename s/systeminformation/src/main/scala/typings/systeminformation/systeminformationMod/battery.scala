package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.BatteryData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "battery")
@js.native
object battery extends js.Object {
  def apply(): js.Promise[BatteryData] = js.native
  def apply(cb: js.Function1[/* data */ BatteryData, _]): js.Promise[BatteryData] = js.native
}


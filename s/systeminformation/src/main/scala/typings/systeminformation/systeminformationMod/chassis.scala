package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.ChassisData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "chassis")
@js.native
object chassis extends js.Object {
  def apply(): js.Promise[ChassisData] = js.native
  def apply(cb: js.Function1[/* data */ ChassisData, _]): js.Promise[ChassisData] = js.native
}


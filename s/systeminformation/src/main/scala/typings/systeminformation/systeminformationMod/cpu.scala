package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.CpuData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "cpu")
@js.native
object cpu extends js.Object {
  def apply(): js.Promise[CpuData] = js.native
  def apply(cb: js.Function1[/* data */ CpuData, _]): js.Promise[CpuData] = js.native
}


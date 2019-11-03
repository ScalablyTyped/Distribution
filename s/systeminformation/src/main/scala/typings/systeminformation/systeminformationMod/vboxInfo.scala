package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.VboxInfoData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "vboxInfo")
@js.native
object vboxInfo extends js.Object {
  def apply(): js.Promise[js.Array[VboxInfoData]] = js.native
  def apply(cb: js.Function1[/* data */ js.Array[VboxInfoData], _]): js.Promise[js.Array[VboxInfoData]] = js.native
}


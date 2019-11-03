package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.BiosData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "bios")
@js.native
object bios extends js.Object {
  def apply(): js.Promise[BiosData] = js.native
  def apply(cb: js.Function1[/* data */ BiosData, _]): js.Promise[BiosData] = js.native
}


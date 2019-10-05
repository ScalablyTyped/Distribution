package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.SystemData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "system")
@js.native
object system extends js.Object {
  def apply(): js.Promise[SystemData] = js.native
  def apply(cb: js.Function1[/* data */ SystemData, _]): js.Promise[SystemData] = js.native
}


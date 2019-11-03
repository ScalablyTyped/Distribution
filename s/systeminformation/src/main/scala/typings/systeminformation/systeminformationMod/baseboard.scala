package typings.systeminformation.systeminformationMod

import typings.systeminformation.systeminformationMod.Systeminformation.BaseboardData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "baseboard")
@js.native
object baseboard extends js.Object {
  def apply(): js.Promise[BaseboardData] = js.native
  def apply(cb: js.Function1[/* data */ BaseboardData, _]): js.Promise[BaseboardData] = js.native
}


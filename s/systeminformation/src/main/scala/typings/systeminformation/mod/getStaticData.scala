package typings.systeminformation.mod

import typings.systeminformation.mod.Systeminformation.StaticData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("systeminformation", "getStaticData")
@js.native
object getStaticData extends js.Object {
  def apply(): js.Promise[StaticData] = js.native
  def apply(cb: js.Function1[/* data */ StaticData, _]): js.Promise[StaticData] = js.native
}


package typings.vexdb.vexdbMod

import typings.vexdb.vexdbStrings.awards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "live")
@js.native
object live_awards extends js.Object {
  def apply(endpoint: awards, params: LiveRequestObject[AwardsRequestObject]): LiveEventEmitter[AwardsRequestObject, AwardsResponseObject] = js.native
}


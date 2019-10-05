package typings.vexdb.vexdbMod

import typings.vexdb.vexdbStrings.awards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb", "get")
@js.native
object get_awards extends js.Object {
  def apply(endpoint: awards, params: AwardsRequestObject): js.Promise[js.Array[AwardsResponseObject]] = js.native
}


package typings.vexdb.cacheMod

import typings.vexdb.requestObjectsMod.AwardsRequestObject
import typings.vexdb.vexdbStrings.awards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vexdb/out/methods/cache", "resolve")
@js.native
object resolve_awards extends js.Object {
  def apply(endpoint: awards, params: AwardsRequestObject): js.Promise[APIResponse[AwardsRequestObject]] = js.native
}


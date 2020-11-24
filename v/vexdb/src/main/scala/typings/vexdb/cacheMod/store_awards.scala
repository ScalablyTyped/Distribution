package typings.vexdb.cacheMod

import typings.vexdb.requestObjectsMod.AwardsRequestObject
import typings.vexdb.responseObjectsMod.AwardsResponseObject
import typings.vexdb.vexdbStrings.awards
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vexdb/out/methods/cache", "store")
@js.native
object store_awards extends js.Object {
  
  def apply(endpoint: awards, params: AwardsRequestObject, data: APIResponse[AwardsResponseObject]): js.Promise[Boolean] = js.native
}

package typings.urqlCore.typesMod

import typings.urqlCore.clientMod.Client
import typings.wonka.wonkaTypesGenMod.sourceT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExchangeInput extends js.Object {
  var client: Client = js.native
  @JSName("forward")
  var forward_Original: ExchangeIO = js.native
  def forward(ops$: sourceT[Operation]): sourceT[OperationResult[_]] = js.native
}


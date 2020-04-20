package typings.thrift

import typings.thrift.mod.TClientConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClient[TClient] extends TClientConstructor[TClient] {
  var Client: AnonInstantiableTClient[TClient]
}

object AnonClient {
  @scala.inline
  def apply[TClient](Client: AnonInstantiableTClient[TClient]): AnonClient[TClient] = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClient[TClient]]
  }
}


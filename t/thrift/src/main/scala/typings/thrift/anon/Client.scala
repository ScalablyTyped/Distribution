package typings.thrift.anon

import typings.thrift.mod.TClientConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Client[TClient] extends TClientConstructor[TClient] {
  var Client: InstantiableTClient[TClient]
}

object Client {
  @scala.inline
  def apply[TClient](Client: InstantiableTClient[TClient]): Client[TClient] = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any])
    __obj.asInstanceOf[Client[TClient]]
  }
}


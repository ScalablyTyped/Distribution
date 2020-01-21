package typings.thrift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "createWSClient")
@js.native
object createWSClient extends js.Object {
  def apply[TClient](client: TClientConstructor[TClient], connection: WSConnection): TClient = js.native
}


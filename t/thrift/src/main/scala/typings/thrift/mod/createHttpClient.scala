package typings.thrift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "createHttpClient")
@js.native
object createHttpClient extends js.Object {
  def apply[TClient](client: TClientConstructor[TClient], connection: HttpConnection): TClient = js.native
}


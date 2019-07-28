package typings.thrift.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "Multiplexer")
@js.native
class Multiplexer () extends js.Object {
  def createClient[TClient](serviceName: String, client: TClientConstructor[TClient], connection: Connection): TClient = js.native
}


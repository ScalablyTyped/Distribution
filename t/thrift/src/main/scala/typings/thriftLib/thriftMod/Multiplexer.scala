package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "Multiplexer")
@js.native
class Multiplexer () extends js.Object {
  def createClient[TClient](serviceName: java.lang.String, client: TClientConstructor[TClient], connection: Connection): TClient = js.native
}


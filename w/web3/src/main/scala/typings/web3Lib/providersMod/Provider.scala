package typings
package web3Lib.providersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3/providers", "Provider")
@js.native
class Provider () extends js.Object {
  def send(
    payload: JsonRPCRequest,
    callback: js.Function2[/* e */ stdLib.Error, /* val */ JsonRPCResponse, scala.Unit]
  ): js.Any = js.native
}


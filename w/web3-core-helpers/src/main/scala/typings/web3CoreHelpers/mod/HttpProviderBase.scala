package typings.web3CoreHelpers.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web3-core-helpers", "HttpProviderBase")
@js.native
class HttpProviderBase protected () extends js.Object {
  def this(host: String) = this()
  def this(host: String, options: HttpProviderOptions) = this()
  
  var connected: Boolean = js.native
  
  def disconnect(): Boolean = js.native
  
  var host: String = js.native
  
  def send(
    payload: JsonRpcPayload,
    callback: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]
  ): Unit = js.native
  
  def supportsSubscriptions(): Boolean = js.native
}

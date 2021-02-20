package typings.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterCallbacksHash extends StObject {
  
  var onError: js.UndefOr[ErrorCallback] = js.native
  
  var onSuccess: js.UndefOr[Callback] = js.native
  
  def rpc(args: DataArgs): RPCResult | Unit = js.native
  @JSName("rpc")
  var rpc_Original: RPCCallback = js.native
}

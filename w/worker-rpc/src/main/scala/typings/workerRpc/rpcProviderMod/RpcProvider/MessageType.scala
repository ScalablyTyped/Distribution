package typings.workerRpc.rpcProviderMod.RpcProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MessageType extends js.Object
@JSImport("worker-rpc/lib/RpcProvider", "RpcProvider.MessageType")
@js.native
object MessageType extends js.Object {
  
  @js.native
  sealed trait internal extends MessageType
  
  @js.native
  sealed trait rpc extends MessageType
  
  @js.native
  sealed trait signal extends MessageType
}

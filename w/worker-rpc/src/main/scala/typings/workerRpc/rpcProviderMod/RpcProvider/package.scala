package typings.workerRpc.rpcProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object RpcProvider {
  
  type Dispatcher = js.Function2[
    /* message */ typings.workerRpc.rpcProviderMod.RpcProvider.Message, 
    /* transfer */ js.UndefOr[js.Array[js.Any]], 
    scala.Unit
  ]
}

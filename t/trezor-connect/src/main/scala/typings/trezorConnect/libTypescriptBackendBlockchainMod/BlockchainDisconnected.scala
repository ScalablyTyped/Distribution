package typings.trezorConnect.libTypescriptBackendBlockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockchainDisconnected extends StObject {
  
  var disconnected: Boolean
}
object BlockchainDisconnected {
  
  inline def apply(disconnected: Boolean): BlockchainDisconnected = {
    val __obj = js.Dynamic.literal(disconnected = disconnected.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockchainDisconnected]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockchainDisconnected] (val x: Self) extends AnyVal {
    
    inline def setDisconnected(value: Boolean): Self = StObject.set(x, "disconnected", value.asInstanceOf[js.Any])
  }
}

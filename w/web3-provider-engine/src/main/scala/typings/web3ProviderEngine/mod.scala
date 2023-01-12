package typings.web3ProviderEngine

import typings.ethereumProtocol.mod.JSONRPCErrorCallback
import typings.ethereumProtocol.mod.JSONRPCRequestPayload
import typings.ethereumProtocol.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-provider-engine", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Web3ProviderEngine {
    def this(options: Web3ProviderEngineOptions) = this()
    
    /* CompleteClass */
    override def sendAsync(payload: JSONRPCRequestPayload, callback: JSONRPCErrorCallback): Unit = js.native
  }
  
  @js.native
  trait Web3ProviderEngine
    extends StObject
       with Provider {
    
    def addProvider(provider: Any): Unit = js.native
    
    def on(event: String, handler: js.Function0[Unit]): Unit = js.native
    
    def send(payload: JSONRPCRequestPayload): Unit = js.native
    
    // start block polling
    def start(): Unit = js.native
    def start(callback: js.Function0[Unit]): Unit = js.native
    
    // stop block polling
    def stop(): Unit = js.native
  }
  
  trait Web3ProviderEngineOptions extends StObject {
    
    var blockTracker: js.UndefOr[Any] = js.undefined
    
    var blockTrackerProvider: js.UndefOr[Any] = js.undefined
    
    var pollingInterval: js.UndefOr[Double] = js.undefined
  }
  object Web3ProviderEngineOptions {
    
    inline def apply(): Web3ProviderEngineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Web3ProviderEngineOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Web3ProviderEngineOptions] (val x: Self) extends AnyVal {
      
      inline def setBlockTracker(value: Any): Self = StObject.set(x, "blockTracker", value.asInstanceOf[js.Any])
      
      inline def setBlockTrackerProvider(value: Any): Self = StObject.set(x, "blockTrackerProvider", value.asInstanceOf[js.Any])
      
      inline def setBlockTrackerProviderUndefined: Self = StObject.set(x, "blockTrackerProvider", js.undefined)
      
      inline def setBlockTrackerUndefined: Self = StObject.set(x, "blockTracker", js.undefined)
      
      inline def setPollingInterval(value: Double): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
      
      inline def setPollingIntervalUndefined: Self = StObject.set(x, "pollingInterval", js.undefined)
    }
  }
}

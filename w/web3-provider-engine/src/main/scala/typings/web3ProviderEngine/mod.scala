package typings.web3ProviderEngine

import typings.ethereumProtocol.mod.JSONRPCRequestPayload
import typings.ethereumProtocol.mod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-provider-engine", JSImport.Namespace)
  @js.native
  class ^ () extends Web3ProviderEngine {
    def this(options: Web3ProviderEngineOptions) = this()
  }
  
  @js.native
  trait Web3ProviderEngine extends Provider {
    
    def addProvider(provider: js.Any): Unit = js.native
    
    def on(event: String, handler: js.Function0[Unit]): Unit = js.native
    
    def send(payload: JSONRPCRequestPayload): Unit = js.native
    
    // start block polling
    def start(): Unit = js.native
    def start(callback: js.Function0[Unit]): Unit = js.native
    
    // stop block polling
    def stop(): Unit = js.native
  }
  
  @js.native
  trait Web3ProviderEngineOptions extends StObject {
    
    var blockTracker: js.UndefOr[js.Any] = js.native
    
    var blockTrackerProvider: js.UndefOr[js.Any] = js.native
    
    var pollingInterval: js.UndefOr[Double] = js.native
  }
  object Web3ProviderEngineOptions {
    
    @scala.inline
    def apply(): Web3ProviderEngineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Web3ProviderEngineOptions]
    }
    
    @scala.inline
    implicit class Web3ProviderEngineOptionsMutableBuilder[Self <: Web3ProviderEngineOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlockTracker(value: js.Any): Self = StObject.set(x, "blockTracker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockTrackerProvider(value: js.Any): Self = StObject.set(x, "blockTrackerProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockTrackerProviderUndefined: Self = StObject.set(x, "blockTrackerProvider", js.undefined)
      
      @scala.inline
      def setBlockTrackerUndefined: Self = StObject.set(x, "blockTracker", js.undefined)
      
      @scala.inline
      def setPollingInterval(value: Double): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPollingIntervalUndefined: Self = StObject.set(x, "pollingInterval", js.undefined)
    }
  }
}

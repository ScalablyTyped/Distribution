package typings.webpackPluginServe

import typings.webpackPluginServe.webpackPluginServeStrings.debug
import typings.webpackPluginServe.webpackPluginServeStrings.error
import typings.webpackPluginServe.webpackPluginServeStrings.info
import typings.webpackPluginServe.webpackPluginServeStrings.trace
import typings.webpackPluginServe.webpackPluginServeStrings.warn
import typings.webpackPluginServe.webpackPluginServeStrings.ws
import typings.webpackPluginServe.webpackPluginServeStrings.wss
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var protocol: js.UndefOr[ws | wss] = js.undefined
    
    var retry: js.UndefOr[Boolean] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object Address {
    
    inline def apply(): Address = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setProtocol(value: ws | wss): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      inline def setRetry(value: Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  trait App extends StObject {
    
    var app: js.UndefOr[String | js.Array[String]] = js.undefined
    
    @JSName("wait")
    var wait_FApp: js.UndefOr[Boolean] = js.undefined
  }
  object App {
    
    inline def apply(): App = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[App]
    }
    
    extension [Self <: App](x: Self) {
      
      inline def setApp(value: String | js.Array[String]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      inline def setAppVarargs(value: String*): Self = StObject.set(x, "app", js.Array(value*))
      
      inline def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  trait Apply[Compiler] extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit
  }
  object Apply {
    
    inline def apply[Compiler](apply: Compiler => Unit): Apply[Compiler] = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[Apply[Compiler]]
    }
    
    extension [Self <: Apply[?], Compiler](x: Self & Apply[Compiler]) {
      
      inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  trait Level extends StObject {
    
    var level: trace | debug | info | warn | error
    
    var timestamp: js.UndefOr[Boolean] = js.undefined
  }
  object Level {
    
    inline def apply(level: trace | debug | info | warn | error): Level = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    extension [Self <: Level](x: Self) {
      
      inline def setLevel(value: trace | debug | info | warn | error): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Boolean): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
}

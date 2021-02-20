package typings.webpackPluginServe

import typings.webpackPluginServe.webpackPluginServeStrings.debug
import typings.webpackPluginServe.webpackPluginServeStrings.error
import typings.webpackPluginServe.webpackPluginServeStrings.info
import typings.webpackPluginServe.webpackPluginServeStrings.trace
import typings.webpackPluginServe.webpackPluginServeStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Address extends StObject {
    
    var address: js.UndefOr[String] = js.native
    
    var retry: js.UndefOr[Boolean] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
  }
  object Address {
    
    @scala.inline
    def apply(): Address = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      @scala.inline
      def setRetry(value: Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  @js.native
  trait App extends StObject {
    
    var app: js.UndefOr[String | js.Array[String]] = js.native
    
    @JSName("wait")
    var wait_FApp: js.UndefOr[Boolean] = js.native
  }
  object App {
    
    @scala.inline
    def apply(): App = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[App]
    }
    
    @scala.inline
    implicit class AppMutableBuilder[Self <: App] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApp(value: String | js.Array[String]): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
      
      @scala.inline
      def setAppVarargs(value: String*): Self = StObject.set(x, "app", js.Array(value :_*))
      
      @scala.inline
      def setWait_(value: Boolean): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  @js.native
  trait Apply[Compiler] extends StObject {
    
    @JSName("apply")
    def apply(compiler: Compiler): Unit = js.native
  }
  object Apply {
    
    @scala.inline
    def apply[Compiler](apply: Compiler => Unit): Apply[Compiler] = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
      __obj.asInstanceOf[Apply[Compiler]]
    }
    
    @scala.inline
    implicit class ApplyMutableBuilder[Self <: Apply[_], Compiler] (val x: Self with Apply[Compiler]) extends AnyVal {
      
      @scala.inline
      def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Level extends StObject {
    
    var level: trace | debug | info | warn | error = js.native
    
    var timestamp: js.UndefOr[Boolean] = js.native
  }
  object Level {
    
    @scala.inline
    def apply(level: trace | debug | info | warn | error): Level = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: trace | debug | info | warn | error): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Boolean): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
}

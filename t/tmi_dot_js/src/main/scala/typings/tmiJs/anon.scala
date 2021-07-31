package typings.tmiJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClientId extends StObject {
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
  }
  object ClientId {
    
    @scala.inline
    def apply(): ClientId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientId]
    }
    
    @scala.inline
    implicit class ClientIdMutableBuilder[Self <: ClientId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    }
  }
  
  trait Code extends StObject {
    
    var code: String
    
    var id: Double
  }
  object Code {
    
    @scala.inline
    def apply(code: String, id: Double): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: js.UndefOr[js.Function1[/* message */ String, js.Any]] = js.undefined
    
    var info: js.UndefOr[js.Function1[/* message */ String, js.Any]] = js.undefined
    
    var warn: js.UndefOr[js.Function1[/* message */ String, js.Any]] = js.undefined
  }
  object Error {
    
    @scala.inline
    def apply(): Error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: /* message */ String => js.Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInfo(value: /* message */ String => js.Any): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setWarn(value: /* message */ String => js.Any): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  trait MaxReconnectAttempts extends StObject {
    
    var maxReconnectAttempts: js.UndefOr[Double] = js.undefined
    
    var maxReconnectInverval: js.UndefOr[Double] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var reconnect: js.UndefOr[Boolean] = js.undefined
    
    var reconnectDecay: js.UndefOr[Double] = js.undefined
    
    var reconnectInterval: js.UndefOr[Double] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var server: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object MaxReconnectAttempts {
    
    @scala.inline
    def apply(): MaxReconnectAttempts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxReconnectAttempts]
    }
    
    @scala.inline
    implicit class MaxReconnectAttemptsMutableBuilder[Self <: MaxReconnectAttempts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxReconnectAttempts(value: Double): Self = StObject.set(x, "maxReconnectAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxReconnectAttemptsUndefined: Self = StObject.set(x, "maxReconnectAttempts", js.undefined)
      
      @scala.inline
      def setMaxReconnectInverval(value: Double): Self = StObject.set(x, "maxReconnectInverval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxReconnectInvervalUndefined: Self = StObject.set(x, "maxReconnectInverval", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setReconnect(value: Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectDecay(value: Double): Self = StObject.set(x, "reconnectDecay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectDecayUndefined: Self = StObject.set(x, "reconnectDecay", js.undefined)
      
      @scala.inline
      def setReconnectInterval(value: Double): Self = StObject.set(x, "reconnectInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnectIntervalUndefined: Self = StObject.set(x, "reconnectInterval", js.undefined)
      
      @scala.inline
      def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Password extends StObject {
    
    var password: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object Password {
    
    @scala.inline
    def apply(): Password = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Password]
    }
    
    @scala.inline
    implicit class PasswordMutableBuilder[Self <: Password] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}

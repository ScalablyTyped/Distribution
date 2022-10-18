package typings.tmiJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClientId extends StObject {
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var globalDefaultChannel: js.UndefOr[String] = js.undefined
    
    var joinInterval: js.UndefOr[Double] = js.undefined
    
    var messagesLogLevel: js.UndefOr[String] = js.undefined
    
    var skipMembership: js.UndefOr[Boolean] = js.undefined
    
    var skipUpdatingEmotesets: js.UndefOr[Boolean] = js.undefined
    
    var updateEmotesetsTimer: js.UndefOr[Double] = js.undefined
  }
  object ClientId {
    
    inline def apply(): ClientId = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientId]
    }
    
    extension [Self <: ClientId](x: Self) {
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setGlobalDefaultChannel(value: String): Self = StObject.set(x, "globalDefaultChannel", value.asInstanceOf[js.Any])
      
      inline def setGlobalDefaultChannelUndefined: Self = StObject.set(x, "globalDefaultChannel", js.undefined)
      
      inline def setJoinInterval(value: Double): Self = StObject.set(x, "joinInterval", value.asInstanceOf[js.Any])
      
      inline def setJoinIntervalUndefined: Self = StObject.set(x, "joinInterval", js.undefined)
      
      inline def setMessagesLogLevel(value: String): Self = StObject.set(x, "messagesLogLevel", value.asInstanceOf[js.Any])
      
      inline def setMessagesLogLevelUndefined: Self = StObject.set(x, "messagesLogLevel", js.undefined)
      
      inline def setSkipMembership(value: Boolean): Self = StObject.set(x, "skipMembership", value.asInstanceOf[js.Any])
      
      inline def setSkipMembershipUndefined: Self = StObject.set(x, "skipMembership", js.undefined)
      
      inline def setSkipUpdatingEmotesets(value: Boolean): Self = StObject.set(x, "skipUpdatingEmotesets", value.asInstanceOf[js.Any])
      
      inline def setSkipUpdatingEmotesetsUndefined: Self = StObject.set(x, "skipUpdatingEmotesets", js.undefined)
      
      inline def setUpdateEmotesetsTimer(value: Double): Self = StObject.set(x, "updateEmotesetsTimer", value.asInstanceOf[js.Any])
      
      inline def setUpdateEmotesetsTimerUndefined: Self = StObject.set(x, "updateEmotesetsTimer", js.undefined)
    }
  }
  
  trait Code extends StObject {
    
    var code: String
    
    var id: Double
  }
  object Code {
    
    inline def apply(code: String, id: Double): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    def error(message: String): Any
    
    def info(message: String): Any
    
    def warn(message: String): Any
  }
  object Error {
    
    inline def apply(error: String => Any, info: String => Any, warn: String => Any): Error = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: String => Any): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setInfo(value: String => Any): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setWarn(value: String => Any): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
  
  trait MaxReconnectAttempts extends StObject {
    
    var maxReconnectAttempts: js.UndefOr[Double] = js.undefined
    
    var maxReconnectInterval: js.UndefOr[Double] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var reconnect: js.UndefOr[Boolean] = js.undefined
    
    var reconnectDecay: js.UndefOr[Double] = js.undefined
    
    var reconnectInterval: js.UndefOr[Double] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var server: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object MaxReconnectAttempts {
    
    inline def apply(): MaxReconnectAttempts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxReconnectAttempts]
    }
    
    extension [Self <: MaxReconnectAttempts](x: Self) {
      
      inline def setMaxReconnectAttempts(value: Double): Self = StObject.set(x, "maxReconnectAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxReconnectAttemptsUndefined: Self = StObject.set(x, "maxReconnectAttempts", js.undefined)
      
      inline def setMaxReconnectInterval(value: Double): Self = StObject.set(x, "maxReconnectInterval", value.asInstanceOf[js.Any])
      
      inline def setMaxReconnectIntervalUndefined: Self = StObject.set(x, "maxReconnectInterval", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setReconnect(value: Boolean): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
      
      inline def setReconnectDecay(value: Double): Self = StObject.set(x, "reconnectDecay", value.asInstanceOf[js.Any])
      
      inline def setReconnectDecayUndefined: Self = StObject.set(x, "reconnectDecay", js.undefined)
      
      inline def setReconnectInterval(value: Double): Self = StObject.set(x, "reconnectInterval", value.asInstanceOf[js.Any])
      
      inline def setReconnectIntervalUndefined: Self = StObject.set(x, "reconnectInterval", js.undefined)
      
      inline def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Password extends StObject {
    
    var password: js.UndefOr[String | (js.Function0[String | js.Promise[String]])] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object Password {
    
    inline def apply(): Password = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Password]
    }
    
    extension [Self <: Password](x: Self) {
      
      inline def setPassword(value: String | (js.Function0[String | js.Promise[String]])): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordFunction0(value: () => String | js.Promise[String]): Self = StObject.set(x, "password", js.Any.fromFunction0(value))
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
}

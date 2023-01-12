package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventTypes {
  
  /**
    *    Event dispatched after login , loginWithOneTimeKey, requestOneTimeLoginKey or loginWithCode function call
    */
  trait AuthResult
    extends StObject
       with VoxImplantEvent {
    
    /**
      *    Auth error code, possible values are: 301 - code for 'code' auth type was sent, 302 - key for 'onetimekey' auth type received, 401 - invalid password, 404 - invalid username, 403 - user account is frozen, 500 - internal error
      */
    var code: js.UndefOr[Double] = js.undefined
    
    /**
      *    Authorized user's display name
      */
    var displayName: js.UndefOr[String] = js.undefined
    
    /**
      *    This parameter is used to calculate hash parameter for loginWithOneTimeKey method. AuthResult with the key dispatched after requestOneTimeLoginKey method was called
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      *    Application options
      */
    var options: js.UndefOr[js.Object] = js.undefined
    
    /**
      *    True in case of successful authorization, false - otherwise
      */
    var result: Boolean
  }
  object AuthResult {
    
    inline def apply(result: Boolean): AuthResult = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AuthResult] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *    Event dispatched if connection to VoxImplant Cloud was closed because of network problems. See connect function
    */
  trait ConnectionClosed
    extends StObject
       with VoxImplantEvent
  
  /**
    *    Event dispatched after connection to VoxImplant Cloud was established successfully. See connect function
    */
  trait ConnectionEstablished
    extends StObject
       with VoxImplantEvent
  
  /**
    *    Event dispatched if connection to VoxImplant Cloud couldn't be established. See connect function
    */
  trait ConnectionFailed
    extends StObject
       with VoxImplantEvent {
    
    /**
      *    Failure reason description
      */
    var message: String
  }
  object ConnectionFailed {
    
    inline def apply(message: String): ConnectionFailed = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionFailed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionFailed] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *    Event dispatched when there is a new incoming call to current user
    */
  trait IncomingCall
    extends StObject
       with VoxImplantEvent {
    
    /**
      *    Incoming call instance. See VoxImplant.Call for details
      */
    var call: Call
    
    /**
      *    Optional SIP headers received with the message
      */
    var headers: js.UndefOr[js.Object] = js.undefined
  }
  object IncomingCall {
    
    inline def apply(call: Call): IncomingCall = {
      val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncomingCall]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IncomingCall] (val x: Self) extends AnyVal {
      
      inline def setCall(value: Call): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    }
  }
  
  /**
    *    Event dispatched after user interaction with the mic access dialog.
    */
  trait MicAccessResult
    extends StObject
       with VoxImplantEvent {
    
    /**
      *    True is access was allowed, false - otherwise
      */
    var result: Boolean
  }
  object MicAccessResult {
    
    inline def apply(result: Boolean): MicAccessResult = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[MicAccessResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MicAccessResult] (val x: Self) extends AnyVal {
      
      inline def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *    Event dispatched when packet loss data received from VoxImplant servers
    */
  trait NetStatsReceived
    extends StObject
       with VoxImplantEvent {
    
    /**
      *    Network info object
      */
    var stats: NetworkInfo
  }
  object NetStatsReceived {
    
    inline def apply(stats: NetworkInfo): NetStatsReceived = {
      val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetStatsReceived]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NetStatsReceived] (val x: Self) extends AnyVal {
      
      inline def setStats(value: NetworkInfo): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *    Event dispatched after sound playback was stopped. See playToneScript and stopPlayback functions
    */
  trait PlaybackFinished
    extends StObject
       with VoxImplantEvent
  
  /**
    *    Event dispatched after SDK was successfully initialized after init function call
    */
  trait SDKReady
    extends StObject
       with VoxImplantEvent {
    
    /**
      *    SDK version
      */
    var version: String
  }
  object SDKReady {
    
    inline def apply(version: String): SDKReady = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SDKReady]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SDKReady] (val x: Self) extends AnyVal {
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *    Event dispatched when audio and video sources information was updated. See audioSources and videoSources for details
    */
  trait SourcesInfoUpdated
    extends StObject
       with VoxImplantEvent
}

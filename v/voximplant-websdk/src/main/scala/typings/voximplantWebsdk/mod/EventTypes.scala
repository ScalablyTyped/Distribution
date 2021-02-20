package typings.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EventTypes {
  
  /**
    *    Event dispatched after login , loginWithOneTimeKey, requestOneTimeLoginKey or loginWithCode function call
    */
  @js.native
  trait AuthResult extends VoxImplantEvent {
    
    /**
      *    Auth error code, possible values are: 301 - code for 'code' auth type was sent, 302 - key for 'onetimekey' auth type received, 401 - invalid password, 404 - invalid username, 403 - user account is frozen, 500 - internal error
      */
    var code: js.UndefOr[Double] = js.native
    
    /**
      *    Authorized user's display name
      */
    var displayName: js.UndefOr[String] = js.native
    
    /**
      *    This parameter is used to calculate hash parameter for loginWithOneTimeKey method. AuthResult with the key dispatched after requestOneTimeLoginKey method was called
      */
    var key: js.UndefOr[String] = js.native
    
    /**
      *    Application options
      */
    var options: js.UndefOr[js.Object] = js.native
    
    /**
      *    True in case of successful authorization, false - otherwise
      */
    var result: Boolean = js.native
  }
  object AuthResult {
    
    @scala.inline
    def apply(result: Boolean): AuthResult = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthResult]
    }
    
    @scala.inline
    implicit class AuthResultMutableBuilder[Self <: AuthResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *    Event dispatched if connection to VoxImplant Cloud was closed because of network problems. See connect function
    */
  @js.native
  trait ConnectionClosed extends VoxImplantEvent
  
  /**
    *    Event dispatched after connection to VoxImplant Cloud was established successfully. See connect function
    */
  @js.native
  trait ConnectionEstablished extends VoxImplantEvent
  
  /**
    *    Event dispatched if connection to VoxImplant Cloud couldn't be established. See connect function
    */
  @js.native
  trait ConnectionFailed extends VoxImplantEvent {
    
    /**
      *    Failure reason description
      */
    var message: String = js.native
  }
  object ConnectionFailed {
    
    @scala.inline
    def apply(message: String): ConnectionFailed = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionFailed]
    }
    
    @scala.inline
    implicit class ConnectionFailedMutableBuilder[Self <: ConnectionFailed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *    Event dispatched when there is a new incoming call to current user
    */
  @js.native
  trait IncomingCall extends VoxImplantEvent {
    
    /**
      *    Incoming call instance. See VoxImplant.Call for details
      */
    var call: Call = js.native
    
    /**
      *    Optional SIP headers received with the message
      */
    var headers: js.UndefOr[js.Object] = js.native
  }
  object IncomingCall {
    
    @scala.inline
    def apply(call: Call): IncomingCall = {
      val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncomingCall]
    }
    
    @scala.inline
    implicit class IncomingCallMutableBuilder[Self <: IncomingCall] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCall(value: Call): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    }
  }
  
  /**
    *    Event dispatched after user interaction with the mic access dialog.
    */
  @js.native
  trait MicAccessResult extends VoxImplantEvent {
    
    /**
      *    True is access was allowed, false - otherwise
      */
    var result: Boolean = js.native
  }
  object MicAccessResult {
    
    @scala.inline
    def apply(result: Boolean): MicAccessResult = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[MicAccessResult]
    }
    
    @scala.inline
    implicit class MicAccessResultMutableBuilder[Self <: MicAccessResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *    Event dispatched when packet loss data received from VoxImplant servers
    */
  @js.native
  trait NetStatsReceived extends VoxImplantEvent {
    
    /**
      *    Network info object
      */
    var stats: NetworkInfo = js.native
  }
  object NetStatsReceived {
    
    @scala.inline
    def apply(stats: NetworkInfo): NetStatsReceived = {
      val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetStatsReceived]
    }
    
    @scala.inline
    implicit class NetStatsReceivedMutableBuilder[Self <: NetStatsReceived] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStats(value: NetworkInfo): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *    Event dispatched after sound playback was stopped. See playToneScript and stopPlayback functions
    */
  @js.native
  trait PlaybackFinished extends VoxImplantEvent
  
  /**
    *    Event dispatched after SDK was successfully initialized after init function call
    */
  @js.native
  trait SDKReady extends VoxImplantEvent {
    
    /**
      *    SDK version
      */
    var version: String = js.native
  }
  object SDKReady {
    
    @scala.inline
    def apply(version: String): SDKReady = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SDKReady]
    }
    
    @scala.inline
    implicit class SDKReadyMutableBuilder[Self <: SDKReady] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    *    Event dispatched when audio and video sources information was updated. See audioSources and videoSources for details
    */
  @js.native
  trait SourcesInfoUpdated extends VoxImplantEvent
}

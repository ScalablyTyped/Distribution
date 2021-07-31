package typings.twilioChat

import typings.twilioChat.anon.Identity
import typings.twilioChat.configurationMod.Configuration
import typings.twilioSync.mod.SyncClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionMod {
  
  /**
    *  Constructs the instance of Session
    *
    *  @classdesc Provides the interface to send the command to the server
    *  It is reliable, which means that it tracks the command object state
    *  and waits the answer from the server.
    */
  @JSImport("twilio-chat/lib/session", "Session")
  @js.native
  class Session protected () extends StObject {
    def this(services: SessionServices, config: Configuration) = this()
    
    /**
      * Sends the command to the server
      * @returns Promise the promise, which is being fulfilled only when service will reply
      */
    def addCommand(action: String, params: js.Object): js.Promise[js.Any] = js.native
    
    var config: js.Any = js.native
    
    var currentContext: js.Any = js.native
    
    var endpointPlatform: js.Any = js.native
    
    def getChannelsId(): js.Promise[String] = js.native
    
    def getConsumptionReportInterval(): js.Promise[Double] = js.native
    
    def getHttpCacheInterval(): js.Promise[Double] = js.native
    
    def getMaxUserInfosToSubscribe(): js.Promise[Double] = js.native
    
    def getMyChannelsId(): js.Promise[String] = js.native
    
    var getSessionContext: js.Any = js.native
    
    def getSessionLinks(): js.Promise[SessionLinks] = js.native
    
    def getUsersData(): js.Promise[Identity] = js.native
    
    var handleContextUpdate: js.Any = js.native
    
    def identity: String = js.native
    
    def initialize(): js.Promise[Session] = js.native
    
    var pendingCommands: js.Any = js.native
    
    /**
      * @private
      */
    var processCommand: js.Any = js.native
    
    /**
      * @private
      */
    var processCommandResponse: js.Any = js.native
    
    def reachabilityEnabled: Boolean = js.native
    
    val services: SessionServices = js.native
    
    val sessionInfo: js.Any = js.native
    
    var sessionStreamPromise: js.Any = js.native
  }
  
  trait SessionLinks extends StObject {
    
    var mediaServiceUrl: String
    
    var myChannelsUrl: String
    
    var publicChannelsUrl: String
    
    var syncListUrl: String
    
    var typingUrl: String
    
    var usersUrl: String
  }
  object SessionLinks {
    
    @scala.inline
    def apply(
      mediaServiceUrl: String,
      myChannelsUrl: String,
      publicChannelsUrl: String,
      syncListUrl: String,
      typingUrl: String,
      usersUrl: String
    ): SessionLinks = {
      val __obj = js.Dynamic.literal(mediaServiceUrl = mediaServiceUrl.asInstanceOf[js.Any], myChannelsUrl = myChannelsUrl.asInstanceOf[js.Any], publicChannelsUrl = publicChannelsUrl.asInstanceOf[js.Any], syncListUrl = syncListUrl.asInstanceOf[js.Any], typingUrl = typingUrl.asInstanceOf[js.Any], usersUrl = usersUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionLinks]
    }
    
    @scala.inline
    implicit class SessionLinksMutableBuilder[Self <: SessionLinks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMediaServiceUrl(value: String): Self = StObject.set(x, "mediaServiceUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMyChannelsUrl(value: String): Self = StObject.set(x, "myChannelsUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicChannelsUrl(value: String): Self = StObject.set(x, "publicChannelsUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncListUrl(value: String): Self = StObject.set(x, "syncListUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypingUrl(value: String): Self = StObject.set(x, "typingUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsersUrl(value: String): Self = StObject.set(x, "usersUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait SessionServices extends StObject {
    
    var syncClient: SyncClient
  }
  object SessionServices {
    
    @scala.inline
    def apply(syncClient: SyncClient): SessionServices = {
      val __obj = js.Dynamic.literal(syncClient = syncClient.asInstanceOf[js.Any])
      __obj.asInstanceOf[SessionServices]
    }
    
    @scala.inline
    implicit class SessionServicesMutableBuilder[Self <: SessionServices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSyncClient(value: SyncClient): Self = StObject.set(x, "syncClient", value.asInstanceOf[js.Any])
    }
  }
}

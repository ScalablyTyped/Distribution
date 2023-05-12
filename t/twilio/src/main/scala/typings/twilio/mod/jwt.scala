package typings.twilio.mod

import typings.twilio.libJwtAccessTokenMod.AccessTokenOptions
import typings.twilio.libJwtAccessTokenMod.ChatGrantOptions
import typings.twilio.libJwtAccessTokenMod.PlaybackGrantOptions
import typings.twilio.libJwtAccessTokenMod.SyncGrantOptions
import typings.twilio.libJwtAccessTokenMod.TaskRouterGrantOptions
import typings.twilio.libJwtAccessTokenMod.VideoGrantOptions
import typings.twilio.libJwtAccessTokenMod.VoiceGrantOptions
import typings.twilio.libJwtClientCapabilityMod.ClientCapabilityOptions
import typings.twilio.libJwtTaskrouterTaskRouterCapabilityMod.Policy
import typings.twilio.libJwtTaskrouterTaskRouterCapabilityMod.TaskRouterCapabilityOptions
import typings.twilio.twilioStrings.HS256
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jwt {
  
  /* was `typeof IAccessToken` */
  @JSImport("twilio", "jwt.AccessToken")
  @js.native
  open class AccessToken protected ()
    extends typings.twilio.libMod.jwt.AccessToken {
    /**
      * @param accountSid - The account's unique ID to which access is scoped
      * @param keySid - The signing key's unique ID
      * @param secret - The secret to sign the token with
      * @param options - ...
      * @param options.ttl - Time to live in seconds (default 3600)
      * @param options.identity - The identity of the first person. Required.
      * @param options.nbf - Time from epoch in seconds for not before value
      * @param options.region - The region value associated with this account
      */
    def this(accountSid: String, keySid: String, secret: String, options: AccessTokenOptions) = this()
  }
  /* was `typeof IAccessToken` */
  object AccessToken {
    
    @JSImport("twilio", "jwt.AccessToken")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("twilio", "jwt.AccessToken.ALGORITHMS")
    @js.native
    def ALGORITHMS: js.Array[String] = js.native
    inline def ALGORITHMS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALGORITHMS")(x.asInstanceOf[js.Any])
    
    @JSImport("twilio", "jwt.AccessToken.ChatGrant")
    @js.native
    /**
      * @param options - ...
      * @param options.serviceSid - The service unique ID
      * @param options.endpointId - The endpoint ID
      * @param options.deploymentRoleSid - SID of the deployment role to be
      *                 assigned to the user
      * @param options.pushCredentialSid - The Push Credentials SID
      */
    open class ChatGrant ()
      extends typings.twilio.libMod.jwt.AccessToken.ChatGrant {
      def this(options: ChatGrantOptions) = this()
    }
    
    /* static member */
    @JSImport("twilio", "jwt.AccessToken.DEFAULT_ALGORITHM")
    @js.native
    def DEFAULT_ALGORITHM: HS256 = js.native
    inline def DEFAULT_ALGORITHM_=(x: HS256): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_ALGORITHM")(x.asInstanceOf[js.Any])
    
    /* note: abstract class */ @JSImport("twilio", "jwt.AccessToken.Grant")
    @js.native
    open class Grant[TOptions, TPayload, TKey] protected ()
      extends typings.twilio.libMod.jwt.AccessToken.Grant[TOptions, TPayload, TKey] {
      /* protected */ def this(key: TKey) = this()
    }
    
    @JSImport("twilio", "jwt.AccessToken.PlaybackGrant")
    @js.native
    /**
      * @param options - ...
      * @param options.grant - The PlaybackGrant retrieved from Twilio's API
      */
    open class PlaybackGrant ()
      extends typings.twilio.libMod.jwt.AccessToken.PlaybackGrant {
      def this(options: PlaybackGrantOptions) = this()
    }
    
    @JSImport("twilio", "jwt.AccessToken.SyncGrant")
    @js.native
    /**
      * @param options.serviceSid - The service unique ID
      * @param options.endpointId - The endpoint ID
      */
    open class SyncGrant ()
      extends typings.twilio.libMod.jwt.AccessToken.SyncGrant {
      def this(options: SyncGrantOptions) = this()
    }
    
    @JSImport("twilio", "jwt.AccessToken.TaskRouterGrant")
    @js.native
    /**
      * @param options - ...
      * @param options.workspaceSid - The workspace unique ID
      * @param options.workerSid - The worker unique ID
      * @param options.role - The role of the grant
      */
    open class TaskRouterGrant ()
      extends typings.twilio.libMod.jwt.AccessToken.TaskRouterGrant {
      def this(options: TaskRouterGrantOptions) = this()
    }
    
    @JSImport("twilio", "jwt.AccessToken.VideoGrant")
    @js.native
    /**
      * @param options - ...
      * @param options.room - The Room name or Room sid.
      */
    open class VideoGrant ()
      extends typings.twilio.libMod.jwt.AccessToken.VideoGrant {
      def this(options: VideoGrantOptions) = this()
    }
    
    @JSImport("twilio", "jwt.AccessToken.VoiceGrant")
    @js.native
    /**
      * @param options - ...
      * @param options.incomingAllow - Whether or not this endpoint is allowed to receive incoming calls as grants.identity
      * @param options.outgoingApplicationSid - application sid to call when placing outgoing call
      * @param options.outgoingApplicationParams - request params to pass to the application
      * @param options.pushCredentialSid - Push Credential Sid to use when registering to receive incoming call notifications
      * @param options.endpointId - Specify an endpoint identifier for this device, which will allow the developer
      *                 to direct calls to a specific endpoint when multiple devices are associated with a single identity
      */
    open class VoiceGrant ()
      extends typings.twilio.libMod.jwt.AccessToken.VoiceGrant {
      def this(options: VoiceGrantOptions) = this()
    }
  }
  
  /* was `typeof IClientCapability` */
  @JSImport("twilio", "jwt.ClientCapability")
  @js.native
  open class ClientCapability protected ()
    extends typings.twilio.libMod.jwt.ClientCapability {
    def this(options: ClientCapabilityOptions) = this()
  }
  /* static members */
  object ClientCapability {
    
    @JSImport("twilio", "jwt.ClientCapability")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("twilio", "jwt.ClientCapability.EventStreamScope")
    @js.native
    def EventStreamScope: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventStreamScope */ Any = js.native
    inline def EventStreamScope_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventStreamScope */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EventStreamScope")(x.asInstanceOf[js.Any])
    
    @JSImport("twilio", "jwt.ClientCapability.IncomingClientScope")
    @js.native
    def IncomingClientScope: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IncomingClientScope */ Any = js.native
    inline def IncomingClientScope_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof IncomingClientScope */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IncomingClientScope")(x.asInstanceOf[js.Any])
    
    @JSImport("twilio", "jwt.ClientCapability.OutgoingClientScope")
    @js.native
    def OutgoingClientScope: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OutgoingClientScope */ Any = js.native
    inline def OutgoingClientScope_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OutgoingClientScope */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OutgoingClientScope")(x.asInstanceOf[js.Any])
  }
  
  object taskrouter {
    
    /* was `typeof ITaskRouterCapability` */
    @JSImport("twilio", "jwt.taskrouter.TaskRouterCapability")
    @js.native
    open class TaskRouterCapability protected ()
      extends typings.twilio.libMod.jwt.taskrouter.TaskRouterCapability {
      /**
        * @param options - ...
        * @param options.accountSid - account sid
        * @param options.authToken - auth token
        * @param options.workspaceSid - workspace sid
        * @param options.channelId - taskrouter channel id
        * @param options.friendlyName - friendly name for the jwt
        * @param options.ttl - time to live
        * @param options.version - taskrouter version
        */
      def this(options: TaskRouterCapabilityOptions) = this()
    }
    /* static members */
    object TaskRouterCapability {
      
      @JSImport("twilio", "jwt.taskrouter.TaskRouterCapability")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("twilio", "jwt.taskrouter.TaskRouterCapability.Policy")
      @js.native
      def Policy: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Policy */ Any = js.native
      inline def Policy_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Policy */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Policy")(x.asInstanceOf[js.Any])
    }
    
    /* was `typeof taskRouterUtil` */
    object util {
      
      @JSImport("twilio", "jwt.taskrouter.util")
      @js.native
      val ^ : js.Any = js.native
      
      inline def activitiesUrl(workspaceSid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("activitiesUrl")(workspaceSid.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def activitiesUrl(workspaceSid: String, activitySid: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("activitiesUrl")(workspaceSid.asInstanceOf[js.Any], activitySid.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def defaultEventBridgePolicies(accountSid: String, channelId: String): js.Array[Policy] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultEventBridgePolicies")(accountSid.asInstanceOf[js.Any], channelId.asInstanceOf[js.Any])).asInstanceOf[js.Array[Policy]]
      
      inline def defaultWorkerPolicies(version: String, workspaceSid: String, workerSid: String): js.Array[Policy] = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultWorkerPolicies")(version.asInstanceOf[js.Any], workspaceSid.asInstanceOf[js.Any], workerSid.asInstanceOf[js.Any])).asInstanceOf[js.Array[Policy]]
      
      inline def reservationsUrl(workspaceSid: String, workerSid: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reservationsUrl")(workspaceSid.asInstanceOf[js.Any], workerSid.asInstanceOf[js.Any])).asInstanceOf[String]
      inline def reservationsUrl(workspaceSid: String, workerSid: String, reservationSid: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reservationsUrl")(workspaceSid.asInstanceOf[js.Any], workerSid.asInstanceOf[js.Any], reservationSid.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def taskQueuesUrl(workspaceSid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("taskQueuesUrl")(workspaceSid.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def taskQueuesUrl(workspaceSid: String, taskQueueSid: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("taskQueuesUrl")(workspaceSid.asInstanceOf[js.Any], taskQueueSid.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def tasksUrl(workspaceSid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("tasksUrl")(workspaceSid.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def tasksUrl(workspaceSid: String, taskSid: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("tasksUrl")(workspaceSid.asInstanceOf[js.Any], taskSid.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def workersUrl(workspaceSid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("workersUrl")(workspaceSid.asInstanceOf[js.Any]).asInstanceOf[String]
      inline def workersUrl(workspaceSid: String, workerSid: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("workersUrl")(workspaceSid.asInstanceOf[js.Any], workerSid.asInstanceOf[js.Any])).asInstanceOf[String]
      
      inline def workspacesUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("workspacesUrl")().asInstanceOf[String]
      inline def workspacesUrl(workspaceSid: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("workspacesUrl")(workspaceSid.asInstanceOf[js.Any]).asInstanceOf[String]
    }
  }
}

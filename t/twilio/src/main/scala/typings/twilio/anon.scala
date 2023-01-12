package typings.twilio

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.twilio.libJwtAccessTokenMod.ChatGrant
import typings.twilio.libJwtAccessTokenMod.ConversationsGrant
import typings.twilio.libJwtAccessTokenMod.Grant
import typings.twilio.libJwtAccessTokenMod.IpMessagingGrant
import typings.twilio.libJwtAccessTokenMod.PlaybackGrant
import typings.twilio.libJwtAccessTokenMod.SyncGrant
import typings.twilio.libJwtAccessTokenMod.TaskRouterGrant
import typings.twilio.libJwtAccessTokenMod.VideoGrant
import typings.twilio.libJwtAccessTokenMod.VoiceGrant
import typings.twilio.libJwtClientCapabilityMod.EventStreamScope
import typings.twilio.libJwtClientCapabilityMod.IncomingClientScope
import typings.twilio.libJwtClientCapabilityMod.OutgoingClientScope
import typings.twilio.libJwtClientCapabilityMod.OutgoingClientScopeOptions
import typings.twilio.libJwtTaskrouterTaskRouterCapabilityMod.Policy
import typings.twilio.libJwtTaskrouterTaskRouterCapabilityMod.PolicyOptions
import typings.twilio.libJwtTaskrouterTaskRouterCapabilityMod.TaskRouterCapabilityOptions
import typings.twilio.libJwtTaskrouterTaskRouterCapabilityMod.^
import typings.twilio.twilioStrings.HS256
import typings.twilio.twilioStrings.HS384
import typings.twilio.twilioStrings.HS512
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Applicationsid extends StObject {
    
    var application_sid: String
    
    var params: js.UndefOr[js.Object] = js.undefined
  }
  object Applicationsid {
    
    inline def apply(application_sid: String): Applicationsid = {
      val __obj = js.Dynamic.literal(application_sid = application_sid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Applicationsid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Applicationsid] (val x: Self) extends AnyVal {
      
      inline def setApplication_sid(value: String): Self = StObject.set(x, "application_sid", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
  }
  object Key {
    
    inline def apply(): Key = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait TaskRouterCapability extends StObject {
    
    var TaskRouterCapability: TypeofTaskRouterCapabilit & (Instantiable1[/* options */ TaskRouterCapabilityOptions, ^])
    
    var util: Typeofutil
  }
  object TaskRouterCapability {
    
    inline def apply(
      TaskRouterCapability: TypeofTaskRouterCapabilit & (Instantiable1[/* options */ TaskRouterCapabilityOptions, ^]),
      util: Typeofutil
    ): TaskRouterCapability = {
      val __obj = js.Dynamic.literal(TaskRouterCapability = TaskRouterCapability.asInstanceOf[js.Any], util = util.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskRouterCapability]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskRouterCapability] (val x: Self) extends AnyVal {
      
      inline def setTaskRouterCapability(value: TypeofTaskRouterCapabilit & (Instantiable1[/* options */ TaskRouterCapabilityOptions, ^])): Self = StObject.set(x, "TaskRouterCapability", value.asInstanceOf[js.Any])
      
      inline def setUtil(value: Typeofutil): Self = StObject.set(x, "util", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofAccessToken extends StObject {
    
    /* static member */
    var ALGORITHMS: js.Tuple3[HS256, HS384, HS512]
    
    var ChatGrant: Instantiable0[typings.twilio.libJwtAccessTokenMod.ChatGrant]
    
    var ConversationsGrant: Instantiable0[typings.twilio.libJwtAccessTokenMod.ConversationsGrant]
    
    /* static member */
    var DEFAULT_ALGORITHM: HS256
    
    var Grant: Instantiable1[
        /* opts */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam TOptions */ Any], 
        typings.twilio.libJwtAccessTokenMod.Grant[js.Object, js.Object, js.Object]
      ]
    
    var IpMessagingGrant: Instantiable0[typings.twilio.libJwtAccessTokenMod.IpMessagingGrant]
    
    var PlaybackGrant: Instantiable0[typings.twilio.libJwtAccessTokenMod.PlaybackGrant]
    
    var SyncGrant: Instantiable0[typings.twilio.libJwtAccessTokenMod.SyncGrant]
    
    var TaskRouterGrant: Instantiable0[typings.twilio.libJwtAccessTokenMod.TaskRouterGrant]
    
    var VideoGrant: Instantiable0[typings.twilio.libJwtAccessTokenMod.VideoGrant]
    
    var VoiceGrant: Instantiable0[typings.twilio.libJwtAccessTokenMod.VoiceGrant]
  }
  object TypeofAccessToken {
    
    inline def apply(
      ALGORITHMS: js.Tuple3[HS256, HS384, HS512],
      ChatGrant: Instantiable0[ChatGrant],
      ConversationsGrant: Instantiable0[ConversationsGrant],
      Grant: Instantiable1[
          /* opts */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam TOptions */ Any], 
          Grant[js.Object, js.Object, js.Object]
        ],
      IpMessagingGrant: Instantiable0[IpMessagingGrant],
      PlaybackGrant: Instantiable0[PlaybackGrant],
      SyncGrant: Instantiable0[SyncGrant],
      TaskRouterGrant: Instantiable0[TaskRouterGrant],
      VideoGrant: Instantiable0[VideoGrant],
      VoiceGrant: Instantiable0[VoiceGrant]
    ): TypeofAccessToken = {
      val __obj = js.Dynamic.literal(ALGORITHMS = ALGORITHMS.asInstanceOf[js.Any], ChatGrant = ChatGrant.asInstanceOf[js.Any], ConversationsGrant = ConversationsGrant.asInstanceOf[js.Any], DEFAULT_ALGORITHM = "HS256", Grant = Grant.asInstanceOf[js.Any], IpMessagingGrant = IpMessagingGrant.asInstanceOf[js.Any], PlaybackGrant = PlaybackGrant.asInstanceOf[js.Any], SyncGrant = SyncGrant.asInstanceOf[js.Any], TaskRouterGrant = TaskRouterGrant.asInstanceOf[js.Any], VideoGrant = VideoGrant.asInstanceOf[js.Any], VoiceGrant = VoiceGrant.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofAccessToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofAccessToken] (val x: Self) extends AnyVal {
      
      inline def setALGORITHMS(value: js.Tuple3[HS256, HS384, HS512]): Self = StObject.set(x, "ALGORITHMS", value.asInstanceOf[js.Any])
      
      inline def setChatGrant(value: Instantiable0[ChatGrant]): Self = StObject.set(x, "ChatGrant", value.asInstanceOf[js.Any])
      
      inline def setConversationsGrant(value: Instantiable0[ConversationsGrant]): Self = StObject.set(x, "ConversationsGrant", value.asInstanceOf[js.Any])
      
      inline def setDEFAULT_ALGORITHM(value: HS256): Self = StObject.set(x, "DEFAULT_ALGORITHM", value.asInstanceOf[js.Any])
      
      inline def setGrant(
        value: Instantiable1[
              /* opts */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam TOptions */ Any], 
              Grant[js.Object, js.Object, js.Object]
            ]
      ): Self = StObject.set(x, "Grant", value.asInstanceOf[js.Any])
      
      inline def setIpMessagingGrant(value: Instantiable0[IpMessagingGrant]): Self = StObject.set(x, "IpMessagingGrant", value.asInstanceOf[js.Any])
      
      inline def setPlaybackGrant(value: Instantiable0[PlaybackGrant]): Self = StObject.set(x, "PlaybackGrant", value.asInstanceOf[js.Any])
      
      inline def setSyncGrant(value: Instantiable0[SyncGrant]): Self = StObject.set(x, "SyncGrant", value.asInstanceOf[js.Any])
      
      inline def setTaskRouterGrant(value: Instantiable0[TaskRouterGrant]): Self = StObject.set(x, "TaskRouterGrant", value.asInstanceOf[js.Any])
      
      inline def setVideoGrant(value: Instantiable0[VideoGrant]): Self = StObject.set(x, "VideoGrant", value.asInstanceOf[js.Any])
      
      inline def setVoiceGrant(value: Instantiable0[VoiceGrant]): Self = StObject.set(x, "VoiceGrant", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofClientCapability extends StObject {
    
    var EventStreamScope: Instantiable1[/* filters */ js.Object, typings.twilio.libJwtClientCapabilityMod.EventStreamScope]
    
    var IncomingClientScope: Instantiable1[
        /* clientName */ String, 
        typings.twilio.libJwtClientCapabilityMod.IncomingClientScope
      ]
    
    var OutgoingClientScope: Instantiable1[
        /* options */ OutgoingClientScopeOptions, 
        typings.twilio.libJwtClientCapabilityMod.OutgoingClientScope
      ]
  }
  object TypeofClientCapability {
    
    inline def apply(
      EventStreamScope: Instantiable1[/* filters */ js.Object, EventStreamScope],
      IncomingClientScope: Instantiable1[/* clientName */ String, IncomingClientScope],
      OutgoingClientScope: Instantiable1[/* options */ OutgoingClientScopeOptions, OutgoingClientScope]
    ): TypeofClientCapability = {
      val __obj = js.Dynamic.literal(EventStreamScope = EventStreamScope.asInstanceOf[js.Any], IncomingClientScope = IncomingClientScope.asInstanceOf[js.Any], OutgoingClientScope = OutgoingClientScope.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofClientCapability]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofClientCapability] (val x: Self) extends AnyVal {
      
      inline def setEventStreamScope(value: Instantiable1[/* filters */ js.Object, EventStreamScope]): Self = StObject.set(x, "EventStreamScope", value.asInstanceOf[js.Any])
      
      inline def setIncomingClientScope(value: Instantiable1[/* clientName */ String, IncomingClientScope]): Self = StObject.set(x, "IncomingClientScope", value.asInstanceOf[js.Any])
      
      inline def setOutgoingClientScope(value: Instantiable1[/* options */ OutgoingClientScopeOptions, OutgoingClientScope]): Self = StObject.set(x, "OutgoingClientScope", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofTaskRouterCapabilit extends StObject {
    
    var Policy: Instantiable1[
        /* options */ PolicyOptions, 
        typings.twilio.libJwtTaskrouterTaskRouterCapabilityMod.Policy
      ]
  }
  object TypeofTaskRouterCapabilit {
    
    inline def apply(Policy: Instantiable1[/* options */ PolicyOptions, Policy]): TypeofTaskRouterCapabilit = {
      val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofTaskRouterCapabilit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofTaskRouterCapabilit] (val x: Self) extends AnyVal {
      
      inline def setPolicy(value: Instantiable1[/* options */ PolicyOptions, Policy]): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeofutil extends StObject {
    
    def activitiesUrl(workspaceSid: String): String = js.native
    def activitiesUrl(workspaceSid: String, activitySid: String): String = js.native
    
    def defaultEventBridgePolicies(accountSid: String, channelId: String): js.Array[Policy] = js.native
    
    def defaultWorkerPolicies(version: String, workspaceSid: String, workerSid: String): js.Array[Policy] = js.native
    
    def reservationsUrl(workspaceSid: String, workerSid: String): String = js.native
    def reservationsUrl(workspaceSid: String, workerSid: String, reservationSid: String): String = js.native
    
    def taskQueuesUrl(workspaceSid: String): String = js.native
    def taskQueuesUrl(workspaceSid: String, taskQueueSid: String): String = js.native
    
    def tasksUrl(workspaceSid: String): String = js.native
    def tasksUrl(workspaceSid: String, taskSid: String): String = js.native
    
    def workersUrl(workspaceSid: String): String = js.native
    def workersUrl(workspaceSid: String, workerSid: String): String = js.native
    
    def workspacesUrl(): String = js.native
    def workspacesUrl(workspaceSid: String): String = js.native
  }
}

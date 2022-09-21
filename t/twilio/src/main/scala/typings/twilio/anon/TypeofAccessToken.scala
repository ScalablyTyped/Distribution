package typings.twilio.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.twilio.accessTokenMod.ChatGrant
import typings.twilio.accessTokenMod.ConversationsGrant
import typings.twilio.accessTokenMod.Grant
import typings.twilio.accessTokenMod.IpMessagingGrant
import typings.twilio.accessTokenMod.PlaybackGrant
import typings.twilio.accessTokenMod.SyncGrant
import typings.twilio.accessTokenMod.TaskRouterGrant
import typings.twilio.accessTokenMod.VideoGrant
import typings.twilio.accessTokenMod.VoiceGrant
import typings.twilio.twilioStrings.HS256
import typings.twilio.twilioStrings.HS384
import typings.twilio.twilioStrings.HS512
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAccessToken extends StObject {
  
  /* static member */
  var ALGORITHMS: js.Tuple3[HS256, HS384, HS512]
  
  var ChatGrant: Instantiable0[typings.twilio.accessTokenMod.ChatGrant]
  
  var ConversationsGrant: Instantiable0[typings.twilio.accessTokenMod.ConversationsGrant]
  
  /* static member */
  var DEFAULT_ALGORITHM: HS256
  
  var Grant: Instantiable1[
    /* opts */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam TOptions */ Any], 
    typings.twilio.accessTokenMod.Grant[js.Object, js.Object, js.Object]
  ]
  
  var IpMessagingGrant: Instantiable0[typings.twilio.accessTokenMod.IpMessagingGrant]
  
  var PlaybackGrant: Instantiable0[typings.twilio.accessTokenMod.PlaybackGrant]
  
  var SyncGrant: Instantiable0[typings.twilio.accessTokenMod.SyncGrant]
  
  var TaskRouterGrant: Instantiable0[typings.twilio.accessTokenMod.TaskRouterGrant]
  
  var VideoGrant: Instantiable0[typings.twilio.accessTokenMod.VideoGrant]
  
  var VoiceGrant: Instantiable0[typings.twilio.accessTokenMod.VoiceGrant]
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
  
  extension [Self <: TypeofAccessToken](x: Self) {
    
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

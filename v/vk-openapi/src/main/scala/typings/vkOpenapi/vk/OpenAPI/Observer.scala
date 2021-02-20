package typings.vkOpenapi.vk.OpenAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Observer {
  
  @js.native
  trait API extends StObject {
    
    def subscribe[E /* <: ObserverEvent */](event: E, handler: ObserverEventHandler[E]): Unit = js.native
    
    def unsubscribe[E /* <: ObserverEvent */](event: E): Unit = js.native
    def unsubscribe[E /* <: ObserverEvent */](event: E, handler: ObserverEventHandler[E]): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vkOpenapi.vkOpenapiStrings.authDotlogin
    - typings.vkOpenapi.vkOpenapiStrings.authDotlogout
    - typings.vkOpenapi.vkOpenapiStrings.authDotstatusChange
    - typings.vkOpenapi.vkOpenapiStrings.authDotsessionChange
    - typings.vkOpenapi.vkOpenapiStrings.widgetsDotcommentsDotnew_comment
    - typings.vkOpenapi.vkOpenapiStrings.widgetsDotcommentsDotdelete_comment
    - typings.vkOpenapi.vkOpenapiStrings.widgetsDotgroupsDotjoined
    - typings.vkOpenapi.vkOpenapiStrings.widgetsDotgroupsDotleaved
    - typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotliked
    - typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotunliked
    - typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotshared
    - typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotunshared
    - typings.vkOpenapi.vkOpenapiStrings.widgetsDotsubscribed
    - typings.vkOpenapi.vkOpenapiStrings.widgetsDotunsubscribed
    - typings.vkOpenapi.vkOpenapiStrings.widgetsDotallowMessagesFromCommunityDotallowed
    - typings.vkOpenapi.vkOpenapiStrings.widgetsDotallowMessagesFromCommunityDotdenied
  */
  trait ObserverEvent extends StObject
  object ObserverEvent {
    
    @scala.inline
    def authDotlogin: typings.vkOpenapi.vkOpenapiStrings.authDotlogin = "auth.login".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.authDotlogin]
    
    @scala.inline
    def authDotlogout: typings.vkOpenapi.vkOpenapiStrings.authDotlogout = "auth.logout".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.authDotlogout]
    
    @scala.inline
    def authDotsessionChange: typings.vkOpenapi.vkOpenapiStrings.authDotsessionChange = "auth.sessionChange".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.authDotsessionChange]
    
    @scala.inline
    def authDotstatusChange: typings.vkOpenapi.vkOpenapiStrings.authDotstatusChange = "auth.statusChange".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.authDotstatusChange]
    
    @scala.inline
    def widgetsDotallowMessagesFromCommunityDotallowed: typings.vkOpenapi.vkOpenapiStrings.widgetsDotallowMessagesFromCommunityDotallowed = "widgets.allowMessagesFromCommunity.allowed".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotallowMessagesFromCommunityDotallowed]
    
    @scala.inline
    def widgetsDotallowMessagesFromCommunityDotdenied: typings.vkOpenapi.vkOpenapiStrings.widgetsDotallowMessagesFromCommunityDotdenied = "widgets.allowMessagesFromCommunity.denied".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotallowMessagesFromCommunityDotdenied]
    
    @scala.inline
    def widgetsDotcommentsDotdelete_comment: typings.vkOpenapi.vkOpenapiStrings.widgetsDotcommentsDotdelete_comment = "widgets.comments.delete_comment".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotcommentsDotdelete_comment]
    
    @scala.inline
    def widgetsDotcommentsDotnew_comment: typings.vkOpenapi.vkOpenapiStrings.widgetsDotcommentsDotnew_comment = "widgets.comments.new_comment".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotcommentsDotnew_comment]
    
    @scala.inline
    def widgetsDotgroupsDotjoined: typings.vkOpenapi.vkOpenapiStrings.widgetsDotgroupsDotjoined = "widgets.groups.joined".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotgroupsDotjoined]
    
    @scala.inline
    def widgetsDotgroupsDotleaved: typings.vkOpenapi.vkOpenapiStrings.widgetsDotgroupsDotleaved = "widgets.groups.leaved".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotgroupsDotleaved]
    
    @scala.inline
    def widgetsDotlikeDotliked: typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotliked = "widgets.like.liked".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotliked]
    
    @scala.inline
    def widgetsDotlikeDotshared: typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotshared = "widgets.like.shared".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotshared]
    
    @scala.inline
    def widgetsDotlikeDotunliked: typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotunliked = "widgets.like.unliked".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotunliked]
    
    @scala.inline
    def widgetsDotlikeDotunshared: typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotunshared = "widgets.like.unshared".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotunshared]
    
    @scala.inline
    def widgetsDotsubscribed: typings.vkOpenapi.vkOpenapiStrings.widgetsDotsubscribed = "widgets.subscribed".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotsubscribed]
    
    @scala.inline
    def widgetsDotunsubscribed: typings.vkOpenapi.vkOpenapiStrings.widgetsDotunsubscribed = "widgets.unsubscribed".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotunsubscribed]
  }
  
  type ObserverEventHandler[E /* <: ObserverEvent */] = js.Function0[Unit] | (js.Function1[/* uid */ Double, Unit]) | (js.Function4[/* num */ Double, /* lastComment */ String, /* date */ String, /* sign */ String, Unit])
}

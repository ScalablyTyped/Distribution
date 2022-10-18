package typings.vkOpenapi.vk.OpenAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    inline def authDotlogin: typings.vkOpenapi.vkOpenapiStrings.authDotlogin = "auth.login".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.authDotlogin]
    
    inline def authDotlogout: typings.vkOpenapi.vkOpenapiStrings.authDotlogout = "auth.logout".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.authDotlogout]
    
    inline def authDotsessionChange: typings.vkOpenapi.vkOpenapiStrings.authDotsessionChange = "auth.sessionChange".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.authDotsessionChange]
    
    inline def authDotstatusChange: typings.vkOpenapi.vkOpenapiStrings.authDotstatusChange = "auth.statusChange".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.authDotstatusChange]
    
    inline def widgetsDotallowMessagesFromCommunityDotallowed: typings.vkOpenapi.vkOpenapiStrings.widgetsDotallowMessagesFromCommunityDotallowed = "widgets.allowMessagesFromCommunity.allowed".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotallowMessagesFromCommunityDotallowed]
    
    inline def widgetsDotallowMessagesFromCommunityDotdenied: typings.vkOpenapi.vkOpenapiStrings.widgetsDotallowMessagesFromCommunityDotdenied = "widgets.allowMessagesFromCommunity.denied".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotallowMessagesFromCommunityDotdenied]
    
    inline def widgetsDotcommentsDotdelete_comment: typings.vkOpenapi.vkOpenapiStrings.widgetsDotcommentsDotdelete_comment = "widgets.comments.delete_comment".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotcommentsDotdelete_comment]
    
    inline def widgetsDotcommentsDotnew_comment: typings.vkOpenapi.vkOpenapiStrings.widgetsDotcommentsDotnew_comment = "widgets.comments.new_comment".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotcommentsDotnew_comment]
    
    inline def widgetsDotgroupsDotjoined: typings.vkOpenapi.vkOpenapiStrings.widgetsDotgroupsDotjoined = "widgets.groups.joined".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotgroupsDotjoined]
    
    inline def widgetsDotgroupsDotleaved: typings.vkOpenapi.vkOpenapiStrings.widgetsDotgroupsDotleaved = "widgets.groups.leaved".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotgroupsDotleaved]
    
    inline def widgetsDotlikeDotliked: typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotliked = "widgets.like.liked".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotliked]
    
    inline def widgetsDotlikeDotshared: typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotshared = "widgets.like.shared".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotshared]
    
    inline def widgetsDotlikeDotunliked: typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotunliked = "widgets.like.unliked".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotunliked]
    
    inline def widgetsDotlikeDotunshared: typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotunshared = "widgets.like.unshared".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotlikeDotunshared]
    
    inline def widgetsDotsubscribed: typings.vkOpenapi.vkOpenapiStrings.widgetsDotsubscribed = "widgets.subscribed".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotsubscribed]
    
    inline def widgetsDotunsubscribed: typings.vkOpenapi.vkOpenapiStrings.widgetsDotunsubscribed = "widgets.unsubscribed".asInstanceOf[typings.vkOpenapi.vkOpenapiStrings.widgetsDotunsubscribed]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    E extends 'widgets.comments.new_comment' | 'widgets.comments.delete_comment' ? (num : number, lastComment : string, date : string, sign : string): void : E extends 'widgets.like.liked' | 'widgets.like.unliked' ? (likes : number): void : E extends 'widgets.like.shared' | 'widgets.like.unshared' ? (shares : number): void : E extends 'widgets.allowMessagesFromCommunity.allowed' | 'widgets.allowMessagesFromCommunity.denied' ? (uid : number): void : (): void
    }}}
    */
  @js.native
  trait ObserverEventHandler[E /* <: ObserverEvent */] extends StObject
}

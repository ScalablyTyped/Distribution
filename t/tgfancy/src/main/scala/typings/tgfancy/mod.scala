package typings.tgfancy

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tgfancy", JSImport.Namespace)
  @js.native
  class ^ protected () extends Tgfancy {
    def this(token: String) = this()
    def this(token: String, options: ConstructorOptions) = this()
  }
  
  @js.native
  trait ChatIdResolutionOptions extends StObject {
    
    def resolve(
      token: String,
      chatId: String,
      callback: js.Function2[/* error */ Error | Null, /* target */ js.Any, Unit]
    ): Unit = js.native
    def resolve(
      token: String,
      chatId: Double,
      callback: js.Function2[/* error */ Error | Null, /* target */ js.Any, Unit]
    ): Unit = js.native
  }
  
  @js.native
  trait ConstructorOptions
    extends typings.nodeTelegramBotApi.mod.ConstructorOptions {
    
    var tgfancy: js.UndefOr[TgfancyOptions] = js.native
  }
  object ConstructorOptions {
    
    @scala.inline
    def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit class ConstructorOptionsMutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTgfancy(value: TgfancyOptions): Self = StObject.set(x, "tgfancy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTgfancyUndefined: Self = StObject.set(x, "tgfancy", js.undefined)
    }
  }
  
  @js.native
  trait EmojificationOptions extends StObject {
    
    def emojify(text: String): String = js.native
  }
  object EmojificationOptions {
    
    @scala.inline
    def apply(emojify: String => String): EmojificationOptions = {
      val __obj = js.Dynamic.literal(emojify = js.Any.fromFunction1(emojify))
      __obj.asInstanceOf[EmojificationOptions]
    }
    
    @scala.inline
    implicit class EmojificationOptionsMutableBuilder[Self <: EmojificationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmojify(value: String => String): Self = StObject.set(x, "emojify", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait RatelimitingOptions extends StObject {
    
    var maxBackoff: js.UndefOr[Double] = js.native
    
    var maxRetries: js.UndefOr[Double] = js.native
    
    @JSName("notify")
    var notify_FRatelimitingOptions: js.UndefOr[js.Function2[/* methodName */ String, /* repeated */ js.Any, Unit]] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object RatelimitingOptions {
    
    @scala.inline
    def apply(): RatelimitingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatelimitingOptions]
    }
    
    @scala.inline
    implicit class RatelimitingOptionsMutableBuilder[Self <: RatelimitingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxBackoff(value: Double): Self = StObject.set(x, "maxBackoff", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBackoffUndefined: Self = StObject.set(x, "maxBackoff", js.undefined)
      
      @scala.inline
      def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
      
      @scala.inline
      def setNotify_(value: (/* methodName */ String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "notify", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait ResolvedChat extends StObject {
    
    var id: Double | String = js.native
    
    var `type`: String = js.native
    
    var username: String = js.native
    
    var when: String = js.native
  }
  object ResolvedChat {
    
    @scala.inline
    def apply(id: Double | String, `type`: String, username: String, when: String): ResolvedChat = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedChat]
    }
    
    @scala.inline
    implicit class ResolvedChatMutableBuilder[Self <: ResolvedChat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhen(value: String): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResolvedGroupOrChannel extends ResolvedChat {
    
    var title: String = js.native
  }
  object ResolvedGroupOrChannel {
    
    @scala.inline
    def apply(id: Double | String, title: String, `type`: String, username: String, when: String): ResolvedGroupOrChannel = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedGroupOrChannel]
    }
    
    @scala.inline
    implicit class ResolvedGroupOrChannelMutableBuilder[Self <: ResolvedGroupOrChannel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResolvedUser extends ResolvedChat {
    
    var first_name: String = js.native
    
    var last_name: js.UndefOr[String] = js.native
  }
  object ResolvedUser {
    
    @scala.inline
    def apply(first_name: String, id: Double | String, `type`: String, username: String, when: String): ResolvedUser = {
      val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], when = when.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedUser]
    }
    
    @scala.inline
    implicit class ResolvedUserMutableBuilder[Self <: ResolvedUser] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    }
  }
  
  @js.native
  trait Tgfancy
    extends typings.nodeTelegramBotApi.mod.^ {
    
    def closeWebSocket(): js.Promise[js.UndefOr[scala.Nothing]] = js.native
    
    def hasOpenWebSocket(): Boolean = js.native
    
    def kickChatMember(chatId: String, userId: String, ban: Boolean): js.Promise[Boolean] = js.native
    def kickChatMember(chatId: String, userId: Double): js.Promise[Boolean] = js.native
    def kickChatMember(chatId: String, userId: Double, ban: Boolean): js.Promise[Boolean] = js.native
    def kickChatMember(chatId: Double, userId: String, ban: Boolean): js.Promise[Boolean] = js.native
    def kickChatMember(chatId: Double, userId: Double): js.Promise[Boolean] = js.native
    def kickChatMember(chatId: Double, userId: Double, ban: Boolean): js.Promise[Boolean] = js.native
    
    def openWebSocket(): js.Promise[js.UndefOr[scala.Nothing]] = js.native
    
    def resolveChatId(chatId: String): js.Promise[ResolvedChat] = js.native
  }
  
  @js.native
  trait TgfancyOptions extends StObject {
    
    var chatIdResolution: js.UndefOr[Boolean | ChatIdResolutionOptions] = js.native
    
    var emojification: js.UndefOr[Boolean | EmojificationOptions] = js.native
    
    var kickWithoutBan: js.UndefOr[Boolean] = js.native
    
    var openshiftWebHook: js.UndefOr[Boolean] = js.native
    
    var orderedSending: js.UndefOr[Boolean] = js.native
    
    var ratelimiting: js.UndefOr[Boolean | RatelimitingOptions] = js.native
    
    var textPaging: js.UndefOr[Boolean] = js.native
    
    var webSocket: js.UndefOr[Boolean | WebSocketOptions] = js.native
  }
  object TgfancyOptions {
    
    @scala.inline
    def apply(): TgfancyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TgfancyOptions]
    }
    
    @scala.inline
    implicit class TgfancyOptionsMutableBuilder[Self <: TgfancyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChatIdResolution(value: Boolean | ChatIdResolutionOptions): Self = StObject.set(x, "chatIdResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChatIdResolutionUndefined: Self = StObject.set(x, "chatIdResolution", js.undefined)
      
      @scala.inline
      def setEmojification(value: Boolean | EmojificationOptions): Self = StObject.set(x, "emojification", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmojificationUndefined: Self = StObject.set(x, "emojification", js.undefined)
      
      @scala.inline
      def setKickWithoutBan(value: Boolean): Self = StObject.set(x, "kickWithoutBan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKickWithoutBanUndefined: Self = StObject.set(x, "kickWithoutBan", js.undefined)
      
      @scala.inline
      def setOpenshiftWebHook(value: Boolean): Self = StObject.set(x, "openshiftWebHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenshiftWebHookUndefined: Self = StObject.set(x, "openshiftWebHook", js.undefined)
      
      @scala.inline
      def setOrderedSending(value: Boolean): Self = StObject.set(x, "orderedSending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderedSendingUndefined: Self = StObject.set(x, "orderedSending", js.undefined)
      
      @scala.inline
      def setRatelimiting(value: Boolean | RatelimitingOptions): Self = StObject.set(x, "ratelimiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatelimitingUndefined: Self = StObject.set(x, "ratelimiting", js.undefined)
      
      @scala.inline
      def setTextPaging(value: Boolean): Self = StObject.set(x, "textPaging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextPagingUndefined: Self = StObject.set(x, "textPaging", js.undefined)
      
      @scala.inline
      def setWebSocket(value: Boolean | WebSocketOptions): Self = StObject.set(x, "webSocket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebSocketUndefined: Self = StObject.set(x, "webSocket", js.undefined)
    }
  }
  
  @js.native
  trait WebSocketOptions extends StObject {
    
    var autoOpen: js.UndefOr[Boolean] = js.native
    
    var url: String = js.native
  }
  object WebSocketOptions {
    
    @scala.inline
    def apply(url: String): WebSocketOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebSocketOptions]
    }
    
    @scala.inline
    implicit class WebSocketOptionsMutableBuilder[Self <: WebSocketOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}

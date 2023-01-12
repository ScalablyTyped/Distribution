package typings.twitter

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.request.mod.CoreOptions
import typings.request.mod.Request
import typings.request.mod.RequestAPI
import typings.request.mod.RequestCallback
import typings.request.mod.RequiredUriUrl
import typings.request.mod.Response
import typings.twitter.twitterStrings.site
import typings.twitter.twitterStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("twitter", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Twitter {
    def this(options: AccessTokenOptions) = this()
    def this(options: BearerTokenOptions) = this()
  }
  
  trait AccessTokenOptions
    extends StObject
       with Options {
    
    var access_token_key: String
    
    var access_token_secret: String
  }
  object AccessTokenOptions {
    
    inline def apply(
      access_token_key: String,
      access_token_secret: String,
      consumer_key: String,
      consumer_secret: String
    ): AccessTokenOptions = {
      val __obj = js.Dynamic.literal(access_token_key = access_token_key.asInstanceOf[js.Any], access_token_secret = access_token_secret.asInstanceOf[js.Any], consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessTokenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccessTokenOptions] (val x: Self) extends AnyVal {
      
      inline def setAccess_token_key(value: String): Self = StObject.set(x, "access_token_key", value.asInstanceOf[js.Any])
      
      inline def setAccess_token_secret(value: String): Self = StObject.set(x, "access_token_secret", value.asInstanceOf[js.Any])
    }
  }
  
  trait BearerTokenOptions
    extends StObject
       with Options {
    
    var bearer_token: String
  }
  object BearerTokenOptions {
    
    inline def apply(bearer_token: String, consumer_key: String, consumer_secret: String): BearerTokenOptions = {
      val __obj = js.Dynamic.literal(bearer_token = bearer_token.asInstanceOf[js.Any], consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[BearerTokenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BearerTokenOptions] (val x: Self) extends AnyVal {
      
      inline def setBearer_token(value: String): Self = StObject.set(x, "bearer_token", value.asInstanceOf[js.Any])
    }
  }
  
  type Callback = js.Function3[/* error */ Any, /* data */ ResponseData, /* response */ Response, Unit]
  
  trait Options extends StObject {
    
    var consumer_key: String
    
    var consumer_secret: String
    
    var media_base: js.UndefOr[String] = js.undefined
    
    var request_options: js.UndefOr[CoreOptions] = js.undefined
    
    var rest_base: js.UndefOr[String] = js.undefined
    
    var site_stream_base: js.UndefOr[String] = js.undefined
    
    var stream_base: js.UndefOr[String] = js.undefined
    
    var user_stream_base: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(consumer_key: String, consumer_secret: String): Options = {
      val __obj = js.Dynamic.literal(consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setConsumer_key(value: String): Self = StObject.set(x, "consumer_key", value.asInstanceOf[js.Any])
      
      inline def setConsumer_secret(value: String): Self = StObject.set(x, "consumer_secret", value.asInstanceOf[js.Any])
      
      inline def setMedia_base(value: String): Self = StObject.set(x, "media_base", value.asInstanceOf[js.Any])
      
      inline def setMedia_baseUndefined: Self = StObject.set(x, "media_base", js.undefined)
      
      inline def setRequest_options(value: CoreOptions): Self = StObject.set(x, "request_options", value.asInstanceOf[js.Any])
      
      inline def setRequest_optionsUndefined: Self = StObject.set(x, "request_options", js.undefined)
      
      inline def setRest_base(value: String): Self = StObject.set(x, "rest_base", value.asInstanceOf[js.Any])
      
      inline def setRest_baseUndefined: Self = StObject.set(x, "rest_base", js.undefined)
      
      inline def setSite_stream_base(value: String): Self = StObject.set(x, "site_stream_base", value.asInstanceOf[js.Any])
      
      inline def setSite_stream_baseUndefined: Self = StObject.set(x, "site_stream_base", js.undefined)
      
      inline def setStream_base(value: String): Self = StObject.set(x, "stream_base", value.asInstanceOf[js.Any])
      
      inline def setStream_baseUndefined: Self = StObject.set(x, "stream_base", js.undefined)
      
      inline def setUser_stream_base(value: String): Self = StObject.set(x, "user_stream_base", value.asInstanceOf[js.Any])
      
      inline def setUser_stream_baseUndefined: Self = StObject.set(x, "user_stream_base", js.undefined)
    }
  }
  
  trait RequestParams
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var base: js.UndefOr[String] = js.undefined
  }
  object RequestParams {
    
    inline def apply(): RequestParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestParams] (val x: Self) extends AnyVal {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    }
  }
  
  type ResponseData = StringDictionary[Any]
  
  @js.native
  trait Twitter extends StObject {
    
    val VERSION: String = js.native
    
    val allow_promise: Boolean = js.native
    
    def get(path: String): js.Promise[ResponseData] = js.native
    def get(path: String, callback: Callback): Unit = js.native
    def get(path: String, params: RequestParams): js.Promise[ResponseData] = js.native
    def get(path: String, params: RequestParams, callback: Callback): Unit = js.native
    
    def post(path: String): js.Promise[ResponseData] = js.native
    def post(path: String, callback: Callback): Unit = js.native
    def post(path: String, params: RequestParams): js.Promise[ResponseData] = js.native
    def post(path: String, params: RequestParams, callback: Callback): Unit = js.native
    
    def request(options: RequiredUriUrl & CoreOptions): Request = js.native
    def request(options: RequiredUriUrl & CoreOptions, callback: RequestCallback): Request = js.native
    def request(uri: String): Request = js.native
    def request(uri: String, callback: RequestCallback): Request = js.native
    def request(uri: String, options: Unit, callback: RequestCallback): Request = js.native
    def request(uri: String, options: CoreOptions): Request = js.native
    def request(uri: String, options: CoreOptions, callback: RequestCallback): Request = js.native
    @JSName("request")
    val request_Original: RequestAPI[Request, CoreOptions, RequiredUriUrl] = js.native
    
    def stream(method: user | site): EventEmitter = js.native
    def stream(method: user | site, callback: js.Function1[/* stream */ EventEmitter, Unit]): Unit = js.native
    def stream(method: user | site, params: StringDictionary[Any]): EventEmitter = js.native
    def stream(
      method: user | site,
      params: StringDictionary[Any],
      callback: js.Function1[/* stream */ EventEmitter, Unit]
    ): Unit = js.native
    def stream(method: String): EventEmitter = js.native
    def stream(method: String, callback: js.Function1[/* stream */ EventEmitter, Unit]): Unit = js.native
    def stream(method: String, params: StringDictionary[Any]): EventEmitter = js.native
    def stream(
      method: String,
      params: StringDictionary[Any],
      callback: js.Function1[/* stream */ EventEmitter, Unit]
    ): Unit = js.native
  }
}

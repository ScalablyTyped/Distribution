package typings.wechatMiniprogramXmly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xmlyMod {
  
  @JSImport("wechat-miniprogram-xmly/xmly", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with XMLY
  
  /**
    * API 请求参数
    */
  trait RequestParams extends StObject {
    
    var header: js.UndefOr[js.Object] = js.undefined
    
    var params: js.UndefOr[js.Object] = js.undefined
    
    var `type`: js.UndefOr[RequestType] = js.undefined
    
    var url: String
  }
  object RequestParams {
    
    inline def apply(url: String): RequestParams = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestParams]
    }
    
    extension [Self <: RequestParams](x: Self) {
      
      inline def setHeader(value: js.Object): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setType(value: RequestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * API 返回值
    */
  trait RequestResponse extends StObject {
    
    var code: Double
    
    var data: Any
    
    var message: String
  }
  object RequestResponse {
    
    inline def apply(code: Double, data: Any, message: String): RequestResponse = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestResponse]
    }
    
    extension [Self <: RequestResponse](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.GET
    - typings.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.POST
  */
  trait RequestType extends StObject
  object RequestType {
    
    inline def GET: typings.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.GET = "GET".asInstanceOf[typings.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.GET]
    
    inline def POST: typings.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.POST = "POST".asInstanceOf[typings.wechatMiniprogramXmly.wechatMiniprogramXmlyStrings.POST]
  }
  
  @js.native
  trait XMLY extends StObject {
    
    /**
      *  绑定第三方账户，需要当前已登陆喜马账号
      *  @param uid 第三方账户id
      */
    def bindThirdUid(uid: String): js.Promise[RequestResponse] = js.native
    
    /**
      * 通用请求方法 - 快捷方法 - get
      * @param url 请求 url
      * @param params  业务参数
      */
    def get(): js.Promise[RequestResponse] = js.native
    def get(url: String): js.Promise[RequestResponse] = js.native
    def get(url: String, params: js.Object): js.Promise[RequestResponse] = js.native
    def get(url: Unit, params: js.Object): js.Promise[RequestResponse] = js.native
    
    /**
      * 通用请求方法 - 快捷方法 - post
      * @param url 请求 url
      * @param params 业务参数
      */
    def post(): js.Promise[RequestResponse] = js.native
    def post(url: String): js.Promise[RequestResponse] = js.native
    def post(url: String, params: js.Object): js.Promise[RequestResponse] = js.native
    def post(url: Unit, params: js.Object): js.Promise[RequestResponse] = js.native
    
    /**
      * 通用请求方法，支持开放平台对外输出的所有接口请求。
      * 这是一个万金油方法，只要 url 对了，都可以请求通；
      *
      * @param param0
      * @param param0.url 请求 url
      * @param param0.type 请求类型
      * @param param0.params 业务参数
      */
    def request(param0: RequestParams): js.Promise[RequestResponse] = js.native
    
    /**
      *  解绑第三方账户，需要当前已登陆喜马账号
      *  @param uid 第三方账户id
      */
    def unbindThirdUid(uid: String): js.Promise[RequestResponse] = js.native
  }
}

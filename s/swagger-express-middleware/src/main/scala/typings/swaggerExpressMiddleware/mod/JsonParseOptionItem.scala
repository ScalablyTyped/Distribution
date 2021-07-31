package typings.swaggerExpressMiddleware.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JsonParseOptionItem extends StObject {
  
  /**
    * if deflated bodies will be inflated. (default: true)
    */
  var inflate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Controls the maximum request body size.
    * If this is a number, then the value specifies the number of bytes; if it is a string, the value is passed to the bytes library for parsing.
    * Defaults to '100kb'
    */
  var limit: js.UndefOr[String | Double] = js.undefined
  
  /**
    * passed to JSON.parse().
    */
  var receiver: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, js.Any]] = js.undefined
  
  /**
    * only parse objects and arrays. (default: true)
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type option is used to determine what media type the middleware will parse.
    * This option can be a function or a string.
    * If a string, type option is passed directly to the type-is library and this can be an extension name (like json), a mime type (like application/json), or a mime * type with a wildcard (like * / * or * /json).
    * If a function, the type option is called as fn(req) and the request is parsed if it returns a truthy value. Defaults to application/json
    */
  var `type`: js.UndefOr[
    (js.Function1[/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], String]) | String
  ] = js.undefined
  
  /**
    * The verify option, if supplied, is called as verify(req, res, buf, encoding), where buf is a Buffer of the raw request body and encoding is the encoding of the request.
    * The parsing can be aborted by throwing an error.
    */
  var verify: js.UndefOr[
    js.Function4[
      /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
      /* res */ Response, 
      /* buf */ Buffer, 
      /* encoding */ String, 
      Unit
    ]
  ] = js.undefined
}
object JsonParseOptionItem {
  
  @scala.inline
  def apply(): JsonParseOptionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsonParseOptionItem]
  }
  
  @scala.inline
  implicit class JsonParseOptionItemMutableBuilder[Self <: JsonParseOptionItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInflate(value: Boolean): Self = StObject.set(x, "inflate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInflateUndefined: Self = StObject.set(x, "inflate", js.undefined)
    
    @scala.inline
    def setLimit(value: String | Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setReceiver(value: (/* key */ String, /* value */ js.Any) => js.Any): Self = StObject.set(x, "receiver", js.Any.fromFunction2(value))
    
    @scala.inline
    def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    
    @scala.inline
    def setType(
      value: (js.Function1[/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], String]) | String
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeFunction1(value: /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query] => String): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVerify(
      value: (/* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* res */ Response, /* buf */ Buffer, /* encoding */ String) => Unit
    ): Self = StObject.set(x, "verify", js.Any.fromFunction4(value))
    
    @scala.inline
    def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
  }
}

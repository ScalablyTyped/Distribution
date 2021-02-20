package typings.swaggerExpressMiddleware.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextParserOptionItem extends StObject {
  
  /**
    * the default charset to parse as, if not specified in content-type. (default: 'utf-8')
    */
  var defaultCharset: js.UndefOr[String] = js.native
  
  /**
    * if deflated bodies will be inflated. (default: true)
    */
  var inflate: js.UndefOr[Boolean] = js.native
  
  /**
    * Controls the maximum request body size.
    * If this is a number, then the value specifies the number of bytes; if it is a string, the value is passed to the bytes library for parsing.
    * Defaults to '100kb'
    */
  var limit: js.UndefOr[String | Double] = js.native
  
  /**
    * The type option is used to determine what media type the middleware will parse.
    * This option can be a function or a string.
    * If a string, type option is passed directly to the type-is library and this can be an extension name (like txt), a mime type (like text/plain), or a mime type * with a wildcard (like * / * or text/ *).
    * If a function, the type option is called as fn(req) and the request is parsed if it returns a truthy value. Defaults to text/plain.
    */
  var `type`: js.UndefOr[
    (js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]) | String
  ] = js.native
  
  /**
    * function to verify body content, the parsing can be aborted by throwing an error.
    */
  var verify: js.UndefOr[
    js.Function4[
      /* req */ Request_[ParamsDictionary, _, _, Query], 
      /* res */ Response, 
      /* buf */ Buffer, 
      /* encoding */ String, 
      Unit
    ]
  ] = js.native
}
object TextParserOptionItem {
  
  @scala.inline
  def apply(): TextParserOptionItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextParserOptionItem]
  }
  
  @scala.inline
  implicit class TextParserOptionItemMutableBuilder[Self <: TextParserOptionItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultCharset(value: String): Self = StObject.set(x, "defaultCharset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCharsetUndefined: Self = StObject.set(x, "defaultCharset", js.undefined)
    
    @scala.inline
    def setInflate(value: Boolean): Self = StObject.set(x, "inflate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInflateUndefined: Self = StObject.set(x, "inflate", js.undefined)
    
    @scala.inline
    def setLimit(value: String | Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setType(value: (js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]) | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeFunction1(value: /* req */ Request_[ParamsDictionary, _, _, Query] => String): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVerify(
      value: (/* req */ Request_[ParamsDictionary, _, _, Query], /* res */ Response, /* buf */ Buffer, /* encoding */ String) => Unit
    ): Self = StObject.set(x, "verify", js.Any.fromFunction4(value))
    
    @scala.inline
    def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
  }
}

package typings.swaggerExpressMiddleware.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseRequestOptions extends StObject {
  
  /**
    * Cookie parser options
    */
  var cookie: js.UndefOr[CookieParserOptionItem] = js.undefined
  
  /**
    * JSON body parser options
    */
  var json: js.UndefOr[JsonParseOptionItem] = js.undefined
  
  /**
    * Multipart form data parser options
    */
  var multipart: js.UndefOr[MulterOptions] = js.undefined
  
  /**
    * Raw body parser options
    */
  var raw: js.UndefOr[RawParserOptionItem] = js.undefined
  
  /**
    * Plain-text body parser options
    */
  var text: js.UndefOr[TextParserOptionItem] = js.undefined
  
  /**
    * URL-encoded body parser options
    */
  var urlencoded: js.UndefOr[UrlEncodedOptionItem] = js.undefined
}
object ParseRequestOptions {
  
  @scala.inline
  def apply(): ParseRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseRequestOptions]
  }
  
  @scala.inline
  implicit class ParseRequestOptionsMutableBuilder[Self <: ParseRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCookie(value: CookieParserOptionItem): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
    
    @scala.inline
    def setJson(value: JsonParseOptionItem): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    @scala.inline
    def setMultipart(value: MulterOptions): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
    
    @scala.inline
    def setRaw(value: RawParserOptionItem): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setText(value: TextParserOptionItem): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setUrlencoded(value: UrlEncodedOptionItem): Self = StObject.set(x, "urlencoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlencodedUndefined: Self = StObject.set(x, "urlencoded", js.undefined)
  }
}

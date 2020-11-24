package typings.swaggerExpressMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseRequestOptions extends js.Object {
  
  /**
    * Cookie parser options
    */
  var cookie: js.UndefOr[CookieParserOptionItem] = js.native
  
  /**
    * JSON body parser options
    */
  var json: js.UndefOr[JsonParseOptionItem] = js.native
  
  /**
    * Multipart form data parser options
    */
  var multipart: js.UndefOr[MulterOptions] = js.native
  
  /**
    * Raw body parser options
    */
  var raw: js.UndefOr[RawParserOptionItem] = js.native
  
  /**
    * Plain-text body parser options
    */
  var text: js.UndefOr[TextParserOptionItem] = js.native
  
  /**
    * URL-encoded body parser options
    */
  var urlencoded: js.UndefOr[UrlEncodedOptionItem] = js.native
}
object ParseRequestOptions {
  
  @scala.inline
  def apply(): ParseRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseRequestOptions]
  }
  
  @scala.inline
  implicit class ParseRequestOptionsOps[Self <: ParseRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCookie(value: CookieParserOptionItem): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCookie: Self = this.set("cookie", js.undefined)
    
    @scala.inline
    def setJson(value: JsonParseOptionItem): Self = this.set("json", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    
    @scala.inline
    def setMultipart(value: MulterOptions): Self = this.set("multipart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipart: Self = this.set("multipart", js.undefined)
    
    @scala.inline
    def setRaw(value: RawParserOptionItem): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setText(value: TextParserOptionItem): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setUrlencoded(value: UrlEncodedOptionItem): Self = this.set("urlencoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlencoded: Self = this.set("urlencoded", js.undefined)
  }
}

package typings.winrtUwp.Windows.Web.Http.Headers

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the value of the Content-Type HTTP header on the HTTP content in a request or a response. */
@js.native
trait HttpMediaTypeHeaderValue extends js.Object {
  
  /** Gets or sets the character set of the entity-body used in the Content-Type HTTP header. */
  var charSet: String = js.native
  
  /** Gets or sets the media-type of the entity-body used in the Content-Type HTTP header. */
  var mediaType: String = js.native
  
  /** Gets a set of parameters included in the Content-Type HTTP header. */
  var parameters: IVector[HttpNameValueHeaderValue] = js.native
}
object HttpMediaTypeHeaderValue {
  
  @scala.inline
  def apply(charSet: String, mediaType: String, parameters: IVector[HttpNameValueHeaderValue]): HttpMediaTypeHeaderValue = {
    val __obj = js.Dynamic.literal(charSet = charSet.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpMediaTypeHeaderValue]
  }
  
  @scala.inline
  implicit class HttpMediaTypeHeaderValueOps[Self <: HttpMediaTypeHeaderValue] (val x: Self) extends AnyVal {
    
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
    def setCharSet(value: String): Self = this.set("charSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: String): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: IVector[HttpNameValueHeaderValue]): Self = this.set("parameters", value.asInstanceOf[js.Any])
  }
}

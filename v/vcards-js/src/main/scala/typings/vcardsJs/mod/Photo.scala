package typings.vcardsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Photo extends js.Object {
  
  /**
    * Attach a photo from a URL
    * @param   url       URL where photo can be found
    * @param  mediaType Media type of photo (JPEG, PNG, GIF)
    */
  def attachFromUrl(url: String, mediaType: String): Unit = js.native
  
  var base64: Boolean = js.native
  
  /**
    * Embed a photo from a file using base-64 encoding (not implemented yet)
    * @param  fileLocation - filename
    */
  def embedFromFile(fileLocation: String): Unit = js.native
  
  /**
    * Embed a photo from a base-64 string
    * @param  base64String - the base64 string
    * @param  mediaType - the media type
    */
  def embedFromString(base64String: String, mediaType: String): Unit = js.native
  
  var mediaType: String = js.native
  
  var url: String = js.native
}
object Photo {
  
  @scala.inline
  def apply(
    attachFromUrl: (String, String) => Unit,
    base64: Boolean,
    embedFromFile: String => Unit,
    embedFromString: (String, String) => Unit,
    mediaType: String,
    url: String
  ): Photo = {
    val __obj = js.Dynamic.literal(attachFromUrl = js.Any.fromFunction2(attachFromUrl), base64 = base64.asInstanceOf[js.Any], embedFromFile = js.Any.fromFunction1(embedFromFile), embedFromString = js.Any.fromFunction2(embedFromString), mediaType = mediaType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Photo]
  }
  
  @scala.inline
  implicit class PhotoOps[Self <: Photo] (val x: Self) extends AnyVal {
    
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
    def setAttachFromUrl(value: (String, String) => Unit): Self = this.set("attachFromUrl", js.Any.fromFunction2(value))
    
    @scala.inline
    def setBase64(value: Boolean): Self = this.set("base64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedFromFile(value: String => Unit): Self = this.set("embedFromFile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEmbedFromString(value: (String, String) => Unit): Self = this.set("embedFromString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMediaType(value: String): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
}

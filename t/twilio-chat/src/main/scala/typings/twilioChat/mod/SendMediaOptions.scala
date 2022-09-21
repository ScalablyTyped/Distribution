package typings.twilioChat.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These options can be passed to {@link Channel.sendMessage}.
  */
trait SendMediaOptions extends StObject {
  
  /**
    * Content type of media.
    */
  var contentType: String
  
  /**
    * Content to post.
    */
  var media: String | Buffer
}
object SendMediaOptions {
  
  inline def apply(contentType: String, media: String | Buffer): SendMediaOptions = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMediaOptions]
  }
  
  extension [Self <: SendMediaOptions](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: String | Buffer): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
  }
}

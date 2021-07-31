package typings.videoJs.mod.videojs

import typings.videoJs.videoJsNumbers.`0`
import typings.videoJs.videoJsNumbers.`1`
import typings.videoJs.videoJsNumbers.`2`
import typings.videoJs.videoJsNumbers.`3`
import typings.videoJs.videoJsNumbers.`4`
import typings.videoJs.videoJsNumbers.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Custom `MediaError` class which mimics the standard HTML5 `MediaError` class.
  *
  * @see [MediaError Spec]{@link https://dev.w3.org/html5/spec-author-view/video.html#mediaerror}
  * @see [Encrypted MediaError Spec]{@link https://www.w3.org/TR/2013/WD-encrypted-media-20130510/#error-codes}
  *
  */
trait MediaError extends StObject {
  
  /**
    * W3C error code for media error aborted.
    * @default 1
    */
  var MEDIA_ERR_ABORTED: `1`
  
  /**
    * W3C error code for any custom error.
    * @default 0
    */
  var MEDIA_ERR_CUSTOM: `0`
  
  /**
    * W3C error code for any decoding error.
    * @default 3
    */
  var MEDIA_ERR_DECODE: `3`
  
  /**
    * W3C error code for any time that a source is encrypted.
    * @default 5
    */
  var MEDIA_ERR_ENCRYPTED: `5`
  
  /**
    * W3C error code for any network error.
    * @default 2
    */
  var MEDIA_ERR_NETWORK: `2`
  
  /**
    * W3C error code for any time that a source is not supported.
    * @default 4
    */
  var MEDIA_ERR_SRC_NOT_SUPPORTED: `4`
  
  /**
    * The error code that refers two one of the defined `MediaError` types
    *
    */
  var code: Double
  
  /**
    * An optional message that to show with the error. Message is not part of the HTML5
    * video spec but allows for more informative custom errors.
    *
    */
  var message: String
  
  /**
    * An optional status code that can be set by plugins to allow even more detail about
    * the error. For example a plugin might provide a specific HTTP status code and an
    * error message for that code. Then when the plugin gets that error this class will
    * know how to display an error message for it. This allows a custom message to show
    * up on the `Player` error overlay.
    *
    */
  var status: js.Array[js.Any]
}
object MediaError {
  
  @scala.inline
  def apply(code: Double, message: String, status: js.Array[js.Any]): MediaError = {
    val __obj = js.Dynamic.literal(MEDIA_ERR_ABORTED = 1, MEDIA_ERR_CUSTOM = 0, MEDIA_ERR_DECODE = 3, MEDIA_ERR_ENCRYPTED = 5, MEDIA_ERR_NETWORK = 2, MEDIA_ERR_SRC_NOT_SUPPORTED = 4, code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaError]
  }
  
  @scala.inline
  implicit class MediaErrorMutableBuilder[Self <: MediaError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMEDIA_ERR_ABORTED(value: `1`): Self = StObject.set(x, "MEDIA_ERR_ABORTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMEDIA_ERR_CUSTOM(value: `0`): Self = StObject.set(x, "MEDIA_ERR_CUSTOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMEDIA_ERR_DECODE(value: `3`): Self = StObject.set(x, "MEDIA_ERR_DECODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMEDIA_ERR_ENCRYPTED(value: `5`): Self = StObject.set(x, "MEDIA_ERR_ENCRYPTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMEDIA_ERR_NETWORK(value: `2`): Self = StObject.set(x, "MEDIA_ERR_NETWORK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMEDIA_ERR_SRC_NOT_SUPPORTED(value: `4`): Self = StObject.set(x, "MEDIA_ERR_SRC_NOT_SUPPORTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: js.Array[js.Any]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusVarargs(value: js.Any*): Self = StObject.set(x, "status", js.Array(value :_*))
  }
}

package typings.videoDotJs.videoDotJsMod.videojs

import typings.videoDotJs.videoDotJsNumbers.`0`
import typings.videoDotJs.videoDotJsNumbers.`1`
import typings.videoDotJs.videoDotJsNumbers.`2`
import typings.videoDotJs.videoDotJsNumbers.`3`
import typings.videoDotJs.videoDotJsNumbers.`4`
import typings.videoDotJs.videoDotJsNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Custom `MediaError` class which mimics the standard HTML5 `MediaError` class.
  *
  * @see [MediaError Spec]{@link https://dev.w3.org/html5/spec-author-view/video.html#mediaerror}
  * @see [Encrypted MediaError Spec]{@link https://www.w3.org/TR/2013/WD-encrypted-media-20130510/#error-codes}
  *
  */
trait MediaError extends js.Object {
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
  var status: js.Array[_]
}

object MediaError {
  @scala.inline
  def apply(
    MEDIA_ERR_ABORTED: `1`,
    MEDIA_ERR_CUSTOM: `0`,
    MEDIA_ERR_DECODE: `3`,
    MEDIA_ERR_ENCRYPTED: `5`,
    MEDIA_ERR_NETWORK: `2`,
    MEDIA_ERR_SRC_NOT_SUPPORTED: `4`,
    code: Double,
    message: String,
    status: js.Array[_]
  ): MediaError = {
    val __obj = js.Dynamic.literal(MEDIA_ERR_ABORTED = MEDIA_ERR_ABORTED, MEDIA_ERR_CUSTOM = MEDIA_ERR_CUSTOM, MEDIA_ERR_DECODE = MEDIA_ERR_DECODE, MEDIA_ERR_ENCRYPTED = MEDIA_ERR_ENCRYPTED, MEDIA_ERR_NETWORK = MEDIA_ERR_NETWORK, MEDIA_ERR_SRC_NOT_SUPPORTED = MEDIA_ERR_SRC_NOT_SUPPORTED, code = code, message = message, status = status)
  
    __obj.asInstanceOf[MediaError]
  }
}


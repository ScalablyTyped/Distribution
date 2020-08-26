package typings.videoJs.mod.videojs

import typings.videoJs.videoJsNumbers.`0`
import typings.videoJs.videoJsNumbers.`1`
import typings.videoJs.videoJsNumbers.`2`
import typings.videoJs.videoJsNumbers.`3`
import typings.videoJs.videoJsNumbers.`4`
import typings.videoJs.videoJsNumbers.`5`
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
@js.native
trait MediaError extends js.Object {
  /**
    * W3C error code for media error aborted.
    * @default 1
    */
  var MEDIA_ERR_ABORTED: `1` = js.native
  /**
    * W3C error code for any custom error.
    * @default 0
    */
  var MEDIA_ERR_CUSTOM: `0` = js.native
  /**
    * W3C error code for any decoding error.
    * @default 3
    */
  var MEDIA_ERR_DECODE: `3` = js.native
  /**
    * W3C error code for any time that a source is encrypted.
    * @default 5
    */
  var MEDIA_ERR_ENCRYPTED: `5` = js.native
  /**
    * W3C error code for any network error.
    * @default 2
    */
  var MEDIA_ERR_NETWORK: `2` = js.native
  /**
    * W3C error code for any time that a source is not supported.
    * @default 4
    */
  var MEDIA_ERR_SRC_NOT_SUPPORTED: `4` = js.native
  /**
    * The error code that refers two one of the defined `MediaError` types
    *
    */
  var code: Double = js.native
  /**
    * An optional message that to show with the error. Message is not part of the HTML5
    * video spec but allows for more informative custom errors.
    *
    */
  var message: String = js.native
  /**
    * An optional status code that can be set by plugins to allow even more detail about
    * the error. For example a plugin might provide a specific HTTP status code and an
    * error message for that code. Then when the plugin gets that error this class will
    * know how to display an error message for it. This allows a custom message to show
    * up on the `Player` error overlay.
    *
    */
  var status: js.Array[_] = js.native
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
    val __obj = js.Dynamic.literal(MEDIA_ERR_ABORTED = MEDIA_ERR_ABORTED.asInstanceOf[js.Any], MEDIA_ERR_CUSTOM = MEDIA_ERR_CUSTOM.asInstanceOf[js.Any], MEDIA_ERR_DECODE = MEDIA_ERR_DECODE.asInstanceOf[js.Any], MEDIA_ERR_ENCRYPTED = MEDIA_ERR_ENCRYPTED.asInstanceOf[js.Any], MEDIA_ERR_NETWORK = MEDIA_ERR_NETWORK.asInstanceOf[js.Any], MEDIA_ERR_SRC_NOT_SUPPORTED = MEDIA_ERR_SRC_NOT_SUPPORTED.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaError]
  }
  @scala.inline
  implicit class MediaErrorOps[Self <: MediaError] (val x: Self) extends AnyVal {
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
    def setMEDIA_ERR_ABORTED(value: `1`): Self = this.set("MEDIA_ERR_ABORTED", value.asInstanceOf[js.Any])
    @scala.inline
    def setMEDIA_ERR_CUSTOM(value: `0`): Self = this.set("MEDIA_ERR_CUSTOM", value.asInstanceOf[js.Any])
    @scala.inline
    def setMEDIA_ERR_DECODE(value: `3`): Self = this.set("MEDIA_ERR_DECODE", value.asInstanceOf[js.Any])
    @scala.inline
    def setMEDIA_ERR_ENCRYPTED(value: `5`): Self = this.set("MEDIA_ERR_ENCRYPTED", value.asInstanceOf[js.Any])
    @scala.inline
    def setMEDIA_ERR_NETWORK(value: `2`): Self = this.set("MEDIA_ERR_NETWORK", value.asInstanceOf[js.Any])
    @scala.inline
    def setMEDIA_ERR_SRC_NOT_SUPPORTED(value: `4`): Self = this.set("MEDIA_ERR_SRC_NOT_SUPPORTED", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusVarargs(value: js.Any*): Self = this.set("status", js.Array(value :_*))
    @scala.inline
    def setStatus(value: js.Array[_]): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}


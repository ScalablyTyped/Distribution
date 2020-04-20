package typings.videoJs.videoCoreMod.default

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.videoJs.videoJsNumbers.`0`
import typings.videoJs.videoJsNumbers.`1`
import typings.videoJs.videoJsNumbers.`2`
import typings.videoJs.videoJsNumbers.`3`
import typings.videoJs.videoJsNumbers.`4`
import typings.videoJs.videoJsNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js/dist/alt/video.core", "MediaError")
@js.native
object MediaError
  extends /**
  * Create an instance of this class.
  *
  * @param value
  *        This can be of multiple types:
  *        - number: should be a standard error code
  *        - string: an error message (the code will be 0)
  *        - Object: arbitrary properties
  *        - `MediaError` (native): used to populate a video.js `MediaError` object
  *        - `MediaError` (video.js): will return itself if it's already a
  *          video.js `MediaError` object.
  */
Instantiable1[
      (/* value */ Double) | (/* value */ typings.videoJs.mod.videojs.MediaError) | (/* value */ String) | (/* value */ StringDictionary[js.Any]), 
      typings.videoJs.mod.videojs.MediaError
    ] {
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
    * The default `MediaError` messages based on the {@link MediaError.errorTypes}.
    */
  var defaultMessages: js.Array[String] = js.native
  /**
    * Errors indexed by the W3C standard. The order **CANNOT CHANGE**! See the
    * specification listed under {@link MediaError} for more information.
    *
    * 0 - MEDIA_ERR_CUSTOM
    * 1 - MEDIA_ERR_CUSTOM
    * 2 - MEDIA_ERR_ABORTED
    * 3 - MEDIA_ERR_NETWORK
    * 4 - MEDIA_ERR_SRC_NOT_SUPPORTED
    * 5 - MEDIA_ERR_ENCRYPTED
    */
  val errorTypes: js.Array[String] = js.native
}


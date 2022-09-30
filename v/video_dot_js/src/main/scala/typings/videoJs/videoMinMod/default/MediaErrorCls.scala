package typings.videoJs.videoMinMod.default

import org.scalablytyped.runtime.StringDictionary
import typings.videoJs.videoJsInts.`0`
import typings.videoJs.videoJsInts.`1`
import typings.videoJs.videoJsInts.`2`
import typings.videoJs.videoJsInts.`3`
import typings.videoJs.videoJsInts.`4`
import typings.videoJs.videoJsInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("video.js/dist/video.min", "default.MediaError")
@js.native
open class MediaErrorCls protected ()
  extends StObject
     with typings.videoJs.mod.videojs.MediaError {
  def this(value: String) = this()
  def this(value: StringDictionary[Any]) = this()
  /**
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
  def this(value: Double) = this()
  def this(value: typings.videoJs.mod.videojs.MediaError) = this()
  
  /**
    * W3C error code for media error aborted.
    * @default 1
    */
  /* CompleteClass */
  var MEDIA_ERR_ABORTED: `1` = js.native
  
  /**
    * W3C error code for any custom error.
    * @default 0
    */
  /* CompleteClass */
  var MEDIA_ERR_CUSTOM: `0` = js.native
  
  /**
    * W3C error code for any decoding error.
    * @default 3
    */
  /* CompleteClass */
  var MEDIA_ERR_DECODE: `3` = js.native
  
  /**
    * W3C error code for any time that a source is encrypted.
    * @default 5
    */
  /* CompleteClass */
  var MEDIA_ERR_ENCRYPTED: `5` = js.native
  
  /**
    * W3C error code for any network error.
    * @default 2
    */
  /* CompleteClass */
  var MEDIA_ERR_NETWORK: `2` = js.native
  
  /**
    * W3C error code for any time that a source is not supported.
    * @default 4
    */
  /* CompleteClass */
  var MEDIA_ERR_SRC_NOT_SUPPORTED: `4` = js.native
  
  /**
    * The error code that refers two one of the defined `MediaError` types
    *
    */
  /* CompleteClass */
  var code: Double = js.native
  
  /**
    * An optional message that to show with the error. Message is not part of the HTML5
    * video spec but allows for more informative custom errors.
    *
    */
  /* CompleteClass */
  var message: String = js.native
  
  /**
    * An optional status code that can be set by plugins to allow even more detail about
    * the error. For example a plugin might provide a specific HTTP status code and an
    * error message for that code. Then when the plugin gets that error this class will
    * know how to display an error message for it. This allows a custom message to show
    * up on the `Player` error overlay.
    *
    */
  /* CompleteClass */
  var status: js.Array[Any] = js.native
}

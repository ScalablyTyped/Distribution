package typings.videoJs.videoCoreMod.default

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js/dist/alt/video.core", "MediaError")
@js.native
class MediaErrorCls protected ()
  extends typings.videoJs.mod.videojs.MediaError {
  def this(value: String) = this()
  def this(value: StringDictionary[js.Any]) = this()
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
}


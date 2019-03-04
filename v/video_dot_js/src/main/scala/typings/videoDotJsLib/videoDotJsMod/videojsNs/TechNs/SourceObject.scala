package typings
package videoDotJsLib.videoDotJsMod.videojsNs.TechNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An Object containing a structure like: `{src: 'url', type: 'mimetype'}` or string
		 * that just contains the src url alone.
		 * `var SourceObject = {src: 'http://ex.com/video.mp4', type: 'video/mp4'};`
		 * `var SourceString = 'http://example.com/some-video.mp4';`
		 */
trait SourceObject extends js.Object {
  /**
  			 * The url to the source
  			 */
  var src: java.lang.String
  /**
  			 * The mime type of the source
  			 */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SourceObject {
  @scala.inline
  def apply(src: java.lang.String, `type`: java.lang.String = null): SourceObject = {
    val __obj = js.Dynamic.literal(src = src)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SourceObject]
  }
}


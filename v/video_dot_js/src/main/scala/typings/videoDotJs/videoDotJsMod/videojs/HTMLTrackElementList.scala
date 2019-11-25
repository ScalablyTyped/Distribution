package typings.videoDotJs.videoDotJsMod.videojs

import org.scalablytyped.runtime.NumberDictionary
import typings.std.HTMLTrackElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The current list of {@link HtmlTrackElement}s.
  */
trait HTMLTrackElementList extends /* index */ NumberDictionary[HTMLTrackElement] {
  /**
    * The current number of `Track`s in the this Trackist.
    */
  var length: Double
}

object HTMLTrackElementList {
  @scala.inline
  def apply(length: Double, NumberDictionary: /* index */ NumberDictionary[HTMLTrackElement] = null): HTMLTrackElementList = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[HTMLTrackElementList]
  }
}


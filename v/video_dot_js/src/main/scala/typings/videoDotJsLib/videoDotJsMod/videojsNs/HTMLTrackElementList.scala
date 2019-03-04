package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The current list of {@link HtmlTrackElement}s.
	 */
trait HTMLTrackElementList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[stdLib.HTMLTrackElement] {
  /**
  		 * The current number of `Track`s in the this Trackist.
  		 */
  var length: scala.Double
}

object HTMLTrackElementList {
  @scala.inline
  def apply(
    length: scala.Double,
    NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[stdLib.HTMLTrackElement] = null
  ): HTMLTrackElementList = {
    val __obj = js.Dynamic.literal(length = length)
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[HTMLTrackElementList]
  }
}


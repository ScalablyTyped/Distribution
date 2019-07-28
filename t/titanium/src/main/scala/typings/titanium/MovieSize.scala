package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simple object used to describe the size of a movie.
  */
trait MovieSize extends js.Object {
  /**
  	 * Height of the movie.
  	 */
  var height: js.UndefOr[Double] = js.undefined
  /**
  	 * Width of the movie.
  	 */
  var width: js.UndefOr[Double] = js.undefined
}

object MovieSize {
  @scala.inline
  def apply(height: Int | Double = null, width: Int | Double = null): MovieSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovieSize]
  }
}


package typings
package titaniumLib

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
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Width of the movie.
  	 */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object MovieSize {
  @scala.inline
  def apply(height: scala.Int | scala.Double = null, width: scala.Int | scala.Double = null): MovieSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovieSize]
  }
}


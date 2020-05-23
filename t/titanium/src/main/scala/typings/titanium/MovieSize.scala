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
  def apply(height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): MovieSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MovieSize]
  }
}


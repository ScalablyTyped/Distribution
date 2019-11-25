package typings.twit.twitMod.Twitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sizes extends js.Object {
  var large: Size
  var medium: Size
  var small: Size
  var thumb: Size
}

object Sizes {
  @scala.inline
  def apply(large: Size, medium: Size, small: Size, thumb: Size): Sizes = {
    val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Sizes]
  }
}


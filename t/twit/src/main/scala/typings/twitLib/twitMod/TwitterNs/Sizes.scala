package typings
package twitLib.twitMod.TwitterNs

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
    val __obj = js.Dynamic.literal(large = large, medium = medium, small = small, thumb = thumb)
  
    __obj.asInstanceOf[Sizes]
  }
}


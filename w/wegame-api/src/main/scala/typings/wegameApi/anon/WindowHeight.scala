package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowHeight extends js.Object {
  var windowHeight: Double
  var windowWidth: Double
}

object WindowHeight {
  @scala.inline
  def apply(windowHeight: Double, windowWidth: Double): WindowHeight = {
    val __obj = js.Dynamic.literal(windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowHeight]
  }
}


package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWindowHeight extends js.Object {
  var windowHeight: Double
  var windowWidth: Double
}

object AnonWindowHeight {
  @scala.inline
  def apply(windowHeight: Double, windowWidth: Double): AnonWindowHeight = {
    val __obj = js.Dynamic.literal(windowHeight = windowHeight.asInstanceOf[js.Any], windowWidth = windowWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWindowHeight]
  }
}


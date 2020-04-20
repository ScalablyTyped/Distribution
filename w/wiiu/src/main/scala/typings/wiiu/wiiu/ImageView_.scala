package typings.wiiu.wiiu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageView_ extends js.Object {
  var viewMode: Double
  def end(): Boolean
  def getErrorCode(): Double
}

object ImageView_ {
  @scala.inline
  def apply(end: () => Boolean, getErrorCode: () => Double, viewMode: Double): ImageView_ = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), getErrorCode = js.Any.fromFunction0(getErrorCode), viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageView_]
  }
}


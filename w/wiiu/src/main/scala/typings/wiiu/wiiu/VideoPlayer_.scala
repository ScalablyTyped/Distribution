package typings.wiiu.wiiu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoPlayer_ extends js.Object {
  var viewMode: Double
  def end(): Boolean
}

object VideoPlayer_ {
  @scala.inline
  def apply(end: () => Boolean, viewMode: Double): VideoPlayer_ = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayer_]
  }
}


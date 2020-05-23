package typings.webVitals.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsUnloading extends js.Object {
  var isUnloading: Boolean
  var timeStamp: Double
}

object IsUnloading {
  @scala.inline
  def apply(isUnloading: Boolean, timeStamp: Double): IsUnloading = {
    val __obj = js.Dynamic.literal(isUnloading = isUnloading.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsUnloading]
  }
}


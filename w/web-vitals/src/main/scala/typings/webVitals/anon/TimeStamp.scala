package typings.webVitals.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeStamp extends js.Object {
  val timeStamp: Double
}

object TimeStamp {
  @scala.inline
  def apply(timeStamp: Double): TimeStamp = {
    val __obj = js.Dynamic.literal(timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeStamp]
  }
}


package typings.twitterText.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait End extends js.Object {
  var end: Double
  var start: Double
  var weight: Double
}

object End {
  @scala.inline
  def apply(end: Double, start: Double, weight: Double): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
}


package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTime extends js.Object {
  var universalTime: Double
}

object DateTime {
  @scala.inline
  def apply(universalTime: Double): DateTime = {
    val __obj = js.Dynamic.literal(universalTime = universalTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTime]
  }
}


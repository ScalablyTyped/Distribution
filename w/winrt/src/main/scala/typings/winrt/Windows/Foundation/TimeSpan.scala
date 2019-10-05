package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeSpan extends js.Object {
  var duration: Double
}

object TimeSpan {
  @scala.inline
  def apply(duration: Double): TimeSpan = {
    val __obj = js.Dynamic.literal(duration = duration)
  
    __obj.asInstanceOf[TimeSpan]
  }
}


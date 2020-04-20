package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HResult extends js.Object {
  var value: Double
}

object HResult {
  @scala.inline
  def apply(value: Double): HResult = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HResult]
  }
}


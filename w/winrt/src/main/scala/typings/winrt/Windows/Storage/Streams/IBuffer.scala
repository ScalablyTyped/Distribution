package typings.winrt.Windows.Storage.Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBuffer extends js.Object {
  var capacity: Double
  var length: Double
}

object IBuffer {
  @scala.inline
  def apply(capacity: Double, length: Double): IBuffer = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBuffer]
  }
}


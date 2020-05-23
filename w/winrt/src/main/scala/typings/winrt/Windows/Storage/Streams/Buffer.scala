package typings.winrt.Windows.Storage.Streams

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Buffer extends IBuffer

object Buffer {
  @scala.inline
  def apply(capacity: Double, length: Double): Buffer = {
    val __obj = js.Dynamic.literal(capacity = capacity.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buffer]
  }
}


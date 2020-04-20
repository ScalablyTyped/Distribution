package typings.winstonLogglyBulk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferOptions extends js.Object {
  var retriesInMilliseconds: Double
  var size: Double
}

object BufferOptions {
  @scala.inline
  def apply(retriesInMilliseconds: Double, size: Double): BufferOptions = {
    val __obj = js.Dynamic.literal(retriesInMilliseconds = retriesInMilliseconds.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferOptions]
  }
}


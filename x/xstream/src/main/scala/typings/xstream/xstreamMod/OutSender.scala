package typings.xstream.xstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutSender[T] extends js.Object {
  var out: Stream[T]
}

object OutSender {
  @scala.inline
  def apply[T](out: Stream[T]): OutSender[T] = {
    val __obj = js.Dynamic.literal(out = out)
  
    __obj.asInstanceOf[OutSender[T]]
  }
}


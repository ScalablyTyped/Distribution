package typings.xstream.xstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregator[T, U]
  extends InternalProducer[U]
     with OutSender[U] {
  var insArr: js.Array[Stream[T]]
  var `type`: String
  def _start(out: Stream[U]): Unit
}

object Aggregator {
  @scala.inline
  def apply[T, U](
    _start: Stream[U] => Unit,
    _stop: () => Unit,
    insArr: js.Array[Stream[T]],
    out: Stream[U],
    `type`: String
  ): Aggregator[T, U] = {
    val __obj = js.Dynamic.literal(_start = js.Any.fromFunction1(_start), _stop = js.Any.fromFunction0(_stop), insArr = insArr.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aggregator[T, U]]
  }
}


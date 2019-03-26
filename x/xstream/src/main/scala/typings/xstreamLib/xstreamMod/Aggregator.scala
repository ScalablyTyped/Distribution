package typings
package xstreamLib.xstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Aggregator[T, U]
  extends InternalProducer[U]
     with OutSender[U] {
  var insArr: js.Array[Stream[T]]
  var `type`: java.lang.String
  def _start(out: Stream[U]): scala.Unit
}

object Aggregator {
  @scala.inline
  def apply[T, U](
    _start: Stream[U] => scala.Unit,
    _stop: () => scala.Unit,
    insArr: js.Array[Stream[T]],
    out: Stream[U],
    `type`: java.lang.String
  ): Aggregator[T, U] = {
    val __obj = js.Dynamic.literal(_start = js.Any.fromFunction1(_start), _stop = js.Any.fromFunction0(_stop), insArr = insArr, out = out)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Aggregator[T, U]]
  }
}


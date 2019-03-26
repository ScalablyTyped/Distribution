package typings
package xstreamLib.xstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operator[T, R]
  extends InternalProducer[R]
     with InternalListener[T]
     with OutSender[R] {
  var ins: Stream[T]
  var `type`: java.lang.String
  def _start(out: Stream[R]): scala.Unit
}

object Operator {
  @scala.inline
  def apply[T, R](
    _c: () => scala.Unit,
    _e: js.Any => scala.Unit,
    _n: T => scala.Unit,
    _start: Stream[R] => scala.Unit,
    _stop: () => scala.Unit,
    ins: Stream[T],
    out: Stream[R],
    `type`: java.lang.String
  ): Operator[T, R] = {
    val __obj = js.Dynamic.literal(_c = js.Any.fromFunction0(_c), _e = js.Any.fromFunction1(_e), _n = js.Any.fromFunction1(_n), _start = js.Any.fromFunction1(_start), _stop = js.Any.fromFunction0(_stop), ins = ins, out = out)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Operator[T, R]]
  }
}


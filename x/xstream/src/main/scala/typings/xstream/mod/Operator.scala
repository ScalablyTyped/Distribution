package typings.xstream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operator[T, R]
  extends InternalProducer[R]
     with InternalListener[T]
     with OutSender[R] {
  var ins: Stream[T]
  var `type`: String
  def _start(out: Stream[R]): Unit
}

object Operator {
  @scala.inline
  def apply[T, R](
    _c: () => Unit,
    _e: js.Any => Unit,
    _n: T => Unit,
    _start: Stream[R] => Unit,
    _stop: () => Unit,
    ins: Stream[T],
    out: Stream[R],
    `type`: String
  ): Operator[T, R] = {
    val __obj = js.Dynamic.literal(_c = js.Any.fromFunction0(_c), _e = js.Any.fromFunction1(_e), _n = js.Any.fromFunction1(_n), _start = js.Any.fromFunction1(_start), _stop = js.Any.fromFunction0(_stop), ins = ins.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operator[T, R]]
  }
}


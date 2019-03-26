package typings
package xstreamLib.xstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalProducer[T] extends js.Object {
  def _start(listener: InternalListener[T]): scala.Unit
  def _stop(): scala.Unit
}

object InternalProducer {
  @scala.inline
  def apply[T](_start: InternalListener[T] => scala.Unit, _stop: () => scala.Unit): InternalProducer[T] = {
    val __obj = js.Dynamic.literal(_start = js.Any.fromFunction1(_start), _stop = js.Any.fromFunction0(_stop))
  
    __obj.asInstanceOf[InternalProducer[T]]
  }
}


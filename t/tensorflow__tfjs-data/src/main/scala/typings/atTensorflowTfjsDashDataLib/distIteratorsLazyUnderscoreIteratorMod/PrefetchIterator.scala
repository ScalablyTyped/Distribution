package typings
package atTensorflowTfjsDashDataLib.distIteratorsLazyUnderscoreIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "PrefetchIterator")
@js.native
class PrefetchIterator[T] protected () extends LazyIterator[T] {
  def this(upstream: LazyIterator[T], bufferSize: scala.Double) = this()
  var buffer: atTensorflowTfjsDashDataLib.distUtilRingUnderscoreBufferMod.RingBuffer[js.Promise[stdLib.IteratorResult[T]]] = js.native
  var bufferSize: scala.Double = js.native
  var upstream: LazyIterator[T] = js.native
  /**
    * Refill the prefetch buffer.  Returns only after the buffer is full, or
    * the upstream source is exhausted.
    */
  /* protected */ def refill(): scala.Unit = js.native
}


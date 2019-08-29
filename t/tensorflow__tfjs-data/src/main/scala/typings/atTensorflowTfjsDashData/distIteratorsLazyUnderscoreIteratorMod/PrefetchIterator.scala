package typings.atTensorflowTfjsDashData.distIteratorsLazyUnderscoreIteratorMod

import typings.atTensorflowTfjsDashData.distUtilRingUnderscoreBufferMod.RingBuffer
import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "PrefetchIterator")
@js.native
class PrefetchIterator[T] protected () extends LazyIterator[T] {
  def this(upstream: LazyIterator[T], bufferSize: Double) = this()
  var buffer: RingBuffer[js.Promise[IteratorResult[T, _]]] = js.native
  var bufferSize: Double = js.native
  var upstream: LazyIterator[T] = js.native
  /**
    * Refill the prefetch buffer.  Returns only after the buffer is full, or
    * the upstream source is exhausted.
    */
  /* protected */ def refill(): Unit = js.native
}


package typings.atTensorflowTfjsDashData.distIteratorsLazyUnderscoreIteratorMod

import typings.atTensorflowTfjsDashData.distUtilRingUnderscoreBufferMod.RingBuffer
import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "OneToManyIterator")
@js.native
abstract class OneToManyIterator[T] () extends LazyIterator[T] {
  var lastRead: js.Any = js.native
  var outputQueue: RingBuffer[T] = js.native
  /**
    * Read one or more chunks from upstream and process them, possibly
    * reading or writing a carryover, and adding processed items to the
    * output queue.  Note it's possible that no items are added to the queue
    * on a given pump() call, even if the upstream stream is not closed
    * (e.g., because items are filtered).
    *
    * @return `true` if any action was taken, i.e. fetching items from the
    *   upstream source OR adding items to the output queue.  `false` if the
    *   upstream source is exhausted AND nothing was added to the queue
    * (i.e., any remaining carryover).
    */
  /* protected */ def pump(): js.Promise[Boolean] = js.native
  def serialNext(): js.Promise[IteratorResult[T, _]] = js.native
}


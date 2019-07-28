package typings.atTensorflowTfjsDashData.distIteratorsLazyUnderscoreIteratorMod

import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "ShuffleIterator")
@js.native
class ShuffleIterator[T] protected () extends PrefetchIterator[T] {
  def this(upstream: LazyIterator[T], windowSize: Double) = this()
  def this(upstream: LazyIterator[T], windowSize: Double, seed: String) = this()
  var lastRead: js.Any = js.native
  val random: js.Any = js.native
  var randomInt: js.Any = js.native
  var upstreamExhausted: js.Any = js.native
  var windowSize: Double = js.native
  /* protected */ def chooseIndex(): Double = js.native
  def serialNext(): js.Promise[IteratorResult[T]] = js.native
}


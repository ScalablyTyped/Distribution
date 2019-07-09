package typings
package atTensorflowTfjsDashDataLib.distIteratorsLazyUnderscoreIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "ShuffleIterator")
@js.native
class ShuffleIterator[T] protected () extends PrefetchIterator[T] {
  def this(upstream: LazyIterator[T], windowSize: scala.Double) = this()
  def this(upstream: LazyIterator[T], windowSize: scala.Double, seed: java.lang.String) = this()
  var lastRead: js.Any = js.native
  val random: js.Any = js.native
  var randomInt: js.Any = js.native
  var upstreamExhausted: js.Any = js.native
  var windowSize: scala.Double = js.native
  /* protected */ def chooseIndex(): scala.Double = js.native
  def serialNext(): js.Promise[stdLib.IteratorResult[T]] = js.native
}


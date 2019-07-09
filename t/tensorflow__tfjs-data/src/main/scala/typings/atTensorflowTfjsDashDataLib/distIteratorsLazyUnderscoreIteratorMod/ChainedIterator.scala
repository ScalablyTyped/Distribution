package typings
package atTensorflowTfjsDashDataLib.distIteratorsLazyUnderscoreIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-data/dist/iterators/lazy_iterator", "ChainedIterator")
@js.native
class ChainedIterator[T] protected () extends LazyIterator[T] {
  def this(iterators: LazyIterator[LazyIterator[T]]) = this()
  def this(iterators: LazyIterator[LazyIterator[T]], baseErrorHandler: js.Function1[/* e */ stdLib.Error, scala.Boolean]) = this()
  val baseErrorHandler: js.UndefOr[js.Any] = js.native
  var iterator: js.Any = js.native
  var lastRead: js.Any = js.native
  var moreIterators: js.Any = js.native
  var readFromChain: js.Any = js.native
}


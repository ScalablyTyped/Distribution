package typings.tstl

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.internalFunctionalWriteonlyMod.Writeonly
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.rangesContainerIForwardContainerMod.IForwardContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/ranges/algorithm/random", JSImport.Namespace)
@js.native
object rangesAlgorithmRandomMod extends js.Object {
  def sample[Range /* <: js.Array[_] | IForwardContainer[_] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](range: Range, first: OutputIterator, n: Double): OutputIterator = js.native
}


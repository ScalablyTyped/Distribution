package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIFakeMod.Writeonly
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "partition_copy")
@js.native
object partition_copy extends js.Object {
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator1 /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator1]] */, OutputIterator2 /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator2]] */](
    first: InputIterator,
    last: InputIterator,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: js.Function1[/* val */ ValueType[InputIterator], ValueType[InputIterator]]
  ): typings.tstl.utilityPairMod.Pair[OutputIterator1, OutputIterator2] = js.native
}


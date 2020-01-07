package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "partition_copy")
@js.native
object partition_copy extends js.Object {
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator1 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<InputIterator>, OutputIterator1>> */ js.Any */, OutputIterator2 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<InputIterator>, OutputIterator2>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: js.Function1[/* val */ ValueType[InputIterator], ValueType[InputIterator]]
  ): typings.tstl.utilityPairMod.Pair[OutputIterator1, OutputIterator2] = js.native
}


package typings.tstl.tstlMod

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", "partial_sort_copy")
@js.native
object partial_sort_copy extends js.Object {
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, RandomAccessIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<InputIterator>, RandomAccessIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    output_first: RandomAccessIterator,
    output_last: RandomAccessIterator
  ): RandomAccessIterator = js.native
  def apply[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, RandomAccessIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<InputIterator>, RandomAccessIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    output_first: RandomAccessIterator,
    output_last: RandomAccessIterator,
    comp: js.Function2[/* x */ ValueType[InputIterator], /* y */ ValueType[InputIterator], Boolean]
  ): RandomAccessIterator = js.native
}


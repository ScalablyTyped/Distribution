package typings.tstl

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/sorting", JSImport.Namespace)
@js.native
object algorithmSortingMod extends js.Object {
  def is_sorted[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): Boolean = js.native
  def is_sorted[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    comp: js.Function2[/* x */ ValueType[InputIterator], /* y */ ValueType[InputIterator], Boolean]
  ): Boolean = js.native
  def is_sorted_until[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def is_sorted_until[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    comp: js.Function2[/* x */ ValueType[InputIterator], /* y */ ValueType[InputIterator], Boolean]
  ): InputIterator = js.native
  def nth_element[RandomAccessIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IRandomAccessIterator<IPointer.ValueType<RandomAccessIterator>, RandomAccessIterator>> */ js.Any */](first: RandomAccessIterator, nth: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def nth_element[RandomAccessIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IRandomAccessIterator<IPointer.ValueType<RandomAccessIterator>, RandomAccessIterator>> */ js.Any */](
    first: RandomAccessIterator,
    nth: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def partial_sort[RandomAccessIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IRandomAccessIterator<IPointer.ValueType<RandomAccessIterator>, RandomAccessIterator>> */ js.Any */](first: RandomAccessIterator, middle: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def partial_sort[RandomAccessIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IRandomAccessIterator<IPointer.ValueType<RandomAccessIterator>, RandomAccessIterator>> */ js.Any */](
    first: RandomAccessIterator,
    middle: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def partial_sort_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, RandomAccessIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<InputIterator>, RandomAccessIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    output_first: RandomAccessIterator,
    output_last: RandomAccessIterator
  ): RandomAccessIterator = js.native
  def partial_sort_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, RandomAccessIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<InputIterator>, RandomAccessIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    output_first: RandomAccessIterator,
    output_last: RandomAccessIterator,
    comp: js.Function2[/* x */ ValueType[InputIterator], /* y */ ValueType[InputIterator], Boolean]
  ): RandomAccessIterator = js.native
  def sort[RandomAccessIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IRandomAccessIterator<IPointer.ValueType<RandomAccessIterator>, RandomAccessIterator>> */ js.Any */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def sort[RandomAccessIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IRandomAccessIterator<IPointer.ValueType<RandomAccessIterator>, RandomAccessIterator>> */ js.Any */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def stable_sort[RandomAccessIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IRandomAccessIterator<IPointer.ValueType<RandomAccessIterator>, RandomAccessIterator>> */ js.Any */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def stable_sort[RandomAccessIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IRandomAccessIterator<IPointer.ValueType<RandomAccessIterator>, RandomAccessIterator>> */ js.Any */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
}


package typings.tstl

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIBidirectionalIteratorMod.IBidirectionalIterator
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/modifiers", JSImport.Namespace)
@js.native
object algorithmModifiersMod extends js.Object {
  def copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<InputIterator>, OutputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def copy_backward[InputIterator /* <: IBidirectionalIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IBidirectionalIterator<IPointer.ValueType<InputIterator>, OutputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def copy_if[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<InputIterator>, OutputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function1[/* x */ ValueType[InputIterator], Boolean]
  ): OutputIterator = js.native
  def copy_n[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<InputIterator>, OutputIterator>> */ js.Any */](first: InputIterator, n: Double, output: OutputIterator): OutputIterator = js.native
  def fill[ForwardIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<ForwardIterator>, ForwardIterator>> */ js.Any */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): Unit = js.native
  def fill_n[OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<OutputIterator>, OutputIterator>> */ js.Any */](first: OutputIterator, n: Double, `val`: ValueType[OutputIterator]): OutputIterator = js.native
  def generate[ForwardIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<ForwardIterator>, ForwardIterator>> */ js.Any */](first: ForwardIterator, last: ForwardIterator, gen: js.Function0[ValueType[ForwardIterator]]): Unit = js.native
  def generate_n[ForwardIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<ForwardIterator>, ForwardIterator>> */ js.Any */](first: ForwardIterator, n: Double, gen: js.Function0[ValueType[ForwardIterator]]): ForwardIterator = js.native
  def iter_swap[ForwardIterator1 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<ForwardIterator1>, ForwardIterator1>> */ js.Any */, ForwardIterator2 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<ForwardIterator1>, ForwardIterator2>> */ js.Any */](x: ForwardIterator1, y: ForwardIterator2): Unit = js.native
  def remove[InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<InputIterator>, InputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, `val`: ValueType[InputIterator]): InputIterator = js.native
  def remove_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<InputIterator>, OutputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, output: OutputIterator, `val`: ValueType[InputIterator]): OutputIterator = js.native
  def remove_copy_if[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<InputIterator>, OutputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function1[/* x */ ValueType[InputIterator], Boolean]
  ): OutputIterator = js.native
  def remove_if[InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<InputIterator>, InputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean]
  ): InputIterator = js.native
  def replace[InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<InputIterator>, InputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    old_val: ValueType[InputIterator],
    new_val: ValueType[InputIterator]
  ): Unit = js.native
  def replace_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<InputIterator>, OutputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    old_val: ValueType[InputIterator],
    new_val: ValueType[InputIterator]
  ): OutputIterator = js.native
  def replace_copy_if[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<InputIterator>, OutputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    result: OutputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean],
    new_val: ValueType[InputIterator]
  ): OutputIterator = js.native
  def replace_if[InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<InputIterator>, InputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean],
    new_val: ValueType[InputIterator]
  ): Unit = js.native
  def reverse[BidirectionalIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IBidirectionalIterator<IPointer.ValueType<BidirectionalIterator>, BidirectionalIterator>> */ js.Any */](first: BidirectionalIterator, last: BidirectionalIterator): Unit = js.native
  def reverse_copy[BidirectionalIterator /* <: IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<BidirectionalIterator>, OutputIterator>> */ js.Any */](first: BidirectionalIterator, last: BidirectionalIterator, output: OutputIterator): OutputIterator = js.native
  def rotate[InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<InputIterator>, InputIterator>> */ js.Any */](first: InputIterator, middle: InputIterator, last: InputIterator): InputIterator = js.native
  def rotate_copy[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<ForwardIterator>, OutputIterator>> */ js.Any */](first: ForwardIterator, middle: ForwardIterator, last: ForwardIterator, output: OutputIterator): OutputIterator = js.native
  def shift_left[ForwardIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<ForwardIterator>, ForwardIterator>> */ js.Any */](first: ForwardIterator, last: ForwardIterator, n: Double): ForwardIterator = js.native
  def shift_right[ForwardIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IBidirectionalIterator<IPointer.ValueType<ForwardIterator>, ForwardIterator>> */ js.Any */](first: ForwardIterator, last: ForwardIterator, n: Double): ForwardIterator = js.native
  def shuffle[RandomAccessIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IRandomAccessIterator<IPointer.ValueType<RandomAccessIterator>, RandomAccessIterator>> */ js.Any */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def swap_ranges[ForwardIterator1 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<ForwardIterator1>, ForwardIterator1>> */ js.Any */, ForwardIterator2 /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<ForwardIterator1>, ForwardIterator2>> */ js.Any */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): ForwardIterator2 = js.native
  def transform[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<OutputIterator>, OutputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    result: OutputIterator,
    op: js.Function1[/* val */ ValueType[InputIterator], ValueType[OutputIterator]]
  ): OutputIterator = js.native
  def transform[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator2], InputIterator2] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<OutputIterator>, OutputIterator>> */ js.Any */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    result: OutputIterator,
    binary_op: js.Function2[
      /* x */ ValueType[InputIterator1], 
      /* y */ ValueType[InputIterator2], 
      ValueType[OutputIterator]
    ]
  ): OutputIterator = js.native
  def unique[InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<InputIterator>, InputIterator>> */ js.Any */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def unique[InputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IForwardIterator<IPointer.ValueType<InputIterator>, InputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function2[/* x */ ValueType[InputIterator], /* y */ ValueType[InputIterator], Boolean]
  ): InputIterator = js.native
  def unique_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<InputIterator>, OutputIterator>> */ js.Any */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def unique_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Writeonly<IForwardIterator<IPointer.ValueType<InputIterator>, OutputIterator>> */ js.Any */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function2[/* x */ ValueType[InputIterator], /* y */ ValueType[InputIterator], Boolean]
  ): OutputIterator = js.native
}


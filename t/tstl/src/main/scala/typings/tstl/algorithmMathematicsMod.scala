package typings.tstl

import typings.tstl.functionalIPointerMod.IPointer.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/mathematics", JSImport.Namespace)
@js.native
object algorithmMathematicsMod extends js.Object {
  def clamp[T](v: T, lo: T, hi: T): T = js.native
  def clamp[T](v: T, lo: T, hi: T, comp: js.Function2[/* x */ T, /* y */ T, Boolean]): T = js.native
  def is_permutation[ForwardIterator1 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1] */, ForwardIterator2 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2] */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): Boolean = js.native
  def is_permutation[ForwardIterator1 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1] */, ForwardIterator2 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    pred: js.Function2[/* x */ ValueType[ForwardIterator1], /* y */ ValueType[ForwardIterator1], Boolean]
  ): Boolean = js.native
  def max[T](items: js.Array[T]): T = js.native
  def max[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, Boolean]): T = js.native
  def max_element[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  def max_element[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): ForwardIterator = js.native
  def min[T](items: js.Array[T]): T = js.native
  def min[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, Boolean]): T = js.native
  def min_element[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  def min_element[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): ForwardIterator = js.native
  def minmax[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, Boolean]): Pair[T, T] = js.native
  def minmax_element[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator): Pair[ForwardIterator, ForwardIterator] = js.native
  def minmax_element[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): Pair[ForwardIterator, ForwardIterator] = js.native
  def next_permutation[BidirectionalIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IBidirectionalIterator<IPointer.ValueType<BidirectionalIterator>, BidirectionalIterator>> */ js.Any */](first: BidirectionalIterator, last: BidirectionalIterator): Boolean = js.native
  def next_permutation[BidirectionalIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IBidirectionalIterator<IPointer.ValueType<BidirectionalIterator>, BidirectionalIterator>> */ js.Any */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[
      /* x */ ValueType[BidirectionalIterator], 
      /* y */ ValueType[BidirectionalIterator], 
      Boolean
    ]
  ): Boolean = js.native
  def prev_permutation[BidirectionalIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IBidirectionalIterator<IPointer.ValueType<BidirectionalIterator>, BidirectionalIterator>> */ js.Any */](first: BidirectionalIterator, last: BidirectionalIterator): Boolean = js.native
  def prev_permutation[BidirectionalIterator /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify General<IBidirectionalIterator<IPointer.ValueType<BidirectionalIterator>, BidirectionalIterator>> */ js.Any */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[
      /* x */ ValueType[BidirectionalIterator], 
      /* y */ ValueType[BidirectionalIterator], 
      Boolean
    ]
  ): Boolean = js.native
}


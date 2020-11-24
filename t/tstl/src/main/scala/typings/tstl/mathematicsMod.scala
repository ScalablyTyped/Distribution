package typings.tstl

import typings.tstl.comparatorMod.Comparator
import typings.tstl.generalMod.General
import typings.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.pairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/algorithm/mathematics", JSImport.Namespace)
@js.native
object mathematicsMod extends js.Object {
  
  def clamp[T](v: T, lo: T, hi: T): T = js.native
  def clamp[T](v: T, lo: T, hi: T, comp: Comparator[T, T]): T = js.native
  
  @JSName("is_permutation")
  def isPermutation[ForwardIterator1 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1] */, ForwardIterator2 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2] */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): Boolean = js.native
  @JSName("is_permutation")
  def isPermutation[ForwardIterator1 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1] */, ForwardIterator2 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    pred: Comparator[ValueType[ForwardIterator1], ValueType[ForwardIterator1]]
  ): Boolean = js.native
  
  def max[T](items: js.Array[T]): T = js.native
  def max[T](items: js.Array[T], comp: Comparator[T, T]): T = js.native
  
  @JSName("max_element")
  def maxElement[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  @JSName("max_element")
  def maxElement[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: Comparator[ValueType[ForwardIterator], ValueType[ForwardIterator]]
  ): ForwardIterator = js.native
  
  def min[T](items: js.Array[T]): T = js.native
  def min[T](items: js.Array[T], comp: Comparator[T, T]): T = js.native
  
  @JSName("min_element")
  def minElement[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  @JSName("min_element")
  def minElement[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: Comparator[ValueType[ForwardIterator], ValueType[ForwardIterator]]
  ): ForwardIterator = js.native
  
  def minmax[T](items: js.Array[T], comp: Comparator[T, T]): Pair[T, T] = js.native
  
  @JSName("minmax_element")
  def minmaxElement[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator): Pair[ForwardIterator, ForwardIterator] = js.native
  @JSName("minmax_element")
  def minmaxElement[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: Comparator[ValueType[ForwardIterator], ValueType[ForwardIterator]]
  ): Pair[ForwardIterator, ForwardIterator] = js.native
  
  @JSName("next_permutation")
  def nextPermutation[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator): Boolean = js.native
  @JSName("next_permutation")
  def nextPermutation[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: Comparator[ValueType[BidirectionalIterator], ValueType[BidirectionalIterator]]
  ): Boolean = js.native
  
  @JSName("prev_permutation")
  def prevPermutation[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator): Boolean = js.native
  @JSName("prev_permutation")
  def prevPermutation[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: Comparator[ValueType[BidirectionalIterator], ValueType[BidirectionalIterator]]
  ): Boolean = js.native
}

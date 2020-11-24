package typings.tstl

import typings.tstl.binaryPredicatorMod.BinaryPredicator
import typings.tstl.comparatorMod.Comparator
import typings.tstl.generalMod.General
import typings.tstl.ibidirectionaliteratorMod.IBidirectionalIterator
import typings.tstl.iforwarditeratorMod.IForwardIterator
import typings.tstl.ipointerMod.IPointer.ValueType
import typings.tstl.irandomaccessiteratorMod.IRandomAccessIterator
import typings.tstl.modifiersMod.BinaryOperatorInferrer
import typings.tstl.modifiersMod.UnaryOperatorInferrer
import typings.tstl.pairMod.Pair
import typings.tstl.unaryPredicatorMod.UnaryPredicator
import typings.tstl.writeonlyMod.Writeonly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/algorithm", JSImport.Namespace)
@js.native
object algorithmMod extends js.Object {
  
  @JSName("adjacent_find")
  def adjacentFind[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  @JSName("adjacent_find")
  def adjacentFind[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: BinaryPredicator[ValueType[InputIterator], ValueType[InputIterator]]
  ): InputIterator = js.native
  
  @JSName("all_of")
  def allOf[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator, pred: UnaryPredicator[ValueType[InputIterator]]): Boolean = js.native
  
  @JSName("any_of")
  def anyOf[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator, pred: UnaryPredicator[ValueType[InputIterator]]): Boolean = js.native
  
  @JSName("binary_search")
  def binarySearch[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): Boolean = js.native
  @JSName("binary_search")
  def binarySearch[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: ValueType[ForwardIterator],
    comp: Comparator[ValueType[ForwardIterator], ValueType[ForwardIterator]]
  ): Boolean = js.native
  
  def clamp[T](v: T, lo: T, hi: T): T = js.native
  def clamp[T](v: T, lo: T, hi: T, comp: Comparator[T, T]): T = js.native
  
  def copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  
  @JSName("copy_backward")
  def copyBackward[InputIterator /* <: IBidirectionalIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IBidirectionalIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  
  @JSName("copy_if")
  def copyIf[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: UnaryPredicator[ValueType[InputIterator]]
  ): OutputIterator = js.native
  
  @JSName("copy_n")
  def copyN[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, n: Double, output: OutputIterator): OutputIterator = js.native
  
  def count[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator, `val`: ValueType[InputIterator]): Double = js.native
  
  @JSName("count_if")
  def countIf[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator, pred: UnaryPredicator[ValueType[InputIterator]]): Double = js.native
  
  def equal[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2): Boolean = js.native
  def equal[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator2], InputIterator2] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    pred: BinaryPredicator[ValueType[InputIterator1], ValueType[InputIterator2]]
  ): Boolean = js.native
  
  @JSName("equal_range")
  def equalRange[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): Pair[ForwardIterator, ForwardIterator] = js.native
  @JSName("equal_range")
  def equalRange[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: ValueType[ForwardIterator],
    comp: Comparator[ValueType[ForwardIterator], ValueType[ForwardIterator]]
  ): Pair[ForwardIterator, ForwardIterator] = js.native
  
  def fill[ForwardIterator /* <: Writeonly[IForwardIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): Unit = js.native
  
  @JSName("fill_n")
  def fillN[OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](first: OutputIterator, n: Double, `val`: ValueType[OutputIterator]): OutputIterator = js.native
  
  def find[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator, `val`: ValueType[InputIterator]): InputIterator = js.native
  
  @JSName("find_end")
  def findEnd[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Iterator1 = js.native
  @JSName("find_end")
  def findEnd[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator2], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    pred: BinaryPredicator[ValueType[Iterator1], ValueType[Iterator2]]
  ): Iterator1 = js.native
  
  @JSName("find_first_of")
  def findFirstOf[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Iterator1 = js.native
  @JSName("find_first_of")
  def findFirstOf[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator2], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    pred: BinaryPredicator[ValueType[Iterator1], ValueType[Iterator2]]
  ): Iterator1 = js.native
  
  @JSName("find_if")
  def findIf[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator, pred: UnaryPredicator[ValueType[InputIterator]]): InputIterator = js.native
  
  @JSName("find_if_not")
  def findIfNot[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator, pred: UnaryPredicator[ValueType[InputIterator]]): InputIterator = js.native
  
  @JSName("for_each")
  def forEach[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, Func /* <: js.Function1[/* val */ ValueType[InputIterator], _] */](first: InputIterator, last: InputIterator, fn: Func): Func = js.native
  
  @JSName("for_each_n")
  def forEachN[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, Func /* <: js.Function1[/* val */ ValueType[InputIterator], _] */](first: InputIterator, n: Double, fn: Func): InputIterator = js.native
  
  def generate[ForwardIterator /* <: Writeonly[IForwardIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, gen: js.Function0[ValueType[ForwardIterator]]): Unit = js.native
  
  @JSName("generate_n")
  def generateN[ForwardIterator /* <: Writeonly[IForwardIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, n: Double, gen: js.Function0[ValueType[ForwardIterator]]): ForwardIterator = js.native
  
  def includes[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2, last2: InputIterator2): Boolean = js.native
  def includes[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    comp: Comparator[ValueType[InputIterator1], ValueType[InputIterator1]]
  ): Boolean = js.native
  
  @JSName("inplace_merge")
  def inplaceMerge[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](first: BidirectionalIterator, middle: BidirectionalIterator, last: BidirectionalIterator): Unit = js.native
  @JSName("inplace_merge")
  def inplaceMerge[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    middle: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: Comparator[ValueType[BidirectionalIterator], ValueType[BidirectionalIterator]]
  ): Unit = js.native
  
  @JSName("is_heap")
  def isHeap[RandomAccessIterator /* <: IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator] */](first: RandomAccessIterator, last: RandomAccessIterator): Boolean = js.native
  @JSName("is_heap")
  def isHeap[RandomAccessIterator /* <: IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: Comparator[ValueType[RandomAccessIterator], ValueType[RandomAccessIterator]]
  ): Boolean = js.native
  
  @JSName("is_heap_until")
  def isHeapUntil[RandomAccessIterator /* <: IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator] */](first: RandomAccessIterator, last: RandomAccessIterator): RandomAccessIterator = js.native
  @JSName("is_heap_until")
  def isHeapUntil[RandomAccessIterator /* <: IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: Comparator[ValueType[RandomAccessIterator], ValueType[RandomAccessIterator]]
  ): RandomAccessIterator = js.native
  
  @JSName("is_partitioned")
  def isPartitioned[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, pred: UnaryPredicator[ValueType[ForwardIterator]]): Boolean = js.native
  
  @JSName("is_permutation")
  def isPermutation[ForwardIterator1 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1] */, ForwardIterator2 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2] */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): Boolean = js.native
  @JSName("is_permutation")
  def isPermutation[ForwardIterator1 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1] */, ForwardIterator2 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    pred: Comparator[ValueType[ForwardIterator1], ValueType[ForwardIterator1]]
  ): Boolean = js.native
  
  @JSName("is_sorted")
  def isSorted[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): Boolean = js.native
  @JSName("is_sorted")
  def isSorted[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    comp: Comparator[ValueType[InputIterator], ValueType[InputIterator]]
  ): Boolean = js.native
  
  @JSName("is_sorted_until")
  def isSortedUntil[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  @JSName("is_sorted_until")
  def isSortedUntil[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    comp: Comparator[ValueType[InputIterator], ValueType[InputIterator]]
  ): InputIterator = js.native
  
  @JSName("iter_swap")
  def iterSwap[ForwardIterator1 /* <: General[IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1]] */, ForwardIterator2 /* <: General[IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2]] */](x: ForwardIterator1, y: ForwardIterator2): Unit = js.native
  
  @JSName("lexicographical_compare")
  def lexicographicalCompare[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Boolean = js.native
  @JSName("lexicographical_compare")
  def lexicographicalCompare[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    comp: BinaryPredicator[ValueType[Iterator1], ValueType[Iterator1]]
  ): Boolean = js.native
  
  @JSName("lower_bound")
  def lowerBound[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): ForwardIterator = js.native
  @JSName("lower_bound")
  def lowerBound[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: ValueType[ForwardIterator],
    comp: Comparator[ValueType[ForwardIterator], ValueType[ForwardIterator]]
  ): ForwardIterator = js.native
  
  @JSName("make_heap")
  def makeHeap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  @JSName("make_heap")
  def makeHeap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: Comparator[ValueType[RandomAccessIterator], ValueType[RandomAccessIterator]]
  ): Unit = js.native
  
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
  
  def merge[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def merge[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: Comparator[ValueType[InputIterator1], ValueType[InputIterator1]]
  ): OutputIterator = js.native
  
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
  
  def mismatch[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2): Pair[Iterator1, Iterator2] = js.native
  def mismatch[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator2], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    pred: BinaryPredicator[ValueType[Iterator1], ValueType[Iterator2]]
  ): Pair[Iterator1, Iterator2] = js.native
  
  @JSName("next_permutation")
  def nextPermutation[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator): Boolean = js.native
  @JSName("next_permutation")
  def nextPermutation[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: Comparator[ValueType[BidirectionalIterator], ValueType[BidirectionalIterator]]
  ): Boolean = js.native
  
  @JSName("none_of")
  def noneOf[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator, pred: UnaryPredicator[ValueType[InputIterator]]): Boolean = js.native
  
  @JSName("nth_element")
  def nthElement[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, nth: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  @JSName("nth_element")
  def nthElement[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    nth: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: Comparator[ValueType[RandomAccessIterator], ValueType[RandomAccessIterator]]
  ): Unit = js.native
  
  @JSName("partial_sort")
  def partialSort[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, middle: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  @JSName("partial_sort")
  def partialSort[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    middle: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: Comparator[ValueType[RandomAccessIterator], ValueType[RandomAccessIterator]]
  ): Unit = js.native
  
  @JSName("partial_sort_copy")
  def partialSortCopy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: General[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output_first: OutputIterator,
    output_last: OutputIterator
  ): OutputIterator = js.native
  @JSName("partial_sort_copy")
  def partialSortCopy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: General[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output_first: OutputIterator,
    output_last: OutputIterator,
    comp: Comparator[ValueType[InputIterator], ValueType[InputIterator]]
  ): OutputIterator = js.native
  
  def partition[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: UnaryPredicator[ValueType[BidirectionalIterator]]
  ): BidirectionalIterator = js.native
  
  @JSName("partition_copy")
  def partitionCopy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator1 /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator1]] */, OutputIterator2 /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator2]] */](
    first: InputIterator,
    last: InputIterator,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: UnaryPredicator[ValueType[InputIterator]]
  ): Pair[OutputIterator1, OutputIterator2] = js.native
  
  @JSName("partition_point")
  def partitionPoint[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, pred: UnaryPredicator[ValueType[ForwardIterator]]): ForwardIterator = js.native
  
  @JSName("pop_heap")
  def popHeap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  @JSName("pop_heap")
  def popHeap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: Comparator[ValueType[RandomAccessIterator], ValueType[RandomAccessIterator]]
  ): Unit = js.native
  
  @JSName("prev_permutation")
  def prevPermutation[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator): Boolean = js.native
  @JSName("prev_permutation")
  def prevPermutation[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: Comparator[ValueType[BidirectionalIterator], ValueType[BidirectionalIterator]]
  ): Boolean = js.native
  
  @JSName("push_heap")
  def pushHeap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  @JSName("push_heap")
  def pushHeap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: Comparator[ValueType[RandomAccessIterator], ValueType[RandomAccessIterator]]
  ): Unit = js.native
  
  def randint(x: Double, y: Double): Double = js.native
  
  def remove[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](first: InputIterator, last: InputIterator, `val`: ValueType[InputIterator]): InputIterator = js.native
  
  @JSName("remove_copy")
  def removeCopy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, `val`: ValueType[InputIterator]): OutputIterator = js.native
  
  @JSName("remove_copy_if")
  def removeCopyIf[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: UnaryPredicator[ValueType[InputIterator]]
  ): OutputIterator = js.native
  
  @JSName("remove_if")
  def removeIf[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](first: InputIterator, last: InputIterator, pred: UnaryPredicator[ValueType[InputIterator]]): InputIterator = js.native
  
  def replace[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    old_val: ValueType[InputIterator],
    new_val: ValueType[InputIterator]
  ): Unit = js.native
  
  @JSName("replace_copy")
  def replaceCopy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    old_val: ValueType[InputIterator],
    new_val: ValueType[InputIterator]
  ): OutputIterator = js.native
  
  @JSName("replace_copy_if")
  def replaceCopyIf[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    result: OutputIterator,
    pred: UnaryPredicator[ValueType[InputIterator]],
    new_val: ValueType[InputIterator]
  ): OutputIterator = js.native
  
  @JSName("replace_if")
  def replaceIf[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    pred: UnaryPredicator[ValueType[InputIterator]],
    new_val: ValueType[InputIterator]
  ): Unit = js.native
  
  def reverse[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator): Unit = js.native
  
  @JSName("reverse_copy")
  def reverseCopy[BidirectionalIterator /* <: IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[BidirectionalIterator], OutputIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator, output: OutputIterator): OutputIterator = js.native
  
  def rotate[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](first: InputIterator, middle: InputIterator, last: InputIterator): InputIterator = js.native
  
  @JSName("rotate_copy")
  def rotateCopy[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[ForwardIterator], OutputIterator]] */](first: ForwardIterator, middle: ForwardIterator, last: ForwardIterator, output: OutputIterator): OutputIterator = js.native
  
  def sample[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, n: Double): OutputIterator = js.native
  
  def search[ForwardIterator1 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1] */, ForwardIterator2 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    last2: ForwardIterator2
  ): ForwardIterator1 = js.native
  def search[ForwardIterator1 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1] */, ForwardIterator2 /* <: IForwardIterator[ValueType[ForwardIterator2], ForwardIterator2] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    last2: ForwardIterator2,
    pred: BinaryPredicator[ValueType[ForwardIterator1], ValueType[ForwardIterator2]]
  ): ForwardIterator1 = js.native
  
  @JSName("search_n")
  def searchN[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, count: Double, `val`: ValueType[ForwardIterator]): ForwardIterator = js.native
  @JSName("search_n")
  def searchN[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    count: Double,
    `val`: ValueType[ForwardIterator],
    pred: BinaryPredicator[ValueType[ForwardIterator], ValueType[ForwardIterator]]
  ): ForwardIterator = js.native
  
  @JSName("set_difference")
  def setDifference[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  @JSName("set_difference")
  def setDifference[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: Comparator[ValueType[InputIterator1], ValueType[InputIterator1]]
  ): OutputIterator = js.native
  
  @JSName("set_intersection")
  def setIntersection[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  @JSName("set_intersection")
  def setIntersection[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: Comparator[ValueType[InputIterator1], ValueType[InputIterator1]]
  ): OutputIterator = js.native
  
  @JSName("set_symmetric_difference")
  def setSymmetricDifference[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  @JSName("set_symmetric_difference")
  def setSymmetricDifference[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: Comparator[ValueType[InputIterator1], ValueType[InputIterator1]]
  ): OutputIterator = js.native
  
  @JSName("set_union")
  def setUnion[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  @JSName("set_union")
  def setUnion[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: Comparator[ValueType[InputIterator1], ValueType[InputIterator1]]
  ): OutputIterator = js.native
  
  @JSName("shift_left")
  def shiftLeft[ForwardIterator /* <: General[IForwardIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, n: Double): ForwardIterator = js.native
  
  @JSName("shift_right")
  def shiftRight[ForwardIterator /* <: General[IBidirectionalIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, n: Double): ForwardIterator = js.native
  
  def shuffle[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  
  def sort[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def sort[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: Comparator[ValueType[RandomAccessIterator], ValueType[RandomAccessIterator]]
  ): Unit = js.native
  
  @JSName("sort_heap")
  def sortHeap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  @JSName("sort_heap")
  def sortHeap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: Comparator[ValueType[RandomAccessIterator], ValueType[RandomAccessIterator]]
  ): Unit = js.native
  
  @JSName("stable_partition")
  def stablePartition[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: UnaryPredicator[ValueType[BidirectionalIterator]]
  ): BidirectionalIterator = js.native
  
  @JSName("stable_sort")
  def stableSort[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  @JSName("stable_sort")
  def stableSort[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: Comparator[ValueType[RandomAccessIterator], ValueType[RandomAccessIterator]]
  ): Unit = js.native
  
  @JSName("swap_ranges")
  def swapRanges[ForwardIterator1 /* <: General[IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1]] */, ForwardIterator2 /* <: General[IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2]] */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): ForwardIterator2 = js.native
  
  def transform[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    result: OutputIterator,
    op: UnaryOperatorInferrer[InputIterator, OutputIterator]
  ): OutputIterator = js.native
  def transform[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator2], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    result: OutputIterator,
    op: BinaryOperatorInferrer[InputIterator1, InputIterator2, OutputIterator]
  ): OutputIterator = js.native
  
  def unique[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def unique[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    pred: BinaryPredicator[ValueType[InputIterator], ValueType[InputIterator]]
  ): InputIterator = js.native
  
  @JSName("unique_copy")
  def uniqueCopy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  @JSName("unique_copy")
  def uniqueCopy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: BinaryPredicator[ValueType[InputIterator], ValueType[InputIterator]]
  ): OutputIterator = js.native
  
  @JSName("upper_bound")
  def upperBound[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): ForwardIterator = js.native
  @JSName("upper_bound")
  def upperBound[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: ValueType[ForwardIterator],
    comp: Comparator[ValueType[ForwardIterator], ValueType[ForwardIterator]]
  ): ForwardIterator = js.native
}

package typings.tstl

import typings.tstl.functionalIPointerMod.IPointerNs.ValueType
import typings.tstl.iteratorIBidirectionalIteratorMod.IBidirectionalIterator
import typings.tstl.iteratorIFakeMod.General
import typings.tstl.iteratorIFakeMod.Writeonly
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.iteratorIRandomAccessIteratorMod.IRandomAccessIterator
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm", JSImport.Namespace)
@js.native
object algorithmMod extends js.Object {
  def adjacent_find[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def adjacent_find[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function2[/* x */ ValueType[InputIterator], /* y */ ValueType[InputIterator], Boolean]
  ): InputIterator = js.native
  def all_of[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean]
  ): Boolean = js.native
  def any_of[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean]
  ): Boolean = js.native
  def binary_search[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): Boolean = js.native
  def binary_search[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: ValueType[ForwardIterator],
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): Boolean = js.native
  def clamp[T](v: T, lo: T, hi: T): T = js.native
  def clamp[T](v: T, lo: T, hi: T, comp: js.Function2[/* x */ T, /* y */ T, Boolean]): T = js.native
  def copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def copy_backward[InputIterator /* <: IBidirectionalIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IBidirectionalIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def copy_if[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function1[/* x */ ValueType[InputIterator], Boolean]
  ): OutputIterator = js.native
  def copy_n[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, n: Double, output: OutputIterator): OutputIterator = js.native
  def count[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator, `val`: ValueType[InputIterator]): Double = js.native
  def count_if[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean]
  ): Double = js.native
  def equal[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2): Boolean = js.native
  def equal[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator2], InputIterator2] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    pred: js.Function2[/* x */ ValueType[InputIterator1], /* y */ ValueType[InputIterator2], Boolean]
  ): Boolean = js.native
  def equal_range[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): Pair[ForwardIterator, ForwardIterator] = js.native
  def equal_range[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: ValueType[ForwardIterator],
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): Pair[ForwardIterator, ForwardIterator] = js.native
  def fill[ForwardIterator /* <: Writeonly[IForwardIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): Unit = js.native
  def fill_n[OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](first: OutputIterator, n: Double, `val`: ValueType[OutputIterator]): OutputIterator = js.native
  def find[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator, `val`: ValueType[InputIterator]): InputIterator = js.native
  def find_end[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Iterator1 = js.native
  def find_end[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator2], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    pred: js.Function2[/* x */ ValueType[Iterator1], /* y */ ValueType[Iterator2], Boolean]
  ): Iterator1 = js.native
  def find_first_of[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Iterator1 = js.native
  def find_first_of[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator2], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    pred: js.Function2[/* x */ ValueType[Iterator1], /* y */ ValueType[Iterator2], Boolean]
  ): Iterator1 = js.native
  def find_if[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean]
  ): InputIterator = js.native
  def find_if_not[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean]
  ): InputIterator = js.native
  def for_each[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, Func /* <: js.Function1[/* val */ ValueType[InputIterator], _] */](first: InputIterator, last: InputIterator, fn: Func): Func = js.native
  def for_each_n[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, Func /* <: js.Function1[/* val */ ValueType[InputIterator], _] */](first: InputIterator, n: Double, fn: Func): InputIterator = js.native
  def generate[ForwardIterator /* <: Writeonly[IForwardIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, gen: js.Function0[ValueType[ForwardIterator]]): Unit = js.native
  def generate_n[ForwardIterator /* <: Writeonly[IForwardIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, n: Double, gen: js.Function0[ValueType[ForwardIterator]]): ForwardIterator = js.native
  def includes[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2, last2: InputIterator2): Boolean = js.native
  def includes[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    comp: js.Function2[/* x */ ValueType[InputIterator1], /* y */ ValueType[InputIterator1], Boolean]
  ): Boolean = js.native
  def inplace_merge[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](first: BidirectionalIterator, middle: BidirectionalIterator, last: BidirectionalIterator): Unit = js.native
  def inplace_merge[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    middle: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[
      /* x */ ValueType[BidirectionalIterator], 
      /* y */ ValueType[BidirectionalIterator], 
      Boolean
    ]
  ): Unit = js.native
  def is_heap[RandomAccessIterator /* <: IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator] */](first: RandomAccessIterator, last: RandomAccessIterator): Boolean = js.native
  def is_heap[RandomAccessIterator /* <: IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Boolean = js.native
  def is_heap_until[RandomAccessIterator /* <: IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator] */](first: RandomAccessIterator, last: RandomAccessIterator): RandomAccessIterator = js.native
  def is_heap_until[RandomAccessIterator /* <: IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): RandomAccessIterator = js.native
  def is_partitioned[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    pred: js.Function1[/* x */ ValueType[ForwardIterator], Boolean]
  ): Boolean = js.native
  def is_permutation[ForwardIterator1 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1] */, ForwardIterator2 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2] */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): Boolean = js.native
  def is_permutation[ForwardIterator1 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1] */, ForwardIterator2 /* <: IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    pred: js.Function2[/* x */ ValueType[ForwardIterator1], /* y */ ValueType[ForwardIterator1], Boolean]
  ): Boolean = js.native
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
  def iter_swap[ForwardIterator1 /* <: General[IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1]] */, ForwardIterator2 /* <: General[IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2]] */](x: ForwardIterator1, y: ForwardIterator2): Unit = js.native
  def lexicographical_compare[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Boolean = js.native
  def lexicographical_compare[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    comp: js.Function2[/* x */ ValueType[Iterator1], /* y */ ValueType[Iterator1], Boolean]
  ): Boolean = js.native
  def lower_bound[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): ForwardIterator = js.native
  def lower_bound[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: ValueType[ForwardIterator],
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): ForwardIterator = js.native
  def make_heap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def make_heap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def max[T](items: js.Array[T]): T = js.native
  def max[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, Boolean]): T = js.native
  def max_element[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  def max_element[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
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
    comp: js.Function2[/* x */ ValueType[InputIterator1], /* y */ ValueType[InputIterator1], Boolean]
  ): OutputIterator = js.native
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
  def mismatch[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2): Pair[Iterator1, Iterator2] = js.native
  def mismatch[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator2], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    pred: js.Function2[/* x */ ValueType[Iterator1], /* y */ ValueType[Iterator2], Boolean]
  ): Pair[Iterator1, Iterator2] = js.native
  def next_permutation[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator): Boolean = js.native
  def next_permutation[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[
      /* x */ ValueType[BidirectionalIterator], 
      /* y */ ValueType[BidirectionalIterator], 
      Boolean
    ]
  ): Boolean = js.native
  def none_of[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean]
  ): Boolean = js.native
  def nth_element[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, nth: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def nth_element[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    nth: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def partial_sort[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, middle: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def partial_sort[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    middle: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def partial_sort_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, RandomAccessIterator /* <: General[IForwardIterator[ValueType[InputIterator], RandomAccessIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output_first: RandomAccessIterator,
    output_last: RandomAccessIterator
  ): RandomAccessIterator = js.native
  def partial_sort_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, RandomAccessIterator /* <: General[IForwardIterator[ValueType[InputIterator], RandomAccessIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output_first: RandomAccessIterator,
    output_last: RandomAccessIterator,
    comp: js.Function2[/* x */ ValueType[InputIterator], /* y */ ValueType[InputIterator], Boolean]
  ): RandomAccessIterator = js.native
  def partition[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[/* x */ ValueType[BidirectionalIterator], Boolean]
  ): BidirectionalIterator = js.native
  def partition_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator1 /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator1]] */, OutputIterator2 /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator2]] */](
    first: InputIterator,
    last: InputIterator,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: js.Function1[/* val */ ValueType[InputIterator], ValueType[InputIterator]]
  ): Pair[OutputIterator1, OutputIterator2] = js.native
  def partition_point[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    pred: js.Function1[/* x */ ValueType[ForwardIterator], Boolean]
  ): ForwardIterator = js.native
  def pop_heap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def pop_heap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def prev_permutation[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator): Boolean = js.native
  def prev_permutation[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[
      /* x */ ValueType[BidirectionalIterator], 
      /* y */ ValueType[BidirectionalIterator], 
      Boolean
    ]
  ): Boolean = js.native
  def push_heap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def push_heap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def randint(x: Double, y: Double): Double = js.native
  def remove[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](first: InputIterator, last: InputIterator, `val`: ValueType[InputIterator]): InputIterator = js.native
  def remove_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, `val`: ValueType[InputIterator]): OutputIterator = js.native
  def remove_copy_if[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function1[/* x */ ValueType[InputIterator], Boolean]
  ): OutputIterator = js.native
  def remove_if[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean]
  ): InputIterator = js.native
  def replace[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    old_val: ValueType[InputIterator],
    new_val: ValueType[InputIterator]
  ): Unit = js.native
  def replace_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    old_val: ValueType[InputIterator],
    new_val: ValueType[InputIterator]
  ): OutputIterator = js.native
  def replace_copy_if[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    result: OutputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean],
    new_val: ValueType[InputIterator]
  ): OutputIterator = js.native
  def replace_if[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean],
    new_val: ValueType[InputIterator]
  ): Unit = js.native
  def reverse[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator): Unit = js.native
  def reverse_copy[BidirectionalIterator /* <: IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[BidirectionalIterator], OutputIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator, output: OutputIterator): OutputIterator = js.native
  def rotate[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](first: InputIterator, middle: InputIterator, last: InputIterator): InputIterator = js.native
  def rotate_copy[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[ForwardIterator], OutputIterator]] */](first: ForwardIterator, middle: ForwardIterator, last: ForwardIterator, output: OutputIterator): OutputIterator = js.native
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
    pred: js.Function2[/* x */ ValueType[ForwardIterator1], /* y */ ValueType[ForwardIterator2], Boolean]
  ): ForwardIterator1 = js.native
  def search_n[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, count: Double, `val`: ValueType[ForwardIterator]): ForwardIterator = js.native
  def search_n[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    count: Double,
    `val`: ValueType[ForwardIterator],
    pred: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): ForwardIterator = js.native
  def set_difference[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_difference[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ ValueType[InputIterator1], /* y */ ValueType[InputIterator1], Boolean]
  ): OutputIterator = js.native
  def set_intersection[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_intersection[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ ValueType[InputIterator1], /* y */ ValueType[InputIterator1], Boolean]
  ): OutputIterator = js.native
  def set_symmetric_difference[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_symmetric_difference[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ ValueType[InputIterator1], /* y */ ValueType[InputIterator1], Boolean]
  ): OutputIterator = js.native
  def set_union[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_union[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator1], OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ ValueType[InputIterator1], /* y */ ValueType[InputIterator1], Boolean]
  ): OutputIterator = js.native
  def shift_left[ForwardIterator /* <: General[IForwardIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, n: Double): ForwardIterator = js.native
  def shift_right[ForwardIterator /* <: General[IBidirectionalIterator[ValueType[ForwardIterator], ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, n: Double): ForwardIterator = js.native
  def shuffle[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def sort[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def sort[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def sort_heap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def sort_heap[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def stable_partition[BidirectionalIterator /* <: General[IBidirectionalIterator[ValueType[BidirectionalIterator], BidirectionalIterator]] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[/* x */ ValueType[BidirectionalIterator], Boolean]
  ): BidirectionalIterator = js.native
  def stable_sort[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](first: RandomAccessIterator, last: RandomAccessIterator): Unit = js.native
  def stable_sort[RandomAccessIterator /* <: General[IRandomAccessIterator[ValueType[RandomAccessIterator], RandomAccessIterator]] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ ValueType[RandomAccessIterator], 
      /* y */ ValueType[RandomAccessIterator], 
      Boolean
    ]
  ): Unit = js.native
  def swap_ranges[ForwardIterator1 /* <: General[IForwardIterator[ValueType[ForwardIterator1], ForwardIterator1]] */, ForwardIterator2 /* <: General[IForwardIterator[ValueType[ForwardIterator1], ForwardIterator2]] */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): ForwardIterator2 = js.native
  def transform[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    result: OutputIterator,
    op: js.Function1[/* val */ ValueType[InputIterator], ValueType[OutputIterator]]
  ): OutputIterator = js.native
  def transform[InputIterator1 /* <: IForwardIterator[ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: IForwardIterator[ValueType[InputIterator2], InputIterator2] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[OutputIterator], OutputIterator]] */](
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
  def unique[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def unique[InputIterator /* <: General[IForwardIterator[ValueType[InputIterator], InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function2[/* x */ ValueType[InputIterator], /* y */ ValueType[InputIterator], Boolean]
  ): InputIterator = js.native
  def unique_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def unique_copy[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */, OutputIterator /* <: Writeonly[IForwardIterator[ValueType[InputIterator], OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function2[/* x */ ValueType[InputIterator], /* y */ ValueType[InputIterator], Boolean]
  ): OutputIterator = js.native
  def upper_bound[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](first: ForwardIterator, last: ForwardIterator, `val`: ValueType[ForwardIterator]): ForwardIterator = js.native
  def upper_bound[ForwardIterator /* <: IForwardIterator[ValueType[ForwardIterator], ForwardIterator] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: ValueType[ForwardIterator],
    comp: js.Function2[/* x */ ValueType[ForwardIterator], /* y */ ValueType[ForwardIterator], Boolean]
  ): ForwardIterator = js.native
}


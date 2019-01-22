package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm", JSImport.Namespace)
@js.native
object algorithmMod extends js.Object {
  def adjacent_find[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def adjacent_find[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): InputIterator = js.native
  def all_of[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function1[/* val */ T, scala.Boolean]): scala.Boolean = js.native
  def any_of[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function1[/* val */ T, scala.Boolean]): scala.Boolean = js.native
  def binary_search[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: T): scala.Boolean = js.native
  def binary_search[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: T,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def clamp[T](v: T, lo: T, hi: T): T = js.native
  def clamp[T](v: T, lo: T, hi: T, comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): T = js.native
  def copy[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def copy_backward[T, BidirectionalIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator1]
  ] */, BidirectionalIterator2 /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator2]
  ] */](first: BidirectionalIterator1, last: BidirectionalIterator1, output: BidirectionalIterator2): BidirectionalIterator2 = js.native
  def copy_if[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function1[/* x */ T, scala.Boolean]
  ): OutputIterator = js.native
  def copy_n[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, n: scala.Double, output: OutputIterator): OutputIterator = js.native
  def count[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, `val`: T): scala.Double = js.native
  def count_if[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function1[/* val */ T, scala.Boolean]): scala.Double = js.native
  def equal[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2): scala.Boolean = js.native
  def equal[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def equal_range[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: T): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def equal_range[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: T,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def fill[T, ForwardIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: T): scala.Unit = js.native
  def fill_n[T, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: OutputIterator, n: scala.Double, `val`: T): OutputIterator = js.native
  def find[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, `val`: T): InputIterator = js.native
  def find_end[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Iterator1 = js.native
  def find_end[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): Iterator1 = js.native
  def find_first_of[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Iterator1 = js.native
  def find_first_of[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): Iterator1 = js.native
  def find_if[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function1[/* val */ T, scala.Boolean]): InputIterator = js.native
  def find_if_not[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function1[/* val */ T, scala.Boolean]): InputIterator = js.native
  def for_each[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, Func /* <: js.Function1[/* val */ T, scala.Unit] */](first: InputIterator, last: InputIterator, fn: Func): Func = js.native
  def for_each_n[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, Func /* <: js.Function1[/* val */ T, scala.Unit] */](first: InputIterator, n: scala.Double, fn: Func): InputIterator = js.native
  def generate[T, ForwardIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, gen: js.Function0[T]): scala.Unit = js.native
  def generate_n[T, ForwardIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, n: scala.Double, gen: js.Function0[T]): ForwardIterator = js.native
  def includes[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2, last2: InputIterator2): scala.Boolean = js.native
  def includes[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def inplace_merge[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](first: BidirectionalIterator, middle: BidirectionalIterator, last: BidirectionalIterator): scala.Unit = js.native
  def inplace_merge[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](
    first: BidirectionalIterator,
    middle: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Unit = js.native
  def is_heap[T, RandomAccessIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Boolean = js.native
  def is_heap[T, RandomAccessIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def is_heap_until[T, RandomAccessIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): RandomAccessIterator = js.native
  def is_heap_until[T, RandomAccessIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): RandomAccessIterator = js.native
  def is_partitioned[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, pred: js.Function1[/* x */ T, scala.Boolean]): scala.Boolean = js.native
  def is_permutation[T, ForwardIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator1]] */, ForwardIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator2]] */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): scala.Boolean = js.native
  def is_permutation[T, ForwardIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator1]] */, ForwardIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator2]] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def is_sorted[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator): scala.Boolean = js.native
  def is_sorted[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): scala.Boolean = js.native
  def is_sorted_until[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def is_sorted_until[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): InputIterator = js.native
  def iter_swap[T, ForwardIterator1 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator1]] */, ForwardIterator2 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator2]] */](x: ForwardIterator1, y: ForwardIterator2): scala.Unit = js.native
  def lexicographical_compare[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): scala.Boolean = js.native
  def lexicographical_compare[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def lower_bound[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: T): ForwardIterator = js.native
  def lower_bound[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: T,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): ForwardIterator = js.native
  def make_heap[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def make_heap[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Unit = js.native
  def max[T](items: js.Array[T]): T = js.native
  def max[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): T = js.native
  def max_element[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  def max_element[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): ForwardIterator = js.native
  def merge[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def merge[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): OutputIterator = js.native
  def min[T](items: js.Array[T]): T = js.native
  def min[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): T = js.native
  def min_element[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  def min_element[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): ForwardIterator = js.native
  def minmax[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): tstlLib.utilityPairMod.Pair[T, T] = js.native
  def minmax_element[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def minmax_element[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def mismatch[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](first1: Iterator1, last1: Iterator1, first2: Iterator2): tstlLib.utilityPairMod.Pair[Iterator1, Iterator2] = js.native
  def mismatch[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): tstlLib.utilityPairMod.Pair[Iterator1, Iterator2] = js.native
  def next_permutation[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](first: BidirectionalIterator, last: BidirectionalIterator): scala.Boolean = js.native
  def next_permutation[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    compare: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def none_of[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function1[/* val */ T, scala.Boolean]): scala.Boolean = js.native
  def nth_element[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, nth: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def nth_element[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    nth: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* left */ T, /* right */ T, scala.Boolean]
  ): scala.Unit = js.native
  def partial_sort[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, middle: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def partial_sort[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    middle: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Unit = js.native
  def partial_sort_copy[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, RandomAccessIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output_first: RandomAccessIterator,
    output_last: RandomAccessIterator
  ): RandomAccessIterator = js.native
  def partial_sort_copy[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, RandomAccessIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output_first: RandomAccessIterator,
    output_last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): RandomAccessIterator = js.native
  def partition[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[/* x */ T, scala.Boolean]
  ): BidirectionalIterator = js.native
  def partition_copy[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator1 /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator1]] */, OutputIterator2 /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator2]] */](
    first: InputIterator,
    last: InputIterator,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: js.Function1[/* val */ T, T]
  ): tstlLib.utilityPairMod.Pair[OutputIterator1, OutputIterator2] = js.native
  def partition_point[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, pred: js.Function1[/* x */ T, scala.Boolean]): ForwardIterator = js.native
  def pop_heap[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def pop_heap[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Unit = js.native
  def prev_permutation[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](first: BidirectionalIterator, last: BidirectionalIterator): scala.Boolean = js.native
  def prev_permutation[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def push_heap[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def push_heap[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Unit = js.native
  def randint(x: scala.Double, y: scala.Double): scala.Double = js.native
  def remove[T, InputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, `val`: T): InputIterator = js.native
  def remove_copy[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, `val`: T): OutputIterator = js.native
  def remove_copy_if[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function1[/* x */ T, scala.Boolean]
  ): OutputIterator = js.native
  def remove_if[T, InputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function1[/* val */ T, scala.Boolean]): InputIterator = js.native
  def replace[T, InputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, old_val: T, new_val: T): scala.Unit = js.native
  def replace_copy[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, old_val: T, new_val: T): OutputIterator = js.native
  def replace_copy_if[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    result: OutputIterator,
    pred: js.Function1[/* val */ T, scala.Boolean],
    new_val: T
  ): OutputIterator = js.native
  def replace_if[T, InputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ T, scala.Boolean],
    new_val: T
  ): scala.Unit = js.native
  def reverse[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](first: BidirectionalIterator, last: BidirectionalIterator): scala.Unit = js.native
  def reverse_copy[T, BidirectionalIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: BidirectionalIterator, last: BidirectionalIterator, output: OutputIterator): OutputIterator = js.native
  def rotate[T, InputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, middle: InputIterator, last: InputIterator): InputIterator = js.native
  def rotate_copy[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: ForwardIterator, middle: ForwardIterator, last: ForwardIterator, output: OutputIterator): OutputIterator = js.native
  def sample[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator, n: scala.Double): OutputIterator = js.native
  def search[T, ForwardIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator1]] */, ForwardIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator2]] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    last2: ForwardIterator2
  ): ForwardIterator1 = js.native
  def search[T, ForwardIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator1]] */, ForwardIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator2]] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    last2: ForwardIterator2,
    pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): ForwardIterator1 = js.native
  def search_n[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, count: scala.Double, `val`: T): ForwardIterator = js.native
  def search_n[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    count: scala.Double,
    `val`: T,
    pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): ForwardIterator = js.native
  def set_difference[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_difference[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): OutputIterator = js.native
  def set_intersection[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_intersection[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): OutputIterator = js.native
  def set_symmetric_difference[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_symmetric_difference[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): OutputIterator = js.native
  def set_union[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_union[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): OutputIterator = js.native
  def shift_left[T, ForwardIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, n: scala.Double): ForwardIterator = js.native
  def shift_right[T, ForwardIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, ForwardIterator]
  ] */](first: ForwardIterator, last: ForwardIterator, n: scala.Double): ForwardIterator = js.native
  def shuffle[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def sort[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def sort[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Unit = js.native
  def sort_heap[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def sort_heap[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Unit = js.native
  def stable_partition[T, BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, BidirectionalIterator]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[/* x */ T, scala.Boolean]
  ): BidirectionalIterator = js.native
  def stable_sort[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def stable_sort[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Unit = js.native
  def swap_ranges[T, ForwardIterator1 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator1]] */, ForwardIterator2 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator2]] */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): ForwardIterator2 = js.native
  def transform[T, Ret, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Ret, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    result: OutputIterator,
    op: js.Function1[/* val */ T, Ret]
  ): OutputIterator = js.native
  def transform[T, Ret, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[Ret, OutputIterator]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    result: OutputIterator,
    binary_op: js.Function2[/* x */ T, /* y */ T, Ret]
  ): OutputIterator = js.native
  def unique[T, InputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def unique[T, InputIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): InputIterator = js.native
  def unique_copy[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def unique_copy[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): OutputIterator = js.native
  def upper_bound[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: T): ForwardIterator = js.native
  def upper_bound[T, ForwardIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: T,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): ForwardIterator = js.native
}


package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm", JSImport.Namespace)
@js.native
object algorithmMod extends js.Object {
  def adjacent_find[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def adjacent_find[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): InputIterator = js.native
  def all_of[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def any_of[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def binary_search[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]
  ): scala.Boolean = js.native
  def binary_search[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator],
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def clamp[T](v: T, lo: T, hi: T): T = js.native
  def clamp[T](v: T, lo: T, hi: T, comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): T = js.native
  def copy[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def copy_backward[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def copy_if[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function1[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): OutputIterator = js.native
  def copy_n[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](first: InputIterator, n: scala.Double, output: OutputIterator): OutputIterator = js.native
  def count[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
  ): scala.Double = js.native
  def count_if[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): scala.Double = js.native
  def equal[InputIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1]
  ] */, InputIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2]
  ] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2): scala.Boolean = js.native
  def equal[InputIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1]
  ] */, InputIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator2], InputIterator2]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator2], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def equal_range[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]
  ): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def equal_range[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator],
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def fill[ForwardIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]
  ): scala.Unit = js.native
  def fill_n[OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[OutputIterator], OutputIterator]
  ] */](
    first: OutputIterator,
    n: scala.Double,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[OutputIterator]
  ): OutputIterator = js.native
  def find[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
  ): InputIterator = js.native
  def find_end[Iterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1]
  ] */, Iterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator2]
  ] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Iterator1 = js.native
  def find_end[Iterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1]
  ] */, Iterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator2], Iterator2]
  ] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator2], 
      scala.Boolean
    ]
  ): Iterator1 = js.native
  def find_first_of[Iterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1]
  ] */, Iterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator2]
  ] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Iterator1 = js.native
  def find_first_of[Iterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1]
  ] */, Iterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator2], Iterator2]
  ] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator2], 
      scala.Boolean
    ]
  ): Iterator1 = js.native
  def find_if[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): InputIterator = js.native
  def find_if_not[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): InputIterator = js.native
  def for_each[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, Func /* <: js.Function1[/* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], _] */](first: InputIterator, last: InputIterator, fn: Func): Func = js.native
  def for_each_n[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, Func /* <: js.Function1[/* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], _] */](first: InputIterator, n: scala.Double, fn: Func): InputIterator = js.native
  def generate[ForwardIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    gen: js.Function0[tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]]
  ): scala.Unit = js.native
  def generate_n[ForwardIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    n: scala.Double,
    gen: js.Function0[tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]]
  ): ForwardIterator = js.native
  def includes[InputIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1]
  ] */, InputIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2]
  ] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2, last2: InputIterator2): scala.Boolean = js.native
  def includes[InputIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1]
  ] */, InputIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def inplace_merge[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](first: BidirectionalIterator, middle: BidirectionalIterator, last: BidirectionalIterator): scala.Unit = js.native
  def inplace_merge[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](
    first: BidirectionalIterator,
    middle: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def is_heap[RandomAccessIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Boolean = js.native
  def is_heap[RandomAccessIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def is_heap_until[RandomAccessIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): RandomAccessIterator = js.native
  def is_heap_until[RandomAccessIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      scala.Boolean
    ]
  ): RandomAccessIterator = js.native
  def is_partitioned[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    pred: js.Function1[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def is_permutation[ForwardIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator1
    ]
  ] */, ForwardIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator2
    ]
  ] */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): scala.Boolean = js.native
  def is_permutation[ForwardIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator1
    ]
  ] */, ForwardIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator2
    ]
  ] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def is_sorted[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](first: InputIterator, last: InputIterator): scala.Boolean = js.native
  def is_sorted[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def is_sorted_until[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def is_sorted_until[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): InputIterator = js.native
  def iter_swap[ForwardIterator1 /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator1
    ]
  ] */, ForwardIterator2 /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator2
    ]
  ] */](x: ForwardIterator1, y: ForwardIterator2): scala.Unit = js.native
  def lexicographical_compare[Iterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1]
  ] */, Iterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator2]
  ] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): scala.Boolean = js.native
  def lexicographical_compare[Iterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1]
  ] */, Iterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator2]
  ] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def lower_bound[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]
  ): ForwardIterator = js.native
  def lower_bound[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator],
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): ForwardIterator = js.native
  def make_heap[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def make_heap[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def max[T](items: js.Array[T]): T = js.native
  def max[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): T = js.native
  def max_element[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  def max_element[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): ForwardIterator = js.native
  def merge[InputIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1]
  ] */, InputIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def merge[InputIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1]
  ] */, InputIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      scala.Boolean
    ]
  ): OutputIterator = js.native
  def min[T](items: js.Array[T]): T = js.native
  def min[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): T = js.native
  def min_element[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](first: ForwardIterator, last: ForwardIterator): ForwardIterator = js.native
  def min_element[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): ForwardIterator = js.native
  def minmax[T](items: js.Array[T], comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): tstlLib.utilityPairMod.Pair[T, T] = js.native
  def minmax_element[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](first: ForwardIterator, last: ForwardIterator): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def minmax_element[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): tstlLib.utilityPairMod.Pair[ForwardIterator, ForwardIterator] = js.native
  def mismatch[Iterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1]
  ] */, Iterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator2]
  ] */](first1: Iterator1, last1: Iterator1, first2: Iterator2): tstlLib.utilityPairMod.Pair[Iterator1, Iterator2] = js.native
  def mismatch[Iterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1]
  ] */, Iterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator2], Iterator2]
  ] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator2], 
      scala.Boolean
    ]
  ): tstlLib.utilityPairMod.Pair[Iterator1, Iterator2] = js.native
  def next_permutation[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](first: BidirectionalIterator, last: BidirectionalIterator): scala.Boolean = js.native
  def next_permutation[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def none_of[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def nth_element[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, nth: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def nth_element[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](
    first: RandomAccessIterator,
    nth: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def partial_sort[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, middle: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def partial_sort[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](
    first: RandomAccessIterator,
    middle: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def partial_sort_copy[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      RandomAccessIterator
    ]
  ] */](
    first: InputIterator,
    last: InputIterator,
    output_first: RandomAccessIterator,
    output_last: RandomAccessIterator
  ): RandomAccessIterator = js.native
  def partial_sort_copy[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      RandomAccessIterator
    ]
  ] */](
    first: InputIterator,
    last: InputIterator,
    output_first: RandomAccessIterator,
    output_last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): RandomAccessIterator = js.native
  def partition[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      scala.Boolean
    ]
  ): BidirectionalIterator = js.native
  def partition_copy[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, OutputIterator1 /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator1]
  ] */, OutputIterator2 /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator2]
  ] */](
    first: InputIterator,
    last: InputIterator,
    output_true: OutputIterator1,
    output_false: OutputIterator2,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
    ]
  ): tstlLib.utilityPairMod.Pair[OutputIterator1, OutputIterator2] = js.native
  def partition_point[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    pred: js.Function1[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): ForwardIterator = js.native
  def pop_heap[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def pop_heap[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def prev_permutation[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](first: BidirectionalIterator, last: BidirectionalIterator): scala.Boolean = js.native
  def prev_permutation[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def push_heap[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def push_heap[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def randint(x: scala.Double, y: scala.Double): scala.Double = js.native
  def remove[InputIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
  ): InputIterator = js.native
  def remove_copy[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
  ): OutputIterator = js.native
  def remove_copy_if[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function1[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): OutputIterator = js.native
  def remove_if[InputIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): InputIterator = js.native
  def replace[InputIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    old_val: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator],
    new_val: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
  ): scala.Unit = js.native
  def replace_copy[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    old_val: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator],
    new_val: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
  ): OutputIterator = js.native
  def replace_copy_if[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    result: OutputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ],
    new_val: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
  ): OutputIterator = js.native
  def replace_if[InputIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ],
    new_val: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
  ): scala.Unit = js.native
  def reverse[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](first: BidirectionalIterator, last: BidirectionalIterator): scala.Unit = js.native
  def reverse_copy[BidirectionalIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      OutputIterator
    ]
  ] */](first: BidirectionalIterator, last: BidirectionalIterator, output: OutputIterator): OutputIterator = js.native
  def rotate[InputIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](first: InputIterator, middle: InputIterator, last: InputIterator): InputIterator = js.native
  def rotate_copy[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      OutputIterator
    ]
  ] */](first: ForwardIterator, middle: ForwardIterator, last: ForwardIterator, output: OutputIterator): OutputIterator = js.native
  def sample[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](first: InputIterator, last: InputIterator, output: OutputIterator, n: scala.Double): OutputIterator = js.native
  def search[ForwardIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator1
    ]
  ] */, ForwardIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator2
    ]
  ] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    last2: ForwardIterator2
  ): ForwardIterator1 = js.native
  def search[ForwardIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator1
    ]
  ] */, ForwardIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator2], 
      ForwardIterator2
    ]
  ] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    last2: ForwardIterator2,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator2], 
      scala.Boolean
    ]
  ): ForwardIterator1 = js.native
  def search_n[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    count: scala.Double,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]
  ): ForwardIterator = js.native
  def search_n[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    count: scala.Double,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator],
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): ForwardIterator = js.native
  def set_difference[InputIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1]
  ] */, InputIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_difference[InputIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1]
  ] */, InputIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      scala.Boolean
    ]
  ): OutputIterator = js.native
  def set_intersection[InputIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1]
  ] */, InputIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_intersection[InputIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1]
  ] */, InputIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      scala.Boolean
    ]
  ): OutputIterator = js.native
  def set_symmetric_difference[InputIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1]
  ] */, InputIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_symmetric_difference[InputIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1]
  ] */, InputIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      scala.Boolean
    ]
  ): OutputIterator = js.native
  def set_union[InputIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1]
  ] */, InputIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator
  ): OutputIterator = js.native
  def set_union[InputIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1]
  ] */, InputIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    last2: InputIterator2,
    output: OutputIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      scala.Boolean
    ]
  ): OutputIterator = js.native
  def shift_left[ForwardIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](first: ForwardIterator, last: ForwardIterator, n: scala.Double): ForwardIterator = js.native
  def shift_right[ForwardIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](first: ForwardIterator, last: ForwardIterator, n: scala.Double): ForwardIterator = js.native
  def shuffle[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def sort[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def sort[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def sort_heap[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def sort_heap[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def stable_partition[BidirectionalIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      BidirectionalIterator
    ]
  ] */](
    first: BidirectionalIterator,
    last: BidirectionalIterator,
    pred: js.Function1[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[BidirectionalIterator], 
      scala.Boolean
    ]
  ): BidirectionalIterator = js.native
  def stable_sort[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
  def stable_sort[RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      RandomAccessIterator
    ]
  ] */](
    first: RandomAccessIterator,
    last: RandomAccessIterator,
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[RandomAccessIterator], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def swap_ranges[ForwardIterator1 /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator1
    ]
  ] */, ForwardIterator2 /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
      ForwardIterator2
    ]
  ] */](first1: ForwardIterator1, last1: ForwardIterator1, first2: ForwardIterator2): ForwardIterator2 = js.native
  def transform[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[OutputIterator], OutputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    result: OutputIterator,
    op: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[OutputIterator]
    ]
  ): OutputIterator = js.native
  def transform[InputIterator1 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1]
  ] */, InputIterator2 /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator2], InputIterator2]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[OutputIterator], OutputIterator]
  ] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    result: OutputIterator,
    binary_op: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator2], 
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[OutputIterator]
    ]
  ): OutputIterator = js.native
  def unique[InputIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def unique[InputIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): InputIterator = js.native
  def unique_copy[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](first: InputIterator, last: InputIterator, output: OutputIterator): OutputIterator = js.native
  def unique_copy[InputIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator]
  ] */, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], OutputIterator]
  ] */](
    first: InputIterator,
    last: InputIterator,
    output: OutputIterator,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): OutputIterator = js.native
  def upper_bound[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]
  ): ForwardIterator = js.native
  def upper_bound[ForwardIterator /* <: stdLib.Readonly[
    tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
      tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      ForwardIterator
    ]
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator],
    comp: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
      scala.Boolean
    ]
  ): ForwardIterator = js.native
}


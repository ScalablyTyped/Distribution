package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/iterations", JSImport.Namespace)
@js.native
object algorithmIterationsMod extends js.Object {
  def adjacent_find[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def adjacent_find[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): InputIterator = js.native
  def all_of[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def any_of[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def count[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
  ): scala.Double = js.native
  def count_if[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): scala.Double = js.native
  def equal[InputIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator2] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2): scala.Boolean = js.native
  def equal[InputIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], InputIterator1] */, InputIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator2], InputIterator2] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator2], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def find[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator]
  ): InputIterator = js.native
  def find_end[Iterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1] */, Iterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Iterator1 = js.native
  def find_end[Iterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1] */, Iterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator2], Iterator2] */](
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
  def find_first_of[Iterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1] */, Iterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Iterator1 = js.native
  def find_first_of[Iterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1] */, Iterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator2], Iterator2] */](
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
  def find_if[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): InputIterator = js.native
  def find_if_not[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): InputIterator = js.native
  def for_each[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, Func /* <: js.Function1[/* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], _] */](first: InputIterator, last: InputIterator, fn: Func): Func = js.native
  def for_each_n[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */, Func /* <: js.Function1[/* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], _] */](first: InputIterator, n: scala.Double, fn: Func): InputIterator = js.native
  def lexicographical_compare[Iterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1] */, Iterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): scala.Boolean = js.native
  def lexicographical_compare[Iterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1] */, Iterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator2] */](
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
  def mismatch[Iterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1] */, Iterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2): tstlLib.utilityPairMod.Pair[Iterator1, Iterator2] = js.native
  def mismatch[Iterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], Iterator1] */, Iterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator2], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    pred: js.Function2[
      /* x */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator1], 
      /* y */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[Iterator2], 
      scala.Boolean
    ]
  ): tstlLib.utilityPairMod.Pair[Iterator1, Iterator2] = js.native
  def none_of[InputIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[
      /* val */ tstlLib.functionalIPointerMod.IPointerNs.ValueType[InputIterator], 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def search[ForwardIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
    ForwardIterator1
  ] */, ForwardIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
    ForwardIterator2
  ] */](
    first1: ForwardIterator1,
    last1: ForwardIterator1,
    first2: ForwardIterator2,
    last2: ForwardIterator2
  ): ForwardIterator1 = js.native
  def search[ForwardIterator1 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator1], 
    ForwardIterator1
  ] */, ForwardIterator2 /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator2], 
    ForwardIterator2
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
  def search_n[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
  ] */](
    first: ForwardIterator,
    last: ForwardIterator,
    count: scala.Double,
    `val`: tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator]
  ): ForwardIterator = js.native
  def search_n[ForwardIterator /* <: tstlLib.iteratorIForwardIteratorMod.IForwardIterator[
    tstlLib.functionalIPointerMod.IPointerNs.ValueType[ForwardIterator], 
    ForwardIterator
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
}


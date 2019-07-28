package typings.tstl

import typings.tstl.functionalIPointerMod.IPointerNs.ValueType
import typings.tstl.iteratorIForwardIteratorMod.IForwardIterator
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/iterations", JSImport.Namespace)
@js.native
object algorithmIterationsMod extends js.Object {
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
  def lexicographical_compare[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): Boolean = js.native
  def lexicographical_compare[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    comp: js.Function2[/* x */ ValueType[Iterator1], /* y */ ValueType[Iterator1], Boolean]
  ): Boolean = js.native
  def mismatch[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator1], Iterator2] */](first1: Iterator1, last1: Iterator1, first2: Iterator2): Pair[Iterator1, Iterator2] = js.native
  def mismatch[Iterator1 /* <: IForwardIterator[ValueType[Iterator1], Iterator1] */, Iterator2 /* <: IForwardIterator[ValueType[Iterator2], Iterator2] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    pred: js.Function2[/* x */ ValueType[Iterator1], /* y */ ValueType[Iterator2], Boolean]
  ): Pair[Iterator1, Iterator2] = js.native
  def none_of[InputIterator /* <: IForwardIterator[ValueType[InputIterator], InputIterator] */](
    first: InputIterator,
    last: InputIterator,
    pred: js.Function1[/* val */ ValueType[InputIterator], Boolean]
  ): Boolean = js.native
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
}


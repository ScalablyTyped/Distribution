package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/iterations", JSImport.Namespace)
@js.native
object algorithmIterationsMod extends js.Object {
  def adjacent_find[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def adjacent_find[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): InputIterator = js.native
  def all_of[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function1[/* val */ T, scala.Boolean]): scala.Boolean = js.native
  def any_of[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function1[/* val */ T, scala.Boolean]): scala.Boolean = js.native
  def count[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, `val`: T): scala.Double = js.native
  def count_if[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function1[/* val */ T, scala.Boolean]): scala.Double = js.native
  def equal[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */](first1: InputIterator1, last1: InputIterator1, first2: InputIterator2): scala.Boolean = js.native
  def equal[T, InputIterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator1]] */, InputIterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator2]] */](
    first1: InputIterator1,
    last1: InputIterator1,
    first2: InputIterator2,
    pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
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
  def lexicographical_compare[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](first1: Iterator1, last1: Iterator1, first2: Iterator2, last2: Iterator2): scala.Boolean = js.native
  def lexicographical_compare[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    last2: Iterator2,
    comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): scala.Boolean = js.native
  def mismatch[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](first1: Iterator1, last1: Iterator1, first2: Iterator2): tstlLib.utilityPairMod.Pair[Iterator1, Iterator2] = js.native
  def mismatch[T, Iterator1 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator1]] */, Iterator2 /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, Iterator2]] */](
    first1: Iterator1,
    last1: Iterator1,
    first2: Iterator2,
    pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]
  ): tstlLib.utilityPairMod.Pair[Iterator1, Iterator2] = js.native
  def none_of[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, pred: js.Function1[/* val */ T, scala.Boolean]): scala.Boolean = js.native
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
}


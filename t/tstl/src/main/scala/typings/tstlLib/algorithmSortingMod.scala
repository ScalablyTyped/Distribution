package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/sorting", JSImport.Namespace)
@js.native
object algorithmSortingMod extends js.Object {
  def is_sorted[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator): scala.Boolean = js.native
  def is_sorted[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): scala.Boolean = js.native
  def is_sorted_until[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator): InputIterator = js.native
  def is_sorted_until[T, InputIterator /* <: stdLib.Readonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, InputIterator]] */](first: InputIterator, last: InputIterator, comp: js.Function2[/* x */ T, /* y */ T, scala.Boolean]): InputIterator = js.native
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
}


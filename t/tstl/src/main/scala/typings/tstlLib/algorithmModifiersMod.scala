package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/modifiers", JSImport.Namespace)
@js.native
object algorithmModifiersMod extends js.Object {
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
  def fill[T, ForwardIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, `val`: T): scala.Unit = js.native
  def fill_n[T, OutputIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, OutputIterator]] */](first: OutputIterator, n: scala.Double, `val`: T): OutputIterator = js.native
  def generate[T, ForwardIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, gen: js.Function0[T]): scala.Unit = js.native
  def generate_n[T, ForwardIterator /* <: tstlLib.iteratorIFakeMod.Writeonly[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, n: scala.Double, gen: js.Function0[T]): ForwardIterator = js.native
  def iter_swap[T, ForwardIterator1 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator1]] */, ForwardIterator2 /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator2]] */](x: ForwardIterator1, y: ForwardIterator2): scala.Unit = js.native
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
  def shift_left[T, ForwardIterator /* <: tstlLib.iteratorIFakeMod.General[tstlLib.iteratorIForwardIteratorMod.IForwardIterator[T, ForwardIterator]] */](first: ForwardIterator, last: ForwardIterator, n: scala.Double): ForwardIterator = js.native
  def shift_right[T, ForwardIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIBidirectionalIteratorMod.IBidirectionalIterator[T, ForwardIterator]
  ] */](first: ForwardIterator, last: ForwardIterator, n: scala.Double): ForwardIterator = js.native
  def shuffle[T, RandomAccessIterator /* <: tstlLib.iteratorIFakeMod.General[
    tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, RandomAccessIterator]
  ] */](first: RandomAccessIterator, last: RandomAccessIterator): scala.Unit = js.native
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
}


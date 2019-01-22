package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/merge", JSImport.Namespace)
@js.native
object algorithmMergeMod extends js.Object {
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
}


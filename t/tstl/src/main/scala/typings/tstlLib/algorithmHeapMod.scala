package typings
package tstlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/algorithm/heap", JSImport.Namespace)
@js.native
object algorithmHeapMod extends js.Object {
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
}


package typings.tstl.baseIteratorArrayIteratorBaseMod

import typings.tstl.baseContainerArrayContainerMod.ArrayContainer
import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.baseIteratorReverseIteratorMod.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.tstl.iteratorIRandomAccessIteratorMod.IRandomAccessIterator because var conflicts: value. Inlined index, advance */ @JSImport("tstl/base/iterator/ArrayIteratorBase", "ArrayReverseIteratorBase")
@js.native
abstract class ArrayReverseIteratorBase[T /* <: ElemT */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, ElemT] */, ArrayT /* <: ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, IteratorT /* <: ArrayIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ReverseT /* <: ArrayReverseIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ElemT] () extends ReverseIterator[T, SourceT, IteratorT, ReverseT, ElemT] {
  /**
    * @inheritDoc
    */
  /**
    * Advance iterator.
    *
    * @param n Step to advance.
    * @return The advanced iterator.
    */
  def advance(n: Double): ReverseT = js.native
  /**
    * @inheritDoc
    */
  /**
    * Get index.
    *
    * @return The index.
    */
  def index(): Double = js.native
}


package typings
package tstlLib.baseIteratorArrayIteratorBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator because var conflicts: value. Inlined index, advance */ @JSImport("tstl/base/iterator/ArrayIteratorBase", "ArrayReverseIteratorBase")
@js.native
abstract class ArrayReverseIteratorBase[T /* <: ElemT */, SourceT /* <: tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseT, ElemT] */, ArrayT /* <: tstlLib.baseContainerArrayContainerMod.ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, IteratorT /* <: ArrayIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ReverseT /* <: ArrayReverseIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ElemT] ()
  extends tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseT, ElemT] {
  /**
    * @inheritDoc
    */
  /**
    * Advance iterator.
    *
    * @param n Step to advance.
    * @return The advanced iterator.
    */
  def advance(n: scala.Double): ReverseT = js.native
  /**
    * @inheritDoc
    */
  /**
    * Get index.
    *
    * @return The index.
    */
  def index(): scala.Double = js.native
}


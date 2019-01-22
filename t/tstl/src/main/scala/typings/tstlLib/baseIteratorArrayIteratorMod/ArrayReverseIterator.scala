package typings
package tstlLib.baseIteratorArrayIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator because var conflicts: value. Inlined index, advance */ @JSImport("tstl/base/iterator/ArrayIterator", "ArrayReverseIterator")
@js.native
class ArrayReverseIterator[T, Source /* <: tstlLib.baseContainerArrayContainerMod.ArrayContainer[T, Source] */] protected ()
  extends tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, Source, ArrayIterator[T, Source], ArrayReverseIterator[T, Source]] {
  /**
    * Initializer Constructor.
    *
    * @param base The base iterator.
    */
  def this(base: ArrayIterator[T, Source]) = this()
  /**
    * @inheritDoc
    */
  /**
    * Advance iterator.
    *
    * @param n Step to advance.
    * @return The advanced iterator.
    */
  def advance(n: scala.Double): ArrayReverseIterator[T, Source] = js.native
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


package typings
package tstlLib.baseIteratorArrayIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/iterator/ArrayIterator", "ArrayIterator")
@js.native
class ArrayIterator[T, Source /* <: tstlLib.baseContainerArrayContainerMod.ArrayContainer[T, Source] */] protected ()
  extends tstlLib.iteratorIRandomAccessIteratorMod.IRandomAccessIterator[T, ArrayIterator[T, Source]]
     with tstlLib.baseIteratorIteratorMod.Iterator[T, Source, ArrayIterator[T, Source], ArrayReverseIterator[T, Source], T] {
  /**
    * Initializer Constructor.
    *
    * @param source Source container.
    * @param index Index number.
    */
  def this(source: Source, index: scala.Double) = this()
  /**
    * @hidden
    */
  var `index_`: js.Any = js.native
  /**
    * @hidden
    */
  var `source_`: js.Any = js.native
  /**
    * Reference of the value.
    */
  /* CompleteClass */
  override var value: T = js.native
  /**
    * Advance iterator.
    *
    * @param n Step to advance.
    * @return The advanced iterator.
    */
  /* CompleteClass */
  override def advance(n: scala.Double): ArrayIterator[T, Source] = js.native
  /**
    * Get index.
    *
    * @return The index.
    */
  /* CompleteClass */
  override def index(): scala.Double = js.native
  /**
    * Get next iterator.
    *
    * @return The next iterator.
    */
  /* CompleteClass */
  override def next(): ArrayIterator[T, Source] = js.native
  /**
    * Get previous iterator.
    *
    * @return The previous iterator.
    */
  /* CompleteClass */
  override def prev(): ArrayIterator[T, Source] = js.native
  /**
    * @inheritDoc
    */
  /* CompleteClass */
  override def reverse(): ArrayReverseIterator[T, Source] = js.native
  /**
    * Get source container.
    *
    * @return The source container.
    */
  /* CompleteClass */
  override def source(): Source = js.native
}


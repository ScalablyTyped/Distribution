package typings.tstl.baseIteratorArrayIteratorBaseMod

import typings.tstl.baseContainerArrayContainerMod.ArrayContainer
import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.iteratorIRandomAccessIteratorMod.IRandomAccessIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/iterator/ArrayIteratorBase", "ArrayIteratorBase")
@js.native
abstract class ArrayIteratorBase[T /* <: ElemT */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseT, ElemT] */, ArrayT /* <: ArrayContainer[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, IteratorT /* <: ArrayIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ReverseT /* <: ArrayReverseIteratorBase[T, SourceT, ArrayT, IteratorT, ReverseT, ElemT] */, ElemT] protected ()
  extends IRandomAccessIterator[T, IteratorT]
     with Iterator[T, SourceT, IteratorT, ReverseT, ElemT] {
  /**
    * Initializer Constructor.
    *
    * @param source Source container.
    * @param index Index number.
    */
  def this(array: ArrayT, index: Double) = this()
  /**
    * @hidden
    */
  var array_ : js.Any = js.native
  /**
    * @hidden
    */
  var index_ : js.Any = js.native
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
  override def advance(n: Double): IteratorT = js.native
  /**
    * Get index.
    *
    * @return The index.
    */
  /* CompleteClass */
  override def index(): Double = js.native
  /**
    * Get next iterator.
    *
    * @return The next iterator.
    */
  /* CompleteClass */
  override def next(): IteratorT = js.native
  /**
    * Get previous iterator.
    *
    * @return The previous iterator.
    */
  /* CompleteClass */
  override def prev(): IteratorT = js.native
  /**
    * @inheritDoc
    */
  /* CompleteClass */
  override def reverse(): ReverseT = js.native
  /**
    * Get source container.
    *
    * @return The source container.
    */
  /* CompleteClass */
  override def source(): SourceT = js.native
}


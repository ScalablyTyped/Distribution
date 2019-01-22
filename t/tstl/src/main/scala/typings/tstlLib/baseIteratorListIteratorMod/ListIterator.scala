package typings
package tstlLib.baseIteratorListIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {readonly [ P in keyof tstl.tstl/base/iterator/Iterator.Iterator<tstl.tstl/base/iterator/Iterator.Iterator<T, SourceT, IteratorT, ReverseIteratorT>, SourceT, IteratorT, ReverseIteratorT> ]: tstl.tstl/base/iterator/Iterator.Iterator<tstl.tstl/base/iterator/Iterator.Iterator<T, SourceT, IteratorT, ReverseIteratorT>, SourceT, IteratorT, ReverseIteratorT>[P]} */ @JSImport("tstl/base/iterator/ListIterator", "ListIterator")
@js.native
abstract class ListIterator[T, SourceT /* <: tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseIteratorT] */, IteratorT /* <: ListIterator[T, SourceT, IteratorT, ReverseIteratorT] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT] */] protected () extends js.Object {
  /**
    * @hidden
    */
  protected def this(prev: IteratorT, next: IteratorT, value: T) = this()
  /**
    * @hidden
    */
  var `next_`: js.Any = js.native
  /**
    * @hidden
    */
  var `prev_`: js.Any = js.native
  /**
    * @inheritDoc
    */
  val value: T = js.native
  /**
    * @hidden
    */
  var `value_`: js.Any = js.native
  /**
    * @inheritDoc
    */
  def next(): IteratorT = js.native
  /**
    * @inheritDoc
    */
  def prev(): IteratorT = js.native
  /**
    * @inheritDoc
    */
  def reverse(): ReverseIteratorT = js.native
  /**
    * @inheritDoc
    */
  def source(): SourceT = js.native
}


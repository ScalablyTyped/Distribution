package typings
package tstlLib.baseIteratorIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {readonly [ P in keyof tstl.tstl/iterator/IReverseIterator.IReversableIterator<tstl.tstl/iterator/IReverseIterator.IReversableIterator<T, IteratorT, ReverseIteratorT>, IteratorT, ReverseIteratorT> ]: tstl.tstl/iterator/IReverseIterator.IReversableIterator<tstl.tstl/iterator/IReverseIterator.IReversableIterator<T, IteratorT, ReverseIteratorT>, IteratorT, ReverseIteratorT>[P]} */ trait Iterator[T /* <: Elem */, SourceT /* <: tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem] extends js.Object {
  /**
    * @inheritDoc
    */
  def reverse(): ReverseIteratorT
  /**
    * Get source container.
    *
    * @return The source container.
    */
  def source(): SourceT
}

object Iterator {
  @scala.inline
  def apply[T /* <: Elem */, SourceT /* <: tstlLib.baseContainerIContainerMod.IContainer[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem](reverse: () => ReverseIteratorT, source: () => SourceT): Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] = {
    val __obj = js.Dynamic.literal(reverse = js.Any.fromFunction0(reverse), source = js.Any.fromFunction0(source))
  
    __obj.asInstanceOf[Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem]]
  }
}


package typings.tstl.icontainerMod.IContainer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Reverse iterator of {@link IContainer}
  *
  * @author Jeongho Nam - https://github.com/samchon
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {readonly [ P in keyof tstl.tstl/iterator/IReverseIterator.IReverseIterator<T, IteratorT, ReverseT> ]: tstl.tstl/iterator/IReverseIterator.IReverseIterator<T, IteratorT, ReverseT>[P]} */ trait ReverseIterator[T /* <: Elem */, Source /* <: typings.tstl.icontainerMod.IContainer[T, Source, IteratorT, ReverseT, Elem] */, IteratorT /* <: Iterator[T, Source, IteratorT, ReverseT, Elem] */, ReverseT /* <: ReverseIterator[T, Source, IteratorT, ReverseT, Elem] */, Elem] extends js.Object {
  /**
    * Get source container.
    *
    * @return The source container.
    */
  def source(): Source
}

object ReverseIterator {
  @scala.inline
  def apply[T /* <: Elem */, Source /* <: typings.tstl.icontainerMod.IContainer[T, Source, IteratorT, ReverseT, Elem] */, IteratorT /* <: Iterator[T, Source, IteratorT, ReverseT, Elem] */, ReverseT /* <: ReverseIterator[T, Source, IteratorT, ReverseT, Elem] */, Elem](source: () => Source): ReverseIterator[T, Source, IteratorT, ReverseT, Elem] = {
    val __obj = js.Dynamic.literal(source = js.Any.fromFunction0(source))
  
    __obj.asInstanceOf[ReverseIterator[T, Source, IteratorT, ReverseT, Elem]]
  }
}


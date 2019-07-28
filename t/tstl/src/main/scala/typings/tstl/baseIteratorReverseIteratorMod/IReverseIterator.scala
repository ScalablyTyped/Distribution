package typings.tstl.baseIteratorReverseIteratorMod

import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.baseIteratorIteratorMod.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {readonly [ P in keyof tstl.tstl/iterator/IReverseIterator.IReverseIterator<tstl.tstl/iterator/IReverseIterator.IReverseIterator<T, Base, This>, Base, This> ]: tstl.tstl/iterator/IReverseIterator.IReverseIterator<tstl.tstl/iterator/IReverseIterator.IReverseIterator<T, Base, This>, Base, This>[P]} */ trait IReverseIterator[T /* <: Elem */, Source /* <: IContainer[T, Source, Base, This, Elem] */, Base /* <: Iterator[T, Source, Base, This, Elem] */, This /* <: IReverseIterator[T, Source, Base, This, Elem] */, Elem] extends js.Object {
  /**
    * Get source container.
    *
    * @return The source container.
    */
  def source(): Source
}

object IReverseIterator {
  @scala.inline
  def apply[T /* <: Elem */, Source /* <: IContainer[T, Source, Base, This, Elem] */, Base /* <: Iterator[T, Source, Base, This, Elem] */, This /* <: IReverseIterator[T, Source, Base, This, Elem] */, Elem](source: () => Source): IReverseIterator[T, Source, Base, This, Elem] = {
    val __obj = js.Dynamic.literal(source = js.Any.fromFunction0(source))
  
    __obj.asInstanceOf[IReverseIterator[T, Source, Base, This, Elem]]
  }
}


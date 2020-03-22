package typings.tstl

import typings.tstl.icontainerMod.IContainer
import typings.tstl.icontainerMod.IContainer.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/iterator/ReverseIterator", JSImport.Namespace)
@js.native
object reverseIteratorMod extends js.Object {
  @js.native
  abstract class ReverseIterator[T /* <: PElem */, Source /* <: IContainer[T, Source, Base, This, PElem] */, Base /* <: Iterator[T, Source, Base, This, PElem] */, This /* <: ReverseIterator[T, Source, Base, This, PElem] */, PElem] protected ()
    extends typings.tstl.icontainerMod.IContainer.ReverseIterator[T, Source, Base, This, PElem] {
    /**
      * Initializer Constructor.
      *
      * @param base The base iterator.
      */
    def this(base: Base) = this()
    var base_ : Base = js.native
    /* CompleteClass */
    override val value: T = js.native
    /* protected */ def _Create_neighbor(base: Base): This = js.native
    /* CompleteClass */
    override def base(): Base = js.native
    /* CompleteClass */
    override def next(): This = js.native
    /* CompleteClass */
    override def prev(): This = js.native
    /**
      * Get source container.
      *
      * @return The source container.
      */
    /* CompleteClass */
    override def source(): Source = js.native
  }
  
}


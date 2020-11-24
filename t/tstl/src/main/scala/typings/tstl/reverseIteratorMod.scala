package typings.tstl

import typings.tstl.icontainerMod.IContainer
import typings.tstl.icontainerMod.IContainer.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    
    /* protected */ def _Create_neighbor(base: Base): This = js.native
    
    var base_ : Base = js.native
  }
}

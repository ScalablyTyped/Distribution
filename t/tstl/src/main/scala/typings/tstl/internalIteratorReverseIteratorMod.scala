package typings.tstl

import typings.tstl.baseContainerIContainerMod.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/iterator/ReverseIterator", JSImport.Namespace)
@js.native
object internalIteratorReverseIteratorMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, Source, Base, This, PElem> * / any */ @js.native
  abstract class ReverseIterator[T /* <: PElem */, Source /* <: IContainer[T, Source, Base, This, PElem] */, Base /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, Source, Base, This, PElem> */ js.Any */, This /* <: ReverseIterator[T, Source, Base, This, PElem] */, PElem] protected () extends js.Object {
    /**
      * Initializer Constructor.
      *
      * @param base The base iterator.
      */
    def this(base: Base) = this()
    var base_ : Base = js.native
    /* protected */ def _Create_neighbor(base: Base): This = js.native
    /**
      * @inheritDoc
      */
    def base(): Base = js.native
    /**
      * @inheritDoc
      */
    def next(): This = js.native
    /**
      * @inheritDoc
      */
    def prev(): This = js.native
    /**
      * Get source container.
      *
      * @return The source container.
      */
    def source(): Source = js.native
    /**
      * @inheritDoc
      */
    def value(): T = js.native
  }
  
}


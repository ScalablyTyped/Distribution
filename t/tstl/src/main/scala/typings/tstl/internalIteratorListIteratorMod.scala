package typings.tstl

import typings.tstl.baseContainerIContainerMod.IContainer
import typings.tstl.internalIteratorReverseIteratorMod.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/iterator/ListIterator", JSImport.Namespace)
@js.native
object internalIteratorListIteratorMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {readonly [ P in keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseIteratorT, Elem> * / any ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseIteratorT, Elem> * / any[P]} */ @js.native
  abstract class ListIterator[T /* <: Elem */, SourceT /* <: IContainer[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: ListIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem] protected () extends js.Object {
    protected def this(prev: IteratorT, next: IteratorT, value: T) = this()
    var next_ : js.Any = js.native
    var prev_ : js.Any = js.native
    var value_ : T = js.native
    /* protected */ def _Try_value(): Unit = js.native
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
    /**
      * @inheritDoc
      */
    def value(): T = js.native
  }
  
}


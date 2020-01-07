package typings.tstl

import typings.tstl.baseContainerSetContainerMod.SetContainer
import typings.tstl.internalContainerAssociativeSetElementListMod.SetElementList.Iterator
import typings.tstl.internalContainerAssociativeSetElementListMod.SetElementList.ReverseIterator
import typings.tstl.internalContainerLinearListContainerMod.ListContainer
import typings.tstl.internalIteratorListIteratorMod.ListIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/associative/SetElementList", JSImport.Namespace)
@js.native
object internalContainerAssociativeSetElementListMod extends js.Object {
  @js.native
  class SetElementList[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] protected () extends ListContainer[Key, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] {
    def this(associative: Source) = this()
    var associative_ : js.Any = js.native
    def associative(): Source = js.native
  }
  
  @js.native
  object SetElementList extends js.Object {
    /**
      * Iterator of set container storing elements in a list.
      *
      * @typeParam Key Key type
      * @typeParam Unique Whether duplicated key is blocked or not
      * @typeParam Source Source container type
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    @js.native
    class Iterator[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] protected ()
      extends ListIterator[Key, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source], Key]
         with typings.std.Iterator[Key, Unique, Source] {
      var source_ : js.Any = js.native
    }
    
    /**
      * Reverser iterator of set container storing elements in a list.
      *
      * @typeParam Key Key type
      * @typeParam Unique Whether duplicated key is blocked or not
      * @typeParam Source Source container type
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetContainer.ReverseIterator<Key, Unique, Source, Iterator<Key, Unique, Source>, ReverseIterator<Key, Unique, Source>> * / any */ @js.native
    class ReverseIterator[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] ()
      extends typings.tstl.internalIteratorReverseIteratorMod.ReverseIterator[Key, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source], Key]
    
  }
  
}


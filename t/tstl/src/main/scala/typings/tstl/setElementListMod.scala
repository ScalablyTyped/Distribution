package typings.tstl

import typings.tstl.listContainerMod.ListContainer
import typings.tstl.listIteratorMod.ListIterator
import typings.tstl.setContainerMod.SetContainer
import typings.tstl.setElementListMod.SetElementList.Iterator
import typings.tstl.setElementListMod.SetElementList.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/associative/SetElementList", JSImport.Namespace)
@js.native
object setElementListMod extends js.Object {
  @js.native
  class SetElementList[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] protected () extends ListContainer[Key, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] {
    def this(associative: Source) = this()
    var associative_ : js.Any = js.native
    def associative(): Source = js.native
  }
  
  /* static members */
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
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.tstl.setContainerMod.SetContainer.Iterator because var conflicts: value. Inlined  */ @js.native
    class Iterator[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] protected () extends ListIterator[Key, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source], Key] {
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
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.tstl.setContainerMod.SetContainer.ReverseIterator because var conflicts: value. Inlined  */ @js.native
    class ReverseIterator[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] ()
      extends typings.tstl.reverseIteratorMod.ReverseIterator[Key, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source], Key]
    
    /**
      * @internal
      */
    def _Swap_associative[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */](x: SetElementList[Key, Unique, Source], y: SetElementList[Key, Unique, Source]): Unit = js.native
    /* static members */
    @js.native
    object Iterator extends js.Object {
      /**
        * @internal
        */
      def create[Key, Unique /* <: Boolean */, Source /* <: SetContainer[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */](
        list: SetElementList[Key, Unique, Source],
        prev: Iterator[Key, Unique, Source],
        next: Iterator[Key, Unique, Source],
        `val`: Key
      ): Iterator[Key, Unique, Source] = js.native
    }
    
  }
  
}


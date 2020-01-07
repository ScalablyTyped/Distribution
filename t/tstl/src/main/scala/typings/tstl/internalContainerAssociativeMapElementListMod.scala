package typings.tstl

import typings.tstl.baseContainerMapContainerMod.MapContainer
import typings.tstl.internalContainerAssociativeMapElementListMod.MapElementList.Iterator
import typings.tstl.internalContainerAssociativeMapElementListMod.MapElementList.ReverseIterator
import typings.tstl.internalContainerLinearListContainerMod.ListContainer
import typings.tstl.internalIteratorListIteratorMod.ListIterator
import typings.tstl.utilityEntryMod.Entry
import typings.tstl.utilityIPairMod.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/associative/MapElementList", JSImport.Namespace)
@js.native
object internalContainerAssociativeMapElementListMod extends js.Object {
  @js.native
  class MapElementList[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
    Key, 
    T, 
    Unique, 
    Source, 
    Iterator[Key, T, Unique, Source], 
    ReverseIterator[Key, T, Unique, Source]
  ] */] protected () extends ListContainer[
          Entry[Key, T], 
          Source, 
          Iterator[Key, T, Unique, Source], 
          ReverseIterator[Key, T, Unique, Source]
        ] {
    def this(associative: Source) = this()
    var associative_ : js.Any = js.native
    def associative(): Source = js.native
  }
  
  @js.native
  object MapElementList extends js.Object {
    /**
      * Iterator of map container storing elements in a list.
      *
      * @typeParam Key Key type
      * @typeParam T Mapped type
      * @typeParam Unique Whether duplicated key is blocked or not
      * @typeParam Source Source container type
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    @js.native
    class Iterator[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
        Key, 
        T, 
        Unique, 
        Source, 
        Iterator[Key, T, Unique, Source], 
        ReverseIterator[Key, T, Unique, Source]
      ] */] protected ()
      extends ListIterator[
              Entry[Key, T], 
              Source, 
              Iterator[Key, T, Unique, Source], 
              ReverseIterator[Key, T, Unique, Source], 
              IPair[Key, T]
            ]
         with typings.std.Iterator[Key, T, Unique] {
      var list_ : js.Any = js.native
      /**
        * @inheritDoc
        */
      def first(): Key = js.native
      /**
        * @inheritDoc
        */
      def second(): T = js.native
      /**
        * @inheritDoc
        */
      def second(`val`: T): js.Any = js.native
    }
    
    /**
      * Reverse iterator of map container storing elements a list.
      *
      * @typeParam Key Key type
      * @typeParam T Mapped type
      * @typeParam Unique Whether duplicated key is blocked or not
      * @typeParam Source Source container type
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapContainer.ReverseIterator<Key, T, Unique, Source, Iterator<Key, T, Unique, Source>, ReverseIterator<Key, T, Unique, Source>> * / any */ @js.native
    class ReverseIterator[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
        Key, 
        T, 
        Unique, 
        Source, 
        Iterator[Key, T, Unique, Source], 
        ReverseIterator[Key, T, Unique, Source]
      ] */] ()
      extends typings.tstl.internalIteratorReverseIteratorMod.ReverseIterator[
              Entry[Key, T], 
              Source, 
              Iterator[Key, T, Unique, Source], 
              ReverseIterator[Key, T, Unique, Source], 
              IPair[Key, T]
            ] {
      /**
        * Get the first, key element.
        *
        * @return The first element.
        */
      def first(): Key = js.native
      /**
        * Get the second, stored element.
        *
        * @return The second element.
        */
      def second(): T = js.native
      /**
        * Set the second, stored element.
        *
        * @param val The value to set.
        */
      def second(`val`: T): js.Any = js.native
    }
    
  }
  
}


package typings.tstl

import typings.tstl.entryMod.Entry
import typings.tstl.ipairMod.IPair
import typings.tstl.listContainerMod.ListContainer
import typings.tstl.listIteratorMod.ListIterator
import typings.tstl.mapContainerMod.MapContainer
import typings.tstl.mapElementListMod.MapElementList.Iterator
import typings.tstl.mapElementListMod.MapElementList.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/container/associative/MapElementList", JSImport.Namespace)
@js.native
object mapElementListMod extends js.Object {
  
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
    
    def associative(): Source = js.native
    
    var associative_ : js.Any = js.native
  }
  @js.native
  object MapElementList extends js.Object {
    
    /**
      * Iterator of map container storing elements in a list.
      *
      * @template Key Key type
      * @template T Mapped type
      * @template Unique Whether duplicated key is blocked or not
      * @template Source Source container type
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.tstl.mapContainerMod.MapContainer.Iterator because var conflicts: value. Inlined first, second */ @js.native
    class Iterator[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
        Key, 
        T, 
        Unique, 
        Source, 
        Iterator[Key, T, Unique, Source], 
        ReverseIterator[Key, T, Unique, Source]
      ] */] protected () extends ListIterator[
              Entry[Key, T], 
              Source, 
              Iterator[Key, T, Unique, Source], 
              ReverseIterator[Key, T, Unique, Source], 
              IPair[Key, T]
            ] {
      
      /**
        * @inheritDoc
        */
      def first: Key = js.native
      /**
        * The first, key element.
        */
      @JSName("first")
      val first_FIterator: Key = js.native
      
      var list_ : js.Any = js.native
      
      /**
        * @inheritDoc
        */
      def second: T = js.native
      /**
        * @inheritDoc
        */
      def second_=(`val`: T): Unit = js.native
      /**
        * The second, stored element.
        */
      @JSName("second")
      var second_FIterator: T = js.native
    }
    
    /**
      * Reverse iterator of map container storing elements a list.
      *
      * @template Key Key type
      * @template T Mapped type
      * @template Unique Whether duplicated key is blocked or not
      * @template Source Source container type
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
    - typings.tstl.mapContainerMod.MapContainer.ReverseIterator because var conflicts: value. Inlined first, second */ @js.native
    class ReverseIterator[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
        Key, 
        T, 
        Unique, 
        Source, 
        Iterator[Key, T, Unique, Source], 
        ReverseIterator[Key, T, Unique, Source]
      ] */] ()
      extends typings.tstl.reverseIteratorMod.ReverseIterator[
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
      def first: Key = js.native
      
      /**
        * Get the second, stored element.
        *
        * @return The second element.
        */
      def second: T = js.native
      /**
        * Set the second, stored element.
        *
        * @param val The value to set.
        */
      def second_=(`val`: T): Unit = js.native
    }
  }
}

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
import scala.scalajs.js.annotation._

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
    var associative_ : js.Any = js.native
    def associative(): Source = js.native
  }
  
  /* static members */
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
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
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
        * The first, key element.
        */
      @JSName("first")
      val first_FIterator: Key = js.native
      var list_ : js.Any = js.native
      /**
        * The second, stored element.
        */
      @JSName("second")
      var second_FIterator: T = js.native
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
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
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
    
    /**
      * @internal
      */
    def _Swap_associative[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
        Key, 
        T, 
        Unique, 
        Source, 
        Iterator[Key, T, Unique, Source], 
        ReverseIterator[Key, T, Unique, Source]
      ] */](x: MapElementList[Key, T, Unique, Source], y: MapElementList[Key, T, Unique, Source]): Unit = js.native
    /* static members */
    @js.native
    object Iterator extends js.Object {
      /**
        * @internal
        */
      def create[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
            Key, 
            T, 
            Unique, 
            Source, 
            Iterator[Key, T, Unique, Source], 
            ReverseIterator[Key, T, Unique, Source]
          ] */](
        list: MapElementList[Key, T, Unique, Source],
        prev: Iterator[Key, T, Unique, Source],
        next: Iterator[Key, T, Unique, Source],
        `val`: Entry[Key, T]
      ): Iterator[Key, T, Unique, Source] = js.native
    }
    
  }
  
}


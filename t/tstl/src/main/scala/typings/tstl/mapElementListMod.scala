package typings.tstl

import typings.tstl.entryMod.Entry
import typings.tstl.ipairMod.IPair
import typings.tstl.listContainerMod.ListContainer
import typings.tstl.listIteratorMod.ListIterator
import typings.tstl.mapContainerMod.MapContainer
import typings.tstl.mapContainerMod.MapContainer.IteratorBase
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
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped {readonly [ P in keyof tstl.tstl/base/container/IContainer.IContainer.Iterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, tstl.tstl/internal/container/associative/MapElementList.MapElementList.Iterator<Key, T, Unique, Source>, tstl.tstl/internal/container/associative/MapElementList.MapElementList.ReverseIterator<Key, T, Unique, Source>, tstl.tstl/utility/IPair.IPair<Key, T>> ]: tstl.tstl/base/container/IContainer.IContainer.Iterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, tstl.tstl/internal/container/associative/MapElementList.MapElementList.Iterator<Key, T, Unique, Source>, tstl.tstl/internal/container/associative/MapElementList.MapElementList.ReverseIterator<Key, T, Unique, Source>, tstl.tstl/utility/IPair.IPair<Key, T>>[P]} */ @js.native
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
         with IteratorBase[Key, T] {
      /**
        * The first, key element.
        */
      /* CompleteClass */
      override val first: Key = js.native
      var list_ : js.Any = js.native
      /**
        * The second, stored element.
        */
      /* CompleteClass */
      override var second: T = js.native
      /**
        * @inheritDoc
        */
      @JSName("first")
      def first_MIterator(): Key = js.native
      /**
        * @inheritDoc
        */
      @JSName("second")
      def second_MIterator(): T = js.native
      /**
        * @inheritDoc
        */
      @JSName("second")
      def second_MIterator(`val`: T): js.Any = js.native
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
    - Dropped {readonly [ P in keyof tstl.tstl/base/container/IContainer.IContainer.ReverseIterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, tstl.tstl/internal/container/associative/MapElementList.MapElementList.Iterator<Key, T, Unique, Source>, tstl.tstl/internal/container/associative/MapElementList.MapElementList.ReverseIterator<Key, T, Unique, Source>, tstl.tstl/utility/IPair.IPair<Key, T>> ]: tstl.tstl/base/container/IContainer.IContainer.ReverseIterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, tstl.tstl/internal/container/associative/MapElementList.MapElementList.Iterator<Key, T, Unique, Source>, tstl.tstl/internal/container/associative/MapElementList.MapElementList.ReverseIterator<Key, T, Unique, Source>, tstl.tstl/utility/IPair.IPair<Key, T>>[P]} */ @js.native
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
            ]
         with IteratorBase[Key, T] {
      /**
        * The first, key element.
        */
      /* CompleteClass */
      override val first: Key = js.native
      /**
        * The second, stored element.
        */
      /* CompleteClass */
      override var second: T = js.native
    }
    
  }
  
}


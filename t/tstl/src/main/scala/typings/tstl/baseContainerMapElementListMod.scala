package typings.tstl

import typings.tstl.baseContainerListContainerMod.ListContainer
import typings.tstl.baseContainerMapContainerMod.MapContainer
import typings.tstl.baseContainerMapElementListMod.MapElementList.Iterator
import typings.tstl.baseContainerMapElementListMod.MapElementList.ReverseIterator
import typings.tstl.baseIteratorIMapIteratorMod.IMapIteratorBase
import typings.tstl.baseIteratorListIteratorMod.ListIterator
import typings.tstl.utilityEntryMod.Entry
import typings.tstl.utilityIPairMod.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MapElementList", JSImport.Namespace)
@js.native
object baseContainerMapElementListMod extends js.Object {
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
    /**
      * @hidden
      */
    var associative_ : js.Any = js.native
    def associative(): Source = js.native
  }
  
  @js.native
  object MapElementList extends js.Object {
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped {readonly [ P in keyof tstl.tstl/base/iterator/Iterator.Iterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, tstl.tstl/base/container/MapElementList.MapElementList.Iterator<Key, T, Unique, Source>, tstl.tstl/base/container/MapElementList.MapElementList.ReverseIterator<Key, T, Unique, Source>, tstl.tstl/utility/IPair.IPair<Key, T>> ]: tstl.tstl/base/iterator/Iterator.Iterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, tstl.tstl/base/container/MapElementList.MapElementList.Iterator<Key, T, Unique, Source>, tstl.tstl/base/container/MapElementList.MapElementList.ReverseIterator<Key, T, Unique, Source>, tstl.tstl/utility/IPair.IPair<Key, T>>[P]} */ @js.native
    /**
      * @hidden
      */
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
         with IMapIteratorBase[Key, T] {
      /**
        * The first, key element.
        */
      /* CompleteClass */
      override val first: Key = js.native
      /**
        * @hidden
        */
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
    
    @js.native
    class ReverseIterator[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
        Key, 
        T, 
        Unique, 
        Source, 
        Iterator[Key, T, Unique, Source], 
        ReverseIterator[Key, T, Unique, Source]
      ] */] ()
      extends typings.tstl.baseIteratorReverseIteratorMod.ReverseIterator[
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


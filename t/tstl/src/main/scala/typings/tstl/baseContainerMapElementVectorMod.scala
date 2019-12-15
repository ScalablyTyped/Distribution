package typings.tstl

import typings.tstl.baseContainerMapContainerMod.MapContainer
import typings.tstl.baseContainerMapElementVectorMod.MapElementVector
import typings.tstl.baseContainerMapElementVectorMod.MapElementVector.Iterator
import typings.tstl.baseContainerMapElementVectorMod.MapElementVector.ReverseIterator
import typings.tstl.baseContainerVectorContainerMod.VectorContainer
import typings.tstl.baseIteratorArrayIteratorBaseMod.ArrayIteratorBase
import typings.tstl.baseIteratorArrayIteratorBaseMod.ArrayReverseIteratorBase
import typings.tstl.baseIteratorIMapIteratorMod.IMapIteratorBase
import typings.tstl.utilityEntryMod.Entry
import typings.tstl.utilityIPairMod.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MapElementVector", JSImport.Namespace)
@js.native
object baseContainerMapElementVectorMod extends js.Object {
  @js.native
  class MapElementVector[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
    Key, 
    T, 
    Unique, 
    Source, 
    Iterator[Key, T, Unique, Source], 
    ReverseIterator[Key, T, Unique, Source]
  ] */] protected () extends VectorContainer[
          Entry[Key, T], 
          Source, 
          MapElementVector[Key, T, Unique, Source], 
          Iterator[Key, T, Unique, Source], 
          ReverseIterator[Key, T, Unique, Source], 
          IPair[Key, T]
        ] {
    def this(associative: Source) = this()
    var associative_ : js.Any = js.native
    def associative(): Source = js.native
  }
  
  @js.native
  object MapElementVector extends js.Object {
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped {readonly [ P in keyof tstl.tstl/base/iterator/Iterator.Iterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, tstl.tstl/base/container/MapElementVector.MapElementVector.Iterator<Key, T, Unique, Source>, tstl.tstl/base/container/MapElementVector.MapElementVector.ReverseIterator<Key, T, Unique, Source>, tstl.tstl/utility/IPair.IPair<Key, T>> ]: tstl.tstl/base/iterator/Iterator.Iterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, tstl.tstl/base/container/MapElementVector.MapElementVector.Iterator<Key, T, Unique, Source>, tstl.tstl/base/container/MapElementVector.MapElementVector.ReverseIterator<Key, T, Unique, Source>, tstl.tstl/utility/IPair.IPair<Key, T>>[P]} */ @js.native
    class Iterator[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
        Key, 
        T, 
        Unique, 
        Source, 
        Iterator[Key, T, Unique, Source], 
        ReverseIterator[Key, T, Unique, Source]
      ] */] ()
      extends ArrayIteratorBase[
              Entry[Key, T], 
              Source, 
              MapElementVector[Key, T, Unique, Source], 
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
    
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped {readonly [ P in keyof tstl.tstl/base/iterator/ReverseIterator.IReverseIterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, tstl.tstl/base/container/MapElementVector.MapElementVector.Iterator<Key, T, Unique, Source>, tstl.tstl/base/container/MapElementVector.MapElementVector.ReverseIterator<Key, T, Unique, Source>, tstl.tstl/utility/IPair.IPair<Key, T>> ]: tstl.tstl/base/iterator/ReverseIterator.IReverseIterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, tstl.tstl/base/container/MapElementVector.MapElementVector.Iterator<Key, T, Unique, Source>, tstl.tstl/base/container/MapElementVector.MapElementVector.ReverseIterator<Key, T, Unique, Source>, tstl.tstl/utility/IPair.IPair<Key, T>>[P]} */ @js.native
    class ReverseIterator[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
        Key, 
        T, 
        Unique, 
        Source, 
        Iterator[Key, T, Unique, Source], 
        ReverseIterator[Key, T, Unique, Source]
      ] */] ()
      extends ArrayReverseIteratorBase[
              Entry[Key, T], 
              Source, 
              MapElementVector[Key, T, Unique, Source], 
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
        * The second, stored element.
        */
      /* CompleteClass */
      override var second: T = js.native
      /**
        * @inheritDoc
        */
      @JSName("first")
      def first_MReverseIterator(): Key = js.native
      /**
        * @inheritDoc
        */
      @JSName("second")
      def second_MReverseIterator(): T = js.native
      /**
        * @inheritDoc
        */
      @JSName("second")
      def second_MReverseIterator(`val`: T): js.Any = js.native
    }
    
  }
  
}


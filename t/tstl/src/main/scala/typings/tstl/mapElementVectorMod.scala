package typings.tstl

import typings.tstl.arrayIteratorBaseMod.ArrayIteratorBase
import typings.tstl.arrayReverseIteratorBaseMod.ArrayReverseIteratorBase
import typings.tstl.entryMod.Entry
import typings.tstl.ipairMod.IPair
import typings.tstl.itreemapMod.ITreeMap
import typings.tstl.mapContainerMod.MapContainer.IteratorBase
import typings.tstl.mapElementVectorMod.MapElementVector.Iterator
import typings.tstl.mapElementVectorMod.MapElementVector.ReverseIterator
import typings.tstl.vectorContainerMod.VectorContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/associative/MapElementVector", JSImport.Namespace)
@js.native
object mapElementVectorMod extends js.Object {
  @js.native
  class MapElementVector[Key, T, Unique /* <: Boolean */, Source /* <: ITreeMap[
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
          ReverseIterator[Key, T, Unique, Source]
        ] {
    def this(associative: Source) = this()
    var associative_ : js.Any = js.native
  }
  
  @js.native
  object MapElementVector extends js.Object {
    /**
      * Iterator of map container storing elements in a vector.
      *
      * @typeParam Key Key type
      * @typeParam T Mapped type
      * @typeParam Unique Whether duplicated key is blocked or not
      * @typeParam Source Source container type
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped {readonly [ P in keyof tstl.tstl/base/container/IContainer.IContainer.Iterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, tstl.tstl/internal/container/associative/MapElementVector.MapElementVector.Iterator<Key, T, Unique, Source>, tstl.tstl/internal/container/associative/MapElementVector.MapElementVector.ReverseIterator<Key, T, Unique, Source>, tstl.tstl/utility/IPair.IPair<Key, T>> ]: tstl.tstl/base/container/IContainer.IContainer.Iterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, tstl.tstl/internal/container/associative/MapElementVector.MapElementVector.Iterator<Key, T, Unique, Source>, tstl.tstl/internal/container/associative/MapElementVector.MapElementVector.ReverseIterator<Key, T, Unique, Source>, tstl.tstl/utility/IPair.IPair<Key, T>>[P]} */ @js.native
    class Iterator[Key, T, Unique /* <: Boolean */, Source /* <: ITreeMap[
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
      * Reverse iterator of map container storing elements in a vector.
      *
      * @typeParam Key Key type
      * @typeParam T Mapped type
      * @typeParam Unique Whether duplicated key is blocked or not
      * @typeParam Source Source container type
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped {readonly [ P in keyof tstl.tstl/base/container/IContainer.IContainer.ReverseIterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, tstl.tstl/internal/container/associative/MapElementVector.MapElementVector.Iterator<Key, T, Unique, Source>, tstl.tstl/internal/container/associative/MapElementVector.MapElementVector.ReverseIterator<Key, T, Unique, Source>, tstl.tstl/utility/IPair.IPair<Key, T>> ]: tstl.tstl/base/container/IContainer.IContainer.ReverseIterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, tstl.tstl/internal/container/associative/MapElementVector.MapElementVector.Iterator<Key, T, Unique, Source>, tstl.tstl/internal/container/associative/MapElementVector.MapElementVector.ReverseIterator<Key, T, Unique, Source>, tstl.tstl/utility/IPair.IPair<Key, T>>[P]} */ @js.native
    class ReverseIterator[Key, T, Unique /* <: Boolean */, Source /* <: ITreeMap[
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


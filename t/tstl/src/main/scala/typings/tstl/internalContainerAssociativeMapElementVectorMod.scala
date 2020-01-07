package typings.tstl

import typings.tstl.baseContainerITreeMapMod.ITreeMap
import typings.tstl.internalContainerAssociativeMapElementVectorMod.MapElementVector.Iterator
import typings.tstl.internalContainerAssociativeMapElementVectorMod.MapElementVector.ReverseIterator
import typings.tstl.internalContainerLinearVectorContainerMod.VectorContainer
import typings.tstl.internalIteratorArrayIteratorBaseMod.ArrayIteratorBase
import typings.tstl.internalIteratorArrayReverseIteratorBaseMod.ArrayReverseIteratorBase
import typings.tstl.utilityEntryMod.Entry
import typings.tstl.utilityIPairMod.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/associative/MapElementVector", JSImport.Namespace)
@js.native
object internalContainerAssociativeMapElementVectorMod extends js.Object {
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
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ITreeMap.Iterator<Key, T, Unique, Source, Iterator<Key, T, Unique, Source>, ReverseIterator<Key, T, Unique, Source>> * / any */ @js.native
    class Iterator[Key, T, Unique /* <: Boolean */, Source /* <: ITreeMap[
        Key, 
        T, 
        Unique, 
        Source, 
        Iterator[Key, T, Unique, Source], 
        ReverseIterator[Key, T, Unique, Source]
      ] */] () extends ArrayIteratorBase[
              Entry[Key, T], 
              Source, 
              MapElementVector[Key, T, Unique, Source], 
              Iterator[Key, T, Unique, Source], 
              ReverseIterator[Key, T, Unique, Source], 
              IPair[Key, T]
            ] {
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
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ITreeMap.ReverseIterator<Key, T, Unique, Source, Iterator<Key, T, Unique, Source>, ReverseIterator<Key, T, Unique, Source>> * / any */ @js.native
    class ReverseIterator[Key, T, Unique /* <: Boolean */, Source /* <: ITreeMap[
        Key, 
        T, 
        Unique, 
        Source, 
        Iterator[Key, T, Unique, Source], 
        ReverseIterator[Key, T, Unique, Source]
      ] */] () extends ArrayReverseIteratorBase[
              Entry[Key, T], 
              Source, 
              MapElementVector[Key, T, Unique, Source], 
              Iterator[Key, T, Unique, Source], 
              ReverseIterator[Key, T, Unique, Source], 
              IPair[Key, T]
            ] {
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
    
  }
  
}


package typings.tstl

import typings.tstl.baseContainerITreeSetMod.ITreeSet
import typings.tstl.internalContainerAssociativeSetElementVectorMod.SetElementVector.Iterator
import typings.tstl.internalContainerAssociativeSetElementVectorMod.SetElementVector.ReverseIterator
import typings.tstl.internalContainerLinearVectorContainerMod.VectorContainer
import typings.tstl.internalIteratorArrayIteratorBaseMod.ArrayIteratorBase
import typings.tstl.internalIteratorArrayReverseIteratorBaseMod.ArrayReverseIteratorBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/associative/SetElementVector", JSImport.Namespace)
@js.native
object internalContainerAssociativeSetElementVectorMod extends js.Object {
  @js.native
  class SetElementVector[Key, Unique /* <: Boolean */, Source /* <: ITreeSet[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] protected () extends VectorContainer[
          Key, 
          Source, 
          SetElementVector[Key, Unique, Source], 
          Iterator[Key, Unique, Source], 
          ReverseIterator[Key, Unique, Source]
        ] {
    def this(associative: Source) = this()
    var associative_ : js.Any = js.native
  }
  
  @js.native
  object SetElementVector extends js.Object {
    /**
      * Iterator of set container storing elements in a vector.
      *
      * @typeParam Key Key type
      * @typeParam Unique Whether duplicated key is blocked or not
      * @typeParam Source Source container type
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ITreeSet.Iterator<Key, Unique, Source, SetElementVector.Iterator<Key, Unique, Source>, SetElementVector.ReverseIterator<Key, Unique, Source>> * / any */ @js.native
    class Iterator[Key, Unique /* <: Boolean */, Source /* <: ITreeSet[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] () extends ArrayIteratorBase[
              Key, 
              Source, 
              SetElementVector[Key, Unique, Source], 
              Iterator[Key, Unique, Source], 
              ReverseIterator[Key, Unique, Source], 
              Key
            ]
    
    /**
      * Reverse iterator of set container storing elements in a vector.
      *
      * @typeParam Key Key type
      * @typeParam Unique Whether duplicated key is blocked or not
      * @typeParam Source Source container type
      *
      * @author Jeongho Nam - https://github.com/samchon
      */
    /* import warning: RemoveDifficultInheritance.summarizeChanges 
    - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ITreeSet.ReverseIterator<Key, Unique, Source, SetElementVector.Iterator<Key, Unique, Source>, SetElementVector.ReverseIterator<Key, Unique, Source>> * / any */ @js.native
    class ReverseIterator[Key, Unique /* <: Boolean */, Source /* <: ITreeSet[Key, Unique, Source, Iterator[Key, Unique, Source], ReverseIterator[Key, Unique, Source]] */] () extends ArrayReverseIteratorBase[
              Key, 
              Source, 
              SetElementVector[Key, Unique, Source], 
              Iterator[Key, Unique, Source], 
              ReverseIterator[Key, Unique, Source], 
              Key
            ]
    
  }
  
}


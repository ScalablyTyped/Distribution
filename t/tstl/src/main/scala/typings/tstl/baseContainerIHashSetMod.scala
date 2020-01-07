package typings.tstl

import typings.tstl.baseContainerSetContainerMod.SetContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/IHashSet", JSImport.Namespace)
@js.native
object baseContainerIHashSetMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IHashContainer<Key, Key, Source, SetElementList.Iterator<Key, Unique, Source>, SetElementList.ReverseIterator<Key, Unique, Source>, Key> * / any */ @js.native
  trait IHashSet[Key, Unique /* <: Boolean */, Source /* <: IHashSet[Key, Unique, Source] */]
    extends SetContainer[
          Key, 
          Unique, 
          Source, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetElementList.Iterator<Key, Unique, Source> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetElementList.ReverseIterator<Key, Unique, Source> */ js.Any
        ] {
    /**
      * Iterator to the first element in a specific bucket.
      *
      * @param index Index number of the specific bucket.
      * @return Iterator from the specific bucket.
      */
    def begin(index: Double): js.Any = js.native
    /**
      * Iterator to the end in a specific bucket.
      *
      * @param index Index number of the specific bucket.
      * @return Iterator from the specific bucket.
      */
    def end(index: Double): js.Any = js.native
  }
  
}


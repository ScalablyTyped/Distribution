package typings.tstl

import typings.tstl.baseContainerMapContainerMod.MapContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/IHashMap", JSImport.Namespace)
@js.native
object baseContainerIHashMapMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _IHashContainer<Key, Entry<Key, T>, Source, MapElementList.Iterator<Key, T, Unique, Source>, MapElementList.ReverseIterator<Key, T, Unique, Source>, IPair<Key, T>> * / any */ @js.native
  trait IHashMap[Key, T, Unique /* <: Boolean */, Source /* <: IHashMap[Key, T, Unique, Source] */]
    extends MapContainer[
          Key, 
          T, 
          Unique, 
          Source, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapElementList.Iterator<Key, T, Unique, Source> */ js.Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapElementList.ReverseIterator<Key, T, Unique, Source> */ js.Any
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


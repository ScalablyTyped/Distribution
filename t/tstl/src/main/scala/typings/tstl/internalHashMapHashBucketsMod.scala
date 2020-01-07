package typings.tstl

import typings.tstl.baseContainerIHashMapMod.IHashMap
import typings.tstl.internalFunctionalComparatorMod.Comparator
import typings.tstl.internalFunctionalHasherMod.Hasher
import typings.tstl.internalHashHashBucketsMod.HashBuckets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/hash/MapHashBuckets", JSImport.Namespace)
@js.native
object internalHashMapHashBucketsMod extends js.Object {
  @js.native
  class MapHashBuckets[Key, T, Unique /* <: Boolean */, Source /* <: IHashMap[Key, T, Unique, Source] */] protected ()
    extends HashBuckets[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IHashMap.Iterator<Key, T, Unique, Source> */ js.Any
        ] {
    /**
      * Initializer Constructor
      *
      * @param source Source map container
      * @param hash Hash function
      * @param pred Equality function
      */
    def this(source: IHashMap[Key, T, Unique, Source], hash: Hasher[Key], pred: Comparator[Key, Key]) = this()
    var hash_function_ : js.Any = js.native
    var key_eq_ : js.Any = js.native
    var source_ : js.Any = js.native
    def find(key: Key): js.Any = js.native
    def hash_function(): Hasher[Key] = js.native
    def key_eq(): Comparator[Key, Key] = js.native
  }
  
}


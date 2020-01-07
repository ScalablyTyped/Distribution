package typings.tstl

import typings.tstl.baseContainerIHashSetMod.IHashSet
import typings.tstl.internalFunctionalComparatorMod.Comparator
import typings.tstl.internalFunctionalHasherMod.Hasher
import typings.tstl.internalHashHashBucketsMod.HashBuckets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/hash/SetHashBuckets", JSImport.Namespace)
@js.native
object internalHashSetHashBucketsMod extends js.Object {
  @js.native
  class SetHashBuckets[Key, Unique /* <: Boolean */, Source /* <: IHashSet[Key, Unique, Source] */] protected ()
    extends HashBuckets[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IHashSet.Iterator<Key, Unique, Source> */ js.Any
        ] {
    def this(source: IHashSet[Key, Unique, Source], hash: Hasher[Key], pred: Comparator[Key, Key]) = this()
    var hash_function_ : js.Any = js.native
    var key_eq_ : js.Any = js.native
    var source_ : js.Any = js.native
    def find(`val`: Key): js.Any = js.native
    def hash_function(): Hasher[Key] = js.native
    def key_eq(): Comparator[Key, Key] = js.native
  }
  
}


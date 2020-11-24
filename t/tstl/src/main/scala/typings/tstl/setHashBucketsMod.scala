package typings.tstl

import typings.tstl.comparatorMod.Comparator
import typings.tstl.hashBucketsMod.HashBuckets
import typings.tstl.hasherMod.Hasher
import typings.tstl.ihashsetMod.IHashSet
import typings.tstl.ihashsetMod.IHashSet.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/hash/SetHashBuckets", JSImport.Namespace)
@js.native
object setHashBucketsMod extends js.Object {
  
  @js.native
  class SetHashBuckets[Key, Unique /* <: Boolean */, Source /* <: IHashSet[Key, Unique, Source] */] protected () extends HashBuckets[Key, Iterator[Key, Unique, Source]] {
    /**
      * Initializer Constructor
      *
      * @param source Source set container
      * @param hasher Hash function
      * @param pred Equality function
      */
    def this(source: IHashSet[Key, Unique, Source], hasher: Hasher[Key], pred: Comparator[Key, Key]) = this()
    
    def find(`val`: Key): Iterator[Key, Unique, Source] = js.native
    
    def key_eq(): Comparator[Key, Key] = js.native
    
    val key_eq_ : js.Any = js.native
    
    var source_ : js.Any = js.native
  }
}

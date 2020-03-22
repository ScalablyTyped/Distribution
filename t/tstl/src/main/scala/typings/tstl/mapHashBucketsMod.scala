package typings.tstl

import typings.tstl.comparatorMod.Comparator
import typings.tstl.hashBucketsMod.HashBuckets
import typings.tstl.hasherMod.Hasher
import typings.tstl.ihashmapMod.IHashMap
import typings.tstl.ihashmapMod.IHashMap.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/hash/MapHashBuckets", JSImport.Namespace)
@js.native
object mapHashBucketsMod extends js.Object {
  @js.native
  class MapHashBuckets[Key, T, Unique /* <: Boolean */, Source /* <: IHashMap[Key, T, Unique, Source] */] protected () extends HashBuckets[Iterator[Key, T, Unique, Source]] {
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
    def find(key: Key): Iterator[Key, T, Unique, Source] = js.native
    def hash_function(): Hasher[Key] = js.native
    def key_eq(): Comparator[Key, Key] = js.native
  }
  
  /* static members */
  @js.native
  object MapHashBuckets extends js.Object {
    /**
      * @internal
      */
    def _Swap_source[Key, T, Unique /* <: Boolean */, Source /* <: IHashMap[Key, T, Unique, Source] */](x: MapHashBuckets[Key, T, Unique, Source], y: MapHashBuckets[Key, T, Unique, Source]): Unit = js.native
  }
  
}


package typings.tstl

import typings.tstl.baseContainerIHashMapMod.IHashMap
import typings.tstl.baseContainerMapElementListMod.MapElementList.Iterator
import typings.tstl.baseHashUnderscoreHashBucketsMod._HashBuckets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/hash/_MapHashBuckets", JSImport.Namespace)
@js.native
object baseHashUnderscoreMapHashBucketsMod extends js.Object {
  @js.native
  class _MapHashBuckets[Key, T, Unique /* <: Boolean */, Source /* <: IHashMap[Key, T, Unique, Source] */] protected () extends _HashBuckets[Iterator[Key, T, Unique, Source]] {
    def this(
      source: IHashMap[Key, T, Unique, Source],
      hash: js.Function1[/* key */ Key, Double],
      pred: js.Function2[/* x */ Key, /* y */ Key, Boolean]
    ) = this()
    var hash_function_ : js.Any = js.native
    var key_eq_ : js.Any = js.native
    var source_ : js.Any = js.native
    def find(key: Key): Iterator[Key, T, Unique, Source] = js.native
    def hash_function(): js.Function1[/* key */ Key, Double] = js.native
    def key_eq(): js.Function2[/* x */ Key, /* y */ Key, Boolean] = js.native
  }
  
}


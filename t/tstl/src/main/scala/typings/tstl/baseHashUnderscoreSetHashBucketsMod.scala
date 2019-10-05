package typings.tstl

import typings.tstl.baseContainerIHashSetMod.IHashSet
import typings.tstl.baseContainerSetElementListMod.SetElementList.Iterator
import typings.tstl.baseHashUnderscoreHashBucketsMod._HashBuckets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/hash/_SetHashBuckets", JSImport.Namespace)
@js.native
object baseHashUnderscoreSetHashBucketsMod extends js.Object {
  @js.native
  class _SetHashBuckets[T, Unique /* <: Boolean */, Source /* <: IHashSet[T, Unique, Source] */] protected () extends _HashBuckets[Iterator[T, Unique, Source]] {
    def this(
      source: IHashSet[T, Unique, Source],
      hash: js.Function1[/* val */ T, Double],
      pred: js.Function2[/* x */ T, /* y */ T, Boolean]
    ) = this()
    var hash_function_ : js.Any = js.native
    var key_eq_ : js.Any = js.native
    var source_ : js.Any = js.native
    def find(`val`: T): Iterator[T, Unique, Source] = js.native
    def hash_function(): js.Function1[/* val */ T, Double] = js.native
    def key_eq(): js.Function2[/* x */ T, /* y */ T, Boolean] = js.native
  }
  
}


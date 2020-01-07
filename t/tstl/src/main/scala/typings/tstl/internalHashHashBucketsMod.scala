package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/hash/HashBuckets", JSImport.Namespace)
@js.native
object internalHashHashBucketsMod extends js.Object {
  @js.native
  abstract class HashBuckets[T] protected () extends js.Object {
    var buckets_ : js.Any = js.native
    var item_size_ : js.Any = js.native
    var max_load_factor_ : js.Any = js.native
    def at(index: Double): js.Array[T] = js.native
    def capacity(): Double = js.native
    def clear(): Unit = js.native
    def erase(`val`: T): Unit = js.native
    def hash_index(`val`: T): Double = js.native
    def insert(`val`: T): Unit = js.native
    def load_factor(): Double = js.native
    def max_load_factor(): Double = js.native
    def max_load_factor(z: Double): Unit = js.native
    def rehash(size: Double): Unit = js.native
    def reserve(size: Double): Unit = js.native
    def size(): Double = js.native
  }
  
}


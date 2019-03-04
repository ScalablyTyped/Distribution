package typings
package tstlLib.baseHashUnderscoreHashBucketsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/hash/_HashBuckets", "_HashBuckets")
@js.native
abstract class _HashBuckets[T] protected () extends js.Object {
  var buckets_ : js.Any = js.native
  var item_size_ : js.Any = js.native
  var max_load_factor_ : js.Any = js.native
  def at(index: scala.Double): js.Array[T] = js.native
  def capacity(): scala.Double = js.native
  def clear(): scala.Unit = js.native
  def erase(`val`: T): scala.Unit = js.native
  def hash_index(`val`: T): scala.Double = js.native
  def insert(`val`: T): scala.Unit = js.native
  def load_factor(): scala.Double = js.native
  def max_load_factor(): scala.Double = js.native
  def max_load_factor(z: scala.Double): scala.Unit = js.native
  def rehash(size: scala.Double): scala.Unit = js.native
  def reserve(size: scala.Double): scala.Unit = js.native
  def size(): scala.Double = js.native
}


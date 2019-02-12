package typings
package tstlLib.baseHashUnderscoreSetHashBucketsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/hash/_SetHashBuckets", "_SetHashBuckets")
@js.native
class _SetHashBuckets[T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerIHashSetMod.IHashSet[T, Unique, Source] */] protected ()
  extends tstlLib.baseHashUnderscoreHashBucketsMod._HashBuckets[tstlLib.baseIteratorSetIteratorMod.SetIterator[T, Unique, Source]] {
  def this(source: tstlLib.baseContainerIHashSetMod.IHashSet[T, Unique, Source], hash: js.Function1[/* val */ T, scala.Double], pred: js.Function2[/* x */ T, /* y */ T, scala.Boolean]) = this()
  var `hash_function_`: js.Any = js.native
  var `key_eq_`: js.Any = js.native
  var `source_`: js.Any = js.native
  def find(`val`: T): tstlLib.baseIteratorSetIteratorMod.SetIterator[T, Unique, Source] = js.native
  def hash_function(): js.Function1[/* val */ T, scala.Double] = js.native
  def key_eq(): js.Function2[/* x */ T, /* y */ T, scala.Boolean] = js.native
}


package typings
package tstlLib.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base", "MapReverseIterator")
@js.native
class MapReverseIterator[Key, T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source] */] protected ()
  extends tstlLib.baseIteratorMapIteratorMod.MapReverseIterator[Key, T, Unique, Source] {
  /**
    * Initializer Constructor.
    *
    * @param base The base iterator.
    */
  def this(base: tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source]) = this()
}


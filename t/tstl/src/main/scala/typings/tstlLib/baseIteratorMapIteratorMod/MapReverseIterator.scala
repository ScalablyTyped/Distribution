package typings
package tstlLib.baseIteratorMapIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/iterator/MapIterator", "MapReverseIterator")
@js.native
class MapReverseIterator[Key, T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source] */] protected ()
  extends tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[
      tstlLib.utilityEntryMod.Entry[Key, T], 
      Source, 
      MapIterator[Key, T, Unique, Source], 
      MapReverseIterator[Key, T, Unique, Source], 
      tstlLib.utilityIPairMod.IPair[Key, T]
    ] {
  /**
    * Initializer Constructor.
    *
    * @param base The base iterator.
    */
  def this(base: MapIterator[Key, T, Unique, Source]) = this()
  /**
    * Get the first, key element.
    *
    * @return The first element.
    */
  val first: Key = js.native
  /**
    * Get the second, stored element.
    *
    * @return The second element.
    */
  /**
    * Set the second, stored element.
    *
    * @param val The value to set.
    */
  var second: T = js.native
}


package typings
package tstlLib.baseIteratorMapIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/iterator/MapIterator", "MapIterator")
@js.native
class MapIterator[Key, T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source] */] protected ()
  extends tstlLib.baseIteratorListIteratorMod.ListIterator[
      tstlLib.utilityEntryMod.Entry[Key, T], 
      Source, 
      MapIterator[Key, T, Unique, Source], 
      MapReverseIterator[Key, T, Unique, Source], 
      tstlLib.utilityIPairMod.IPair[Key, T]
    ] {
  /**
    * @hidden
    */
  def this(list: tstlLib.baseContainerUnderscoreMapElementListMod._MapElementList[Key, T, Unique, Source], prev: MapIterator[Key, T, Unique, Source], next: MapIterator[Key, T, Unique, Source], `val`: tstlLib.utilityEntryMod.Entry[Key, T]) = this()
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
  /**
    * @hidden
    */
  var `source_`: js.Any = js.native
}


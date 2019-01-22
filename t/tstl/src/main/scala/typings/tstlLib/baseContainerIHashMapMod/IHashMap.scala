package typings
package tstlLib.baseContainerIHashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashMap[Key, T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source] */]
  extends tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source]
     with tstlLib.baseContainerUnderscoreIHashContainerMod._IHashContainer[Key] {
  /**
    * Iterator to the first element in a specific bucket.
    *
    * @param index Index number of the specific bucket.
    * @return Iterator from the specific bucket.
    */
  def begin(index: scala.Double): tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source] = js.native
  /**
    * Iterator to the end in a specific bucket.
    *
    * @param index Index number of the specific bucket.
    * @return Iterator from the specific bucket.
    */
  def end(index: scala.Double): tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source] = js.native
}


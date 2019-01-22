package typings
package tstlLib.baseContainerIHashSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashSet[T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerSetContainerMod.SetContainer[T, Unique, Source] */]
  extends tstlLib.baseContainerSetContainerMod.SetContainer[T, Unique, Source]
     with tstlLib.baseContainerUnderscoreIHashContainerMod._IHashContainer[T] {
  /**
    * Iterator to the first element in a specific bucket.
    *
    * @param index Index number of the specific bucket.
    * @return Iterator from the specific bucket.
    */
  def begin(index: scala.Double): tstlLib.baseIteratorSetIteratorMod.SetIterator[T, Unique, Source] = js.native
  /**
    * Iterator to the end in a specific bucket.
    *
    * @param index Index number of the specific bucket.
    * @return Iterator from the specific bucket.
    */
  def end(index: scala.Double): tstlLib.baseIteratorSetIteratorMod.SetIterator[T, Unique, Source] = js.native
}


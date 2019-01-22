package typings
package tstlLib.baseContainerITreeMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITreeMap[Key, T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source] */]
  extends tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source]
     with tstlLib.baseContainerUnderscoreITreeContainerMod._ITreeContainer[Key, tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source]] {
  /**
    * Get value comparison function.
    *
    * @return The value comparison function.
    */
  def value_comp(): js.Function2[
    /* x */ tstlLib.utilityIPairMod.IPair[Key, T], 
    /* y */ tstlLib.utilityIPairMod.IPair[Key, T], 
    scala.Boolean
  ] = js.native
}


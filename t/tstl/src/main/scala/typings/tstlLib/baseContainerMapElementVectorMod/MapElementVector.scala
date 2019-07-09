package typings
package tstlLib.baseContainerMapElementVectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MapElementVector", "MapElementVector")
@js.native
class MapElementVector[Key, T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerMapContainerMod.MapContainer[
Key, 
T, 
Unique, 
Source, 
tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[Key, T, Unique, Source], 
tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[Key, T, Unique, Source]] */] protected ()
  extends tstlLib.baseContainerVectorContainerMod.VectorContainer[
      tstlLib.utilityEntryMod.Entry[Key, T], 
      Source, 
      MapElementVector[Key, T, Unique, Source], 
      tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator[Key, T, Unique, Source], 
      tstlLib.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator[Key, T, Unique, Source], 
      tstlLib.utilityIPairMod.IPair[Key, T]
    ] {
  def this(associative: Source) = this()
  var associative_ : js.Any = js.native
  def associative(): Source = js.native
}


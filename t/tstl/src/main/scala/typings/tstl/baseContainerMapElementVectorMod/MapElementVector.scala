package typings.tstl.baseContainerMapElementVectorMod

import typings.tstl.baseContainerMapContainerMod.MapContainer
import typings.tstl.baseContainerMapElementVectorMod.MapElementVectorNs.Iterator
import typings.tstl.baseContainerMapElementVectorMod.MapElementVectorNs.ReverseIterator
import typings.tstl.baseContainerVectorContainerMod.VectorContainer
import typings.tstl.utilityEntryMod.Entry
import typings.tstl.utilityIPairMod.IPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MapElementVector", "MapElementVector")
@js.native
class MapElementVector[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
Key, 
T, 
Unique, 
Source, 
Iterator[Key, T, Unique, Source], 
ReverseIterator[Key, T, Unique, Source]] */] protected () extends VectorContainer[
      Entry[Key, T], 
      Source, 
      MapElementVector[Key, T, Unique, Source], 
      Iterator[Key, T, Unique, Source], 
      ReverseIterator[Key, T, Unique, Source], 
      IPair[Key, T]
    ] {
  def this(associative: Source) = this()
  var associative_ : js.Any = js.native
  def associative(): Source = js.native
}


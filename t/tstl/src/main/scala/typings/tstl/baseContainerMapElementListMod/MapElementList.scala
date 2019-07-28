package typings.tstl.baseContainerMapElementListMod

import typings.tstl.baseContainerListContainerMod.ListContainer
import typings.tstl.baseContainerMapContainerMod.MapContainer
import typings.tstl.baseContainerMapElementListMod.MapElementListNs.Iterator
import typings.tstl.baseContainerMapElementListMod.MapElementListNs.ReverseIterator
import typings.tstl.utilityEntryMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MapElementList", "MapElementList")
@js.native
class MapElementList[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
Key, 
T, 
Unique, 
Source, 
Iterator[Key, T, Unique, Source], 
ReverseIterator[Key, T, Unique, Source]] */] protected () extends ListContainer[
      Entry[Key, T], 
      Source, 
      Iterator[Key, T, Unique, Source], 
      ReverseIterator[Key, T, Unique, Source]
    ] {
  def this(associative: Source) = this()
  /**
    * @hidden
    */
  var associative_ : js.Any = js.native
  def associative(): Source = js.native
}


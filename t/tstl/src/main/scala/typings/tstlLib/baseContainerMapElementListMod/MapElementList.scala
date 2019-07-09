package typings
package tstlLib.baseContainerMapElementListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MapElementList", "MapElementList")
@js.native
class MapElementList[Key, T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerMapContainerMod.MapContainer[
Key, 
T, 
Unique, 
Source, 
tstlLib.baseContainerMapElementListMod.MapElementListNs.Iterator[Key, T, Unique, Source], 
tstlLib.baseContainerMapElementListMod.MapElementListNs.ReverseIterator[Key, T, Unique, Source]] */] protected ()
  extends tstlLib.baseContainerListContainerMod.ListContainer[
      tstlLib.utilityEntryMod.Entry[Key, T], 
      Source, 
      tstlLib.baseContainerMapElementListMod.MapElementListNs.Iterator[Key, T, Unique, Source], 
      tstlLib.baseContainerMapElementListMod.MapElementListNs.ReverseIterator[Key, T, Unique, Source]
    ] {
  def this(associative: Source) = this()
  /**
    * @hidden
    */
  var associative_ : js.Any = js.native
  def associative(): Source = js.native
}


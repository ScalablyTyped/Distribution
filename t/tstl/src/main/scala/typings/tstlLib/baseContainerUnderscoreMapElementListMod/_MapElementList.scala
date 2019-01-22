package typings
package tstlLib.baseContainerUnderscoreMapElementListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/_MapElementList", "_MapElementList")
@js.native
class _MapElementList[Key, T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source] */] protected ()
  extends tstlLib.baseContainerListContainerMod.ListContainer[
      tstlLib.utilityEntryMod.Entry[Key, T], 
      Source, 
      tstlLib.baseIteratorMapIteratorMod.MapIterator[Key, T, Unique, Source], 
      tstlLib.baseIteratorMapIteratorMod.MapReverseIterator[Key, T, Unique, Source]
    ] {
  def this(associative: Source) = this()
  /**
    * @hidden
    */
  var `associative_`: js.Any = js.native
  def associative(): Source = js.native
}


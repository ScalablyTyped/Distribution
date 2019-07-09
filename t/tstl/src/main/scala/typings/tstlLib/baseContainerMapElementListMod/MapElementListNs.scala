package typings
package tstlLib.baseContainerMapElementListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MapElementList", "MapElementList")
@js.native
object MapElementListNs extends js.Object {
  @js.native
  /**
    * @hidden
    */
  class Iterator[Key, T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerMapContainerMod.MapContainer[
    Key, 
    T, 
    Unique, 
    Source, 
    Iterator[Key, T, Unique, Source], 
    ReverseIterator[Key, T, Unique, Source]
  ] */] protected ()
    extends tstlLib.baseIteratorListIteratorMod.ListIterator[
          tstlLib.utilityEntryMod.Entry[Key, T], 
          Source, 
          Iterator[Key, T, Unique, Source], 
          ReverseIterator[Key, T, Unique, Source], 
          tstlLib.utilityIPairMod.IPair[Key, T]
        ]
       with tstlLib.baseIteratorIMapIteratorMod.IMapIterator[
          Key, 
          T, 
          Unique, 
          Source, 
          Iterator[Key, T, Unique, Source], 
          ReverseIterator[Key, T, Unique, Source]
        ] {
    /**
      * The first, key element.
      */
    /* CompleteClass */
    override val first: Key = js.native
    /**
      * @hidden
      */
    var list_ : js.Any = js.native
    /**
      * The second, stored element.
      */
    /* CompleteClass */
    override var second: T = js.native
  }
  
  @js.native
  class ReverseIterator[Key, T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerMapContainerMod.MapContainer[
    Key, 
    T, 
    Unique, 
    Source, 
    Iterator[Key, T, Unique, Source], 
    ReverseIterator[Key, T, Unique, Source]
  ] */] ()
    extends tstlLib.baseIteratorReverseIteratorMod.ReverseIterator[
          tstlLib.utilityEntryMod.Entry[Key, T], 
          Source, 
          Iterator[Key, T, Unique, Source], 
          ReverseIterator[Key, T, Unique, Source], 
          tstlLib.utilityIPairMod.IPair[Key, T]
        ] {
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
  
}


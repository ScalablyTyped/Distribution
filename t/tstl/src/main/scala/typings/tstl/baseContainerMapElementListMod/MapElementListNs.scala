package typings.tstl.baseContainerMapElementListMod

import typings.tstl.baseContainerMapContainerMod.MapContainer
import typings.tstl.baseContainerMapElementListMod.MapElementListNs.Iterator
import typings.tstl.baseContainerMapElementListMod.MapElementListNs.ReverseIterator
import typings.tstl.baseIteratorIMapIteratorMod.IMapIterator
import typings.tstl.baseIteratorListIteratorMod.ListIterator
import typings.tstl.utilityEntryMod.Entry
import typings.tstl.utilityIPairMod.IPair
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
  class Iterator[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
    Key, 
    T, 
    Unique, 
    Source, 
    Iterator[Key, T, Unique, Source], 
    ReverseIterator[Key, T, Unique, Source]
  ] */] protected ()
    extends ListIterator[
          Entry[Key, T], 
          Source, 
          Iterator[Key, T, Unique, Source], 
          ReverseIterator[Key, T, Unique, Source], 
          IPair[Key, T]
        ]
       with IMapIterator[
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
  class ReverseIterator[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[
    Key, 
    T, 
    Unique, 
    Source, 
    Iterator[Key, T, Unique, Source], 
    ReverseIterator[Key, T, Unique, Source]
  ] */] ()
    extends typings.tstl.baseIteratorReverseIteratorMod.ReverseIterator[
          Entry[Key, T], 
          Source, 
          Iterator[Key, T, Unique, Source], 
          ReverseIterator[Key, T, Unique, Source], 
          IPair[Key, T]
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


package typings
package tstlLib.baseContainerMapElementVectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MapElementVector", "MapElementVector")
@js.native
object MapElementVectorNs extends js.Object {
  @js.native
  class Iterator[Key, T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerMapContainerMod.MapContainer[
    Key, 
    T, 
    Unique, 
    Source, 
    Iterator[Key, T, Unique, Source], 
    ReverseIterator[Key, T, Unique, Source]
  ] */] ()
    extends tstlLib.baseIteratorArrayIteratorBaseMod.ArrayIteratorBase[
          tstlLib.utilityEntryMod.Entry[Key, T], 
          Source, 
          tstlLib.baseContainerMapElementVectorMod.MapElementVector[Key, T, Unique, Source], 
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
    extends tstlLib.baseIteratorArrayIteratorBaseMod.ArrayReverseIteratorBase[
          tstlLib.utilityEntryMod.Entry[Key, T], 
          Source, 
          tstlLib.baseContainerMapElementVectorMod.MapElementVector[Key, T, Unique, Source], 
          Iterator[Key, T, Unique, Source], 
          ReverseIterator[Key, T, Unique, Source], 
          tstlLib.utilityIPairMod.IPair[Key, T]
        ]
       with tstlLib.baseIteratorIMapIteratorMod.IMapReverseIterator[
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
      * The second, stored element.
      */
    /* CompleteClass */
    override var second: T = js.native
  }
  
}


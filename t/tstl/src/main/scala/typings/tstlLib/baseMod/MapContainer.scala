package typings
package tstlLib.baseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base", "MapContainer")
@js.native
abstract class MapContainer[Key, T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: tstlLib.baseIteratorIMapIteratorMod.IMapIterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: tstlLib.baseIteratorIMapIteratorMod.IMapReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */] protected ()
  extends tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] {
  /**
    * Default Constructor.
    */
  protected def this(factory: js.Function1[
      /* thisArg */ Source, 
      tstlLib.baseContainerILinearContainerMod.ILinearContainer[
        tstlLib.utilityEntryMod.Entry[Key, T], 
        Source, 
        IteratorT, 
        ReverseT, 
        tstlLib.utilityEntryMod.Entry[Key, T]
      ]
    ]) = this()
}


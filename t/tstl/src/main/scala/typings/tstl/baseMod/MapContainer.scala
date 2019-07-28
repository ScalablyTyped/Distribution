package typings.tstl.baseMod

import typings.tstl.baseContainerILinearContainerMod.ILinearContainer
import typings.tstl.baseIteratorIMapIteratorMod.IMapIterator
import typings.tstl.baseIteratorIMapIteratorMod.IMapReverseIterator
import typings.tstl.utilityEntryMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base", "MapContainer")
@js.native
abstract class MapContainer[Key, T, Unique /* <: Boolean */, Source /* <: typings.tstl.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: IMapIterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: IMapReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */] protected ()
  extends typings.tstl.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] {
  /**
    * Default Constructor.
    */
  protected def this(factory: js.Function1[
        /* thisArg */ Source, 
        ILinearContainer[Entry[Key, T], Source, IteratorT, ReverseT, Entry[Key, T]]
      ]) = this()
}


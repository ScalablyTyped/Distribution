package typings
package tstlLib.baseContainerMultiMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MultiMap", "MultiMap")
@js.native
abstract class MultiMap[Key, T, Source /* <: MultiMap[Key, T, Source, Iterator, Reverse] */, Iterator /* <: tstlLib.baseIteratorIMapIteratorMod.IMapIterator[Key, T, tstlLib.tstlLibNumbers.`false`, Source, Iterator, Reverse] */, Reverse /* <: tstlLib.baseIteratorIMapIteratorMod.IMapReverseIterator[Key, T, tstlLib.tstlLibNumbers.`false`, Source, Iterator, Reverse] */] ()
  extends tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, tstlLib.tstlLibNumbers.`false`, Source, Iterator, Reverse] {
  /**
    * @hidden
    */
  /* protected */ def _Key_eq(x: Key, y: Key): scala.Boolean = js.native
}


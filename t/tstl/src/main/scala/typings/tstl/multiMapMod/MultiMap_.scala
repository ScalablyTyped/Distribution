package typings.tstl.multiMapMod

import typings.tstl.mapContainerMod.MapContainer
import typings.tstl.multiMapMod.MultiMap.Iterator
import typings.tstl.multiMapMod.MultiMap.ReverseIterator
import typings.tstl.tstlBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/MultiMap", "MultiMap")
@js.native
abstract class MultiMap_[Key, T, Source /* <: MultiMap[Key, T, Source, Iterator, Reverse] */, Iterator /* <: Iterator[Key, T, Source, Iterator, Reverse] */, Reverse /* <: ReverseIterator[Key, T, Source, Iterator, Reverse] */] () extends MapContainer[Key, T, `false`, Source, Iterator, Reverse] {
  /* protected */ def _Key_eq(x: Key, y: Key): Boolean = js.native
}


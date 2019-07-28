package typings.tstl.baseContainerMapContainerMod

import typings.tstl.baseContainerMapContainerMod.MapContainer
import typings.tstl.baseIteratorIMapIteratorMod.IMapIterator
import typings.tstl.baseIteratorIMapIteratorMod.IMapReverseIterator
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MapContainerNs {
  type InsertRet[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[Key, T, Unique, Source, Iterator, Reverse] */, Iterator /* <: IMapIterator[Key, T, Unique, Source, Iterator, Reverse] */, Reverse /* <: IMapReverseIterator[Key, T, Unique, Source, Iterator, Reverse] */] = Iterator | (Pair[Iterator, Boolean])
}

package typings.tstl.mapContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object MapContainer {
  
  type InsertRet[Key, T, Unique /* <: scala.Boolean */, SourceT /* <: typings.tstl.mapContainerMod.MapContainer[Key, T, Unique, SourceT, IteratorT, Reverse] */, IteratorT /* <: typings.tstl.mapContainerMod.MapContainer.Iterator[Key, T, Unique, SourceT, IteratorT, Reverse] */, Reverse /* <: typings.tstl.mapContainerMod.MapContainer.ReverseIterator[Key, T, Unique, SourceT, IteratorT, Reverse] */] = IteratorT | (typings.tstl.pairMod.Pair[IteratorT, scala.Boolean])
}

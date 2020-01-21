package typings.tstl.mapContainerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MapContainer {
  type InsertRet[Key, T, Unique /* <: scala.Boolean */, SourceT /* <: typings.tstl.mapContainerMod.MapContainer[Key, T, Unique, SourceT, IteratorT, Reverse] */, IteratorT /* <: typings.tstl.mapContainerMod.MapContainer.Iterator[Key, T, Unique, SourceT, IteratorT, Reverse] */, Reverse /* <: typings.tstl.mapContainerMod.MapContainer.ReverseIterator[Key, T, Unique, SourceT, IteratorT, Reverse] */] = IteratorT | (typings.tstl.pairMod.Pair[IteratorT, scala.Boolean])
  type Iterator[Key, T, Unique /* <: scala.Boolean */, SourceT /* <: typings.tstl.mapContainerMod.MapContainer[Key, T, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/container/MapContainer.MapContainer.Iterator<Key, T, Unique, SourceT, IteratorT, ReverseT> */ js.Object */, ReverseT /* <: typings.tstl.mapContainerMod.MapContainer.ReverseIterator[Key, T, Unique, SourceT, IteratorT, ReverseT] */] = (typings.tstl.mapContainerMod.MapContainer.IteratorBase[Key, T]) with (typings.tstl.icontainerMod.IContainer.Iterator[
    typings.tstl.entryMod.Entry[Key, T], 
    SourceT, 
    IteratorT, 
    ReverseT, 
    typings.tstl.ipairMod.IPair[Key, T]
  ])
  type ReverseIterator[Key, T, Unique /* <: scala.Boolean */, SourceT /* <: typings.tstl.mapContainerMod.MapContainer[Key, T, Unique, SourceT, IteratorT, ReverseT] */, IteratorT /* <: typings.tstl.mapContainerMod.MapContainer.Iterator[Key, T, Unique, SourceT, IteratorT, ReverseT] */, ReverseT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/container/MapContainer.MapContainer.ReverseIterator<Key, T, Unique, SourceT, IteratorT, ReverseT> */ js.Object */] = (typings.tstl.mapContainerMod.MapContainer.IteratorBase[Key, T]) with (typings.tstl.icontainerMod.IContainer.ReverseIterator[
    typings.tstl.entryMod.Entry[Key, T], 
    SourceT, 
    IteratorT, 
    ReverseT, 
    typings.tstl.ipairMod.IPair[Key, T]
  ])
}

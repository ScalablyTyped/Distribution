package typings
package tstlLib.baseIteratorIMapIteratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {readonly [ P in keyof tstl.tstl/base/iterator/ReverseIterator.IReverseIterator<tstl.tstl/utility/Entry.Entry<Key, tstl.tstl/base/iterator/ReverseIterator.IReverseIterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, IteratorT, ReverseT, tstl.tstl/utility/IPair.IPair<Key, T>>>, Source, IteratorT, ReverseT, tstl.tstl/utility/IPair.IPair<Key, tstl.tstl/base/iterator/ReverseIterator.IReverseIterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, IteratorT, ReverseT, tstl.tstl/utility/IPair.IPair<Key, T>>>> ]: tstl.tstl/base/iterator/ReverseIterator.IReverseIterator<tstl.tstl/utility/Entry.Entry<Key, tstl.tstl/base/iterator/ReverseIterator.IReverseIterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, IteratorT, ReverseT, tstl.tstl/utility/IPair.IPair<Key, T>>>, Source, IteratorT, ReverseT, tstl.tstl/utility/IPair.IPair<Key, tstl.tstl/base/iterator/ReverseIterator.IReverseIterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, IteratorT, ReverseT, tstl.tstl/utility/IPair.IPair<Key, T>>>>[P]} */ trait IMapReverseIterator[Key, T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: IMapIterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: IMapReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */] extends IMapIteratorBase[Key, T]

object IMapReverseIterator {
  @scala.inline
  def apply[Key, T, Unique /* <: scala.Boolean */, Source /* <: tstlLib.baseContainerMapContainerMod.MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: IMapIterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: IMapReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */](first: Key, second: T): IMapReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMapReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT]]
  }
}


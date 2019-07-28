package typings.tstl.baseIteratorIMapIteratorMod

import typings.tstl.baseContainerMapContainerMod.MapContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {readonly [ P in keyof tstl.tstl/base/iterator/Iterator.Iterator<tstl.tstl/utility/Entry.Entry<Key, tstl.tstl/base/iterator/Iterator.Iterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, IteratorT, ReverseT, tstl.tstl/utility/IPair.IPair<Key, T>>>, Source, IteratorT, ReverseT, tstl.tstl/utility/IPair.IPair<Key, tstl.tstl/base/iterator/Iterator.Iterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, IteratorT, ReverseT, tstl.tstl/utility/IPair.IPair<Key, T>>>> ]: tstl.tstl/base/iterator/Iterator.Iterator<tstl.tstl/utility/Entry.Entry<Key, tstl.tstl/base/iterator/Iterator.Iterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, IteratorT, ReverseT, tstl.tstl/utility/IPair.IPair<Key, T>>>, Source, IteratorT, ReverseT, tstl.tstl/utility/IPair.IPair<Key, tstl.tstl/base/iterator/Iterator.Iterator<tstl.tstl/utility/Entry.Entry<Key, T>, Source, IteratorT, ReverseT, tstl.tstl/utility/IPair.IPair<Key, T>>>>[P]} */ trait IMapIterator[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: IMapIterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: IMapReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */] extends IMapIteratorBase[Key, T]

object IMapIterator {
  @scala.inline
  def apply[Key, T, Unique /* <: Boolean */, Source /* <: MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: IMapIterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: IMapReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */](first: Key, second: T): IMapIterator[Key, T, Unique, Source, IteratorT, ReverseT] = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMapIterator[Key, T, Unique, Source, IteratorT, ReverseT]]
  }
}


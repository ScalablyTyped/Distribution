package typings.tstl

import typings.tstl.comparatorMod.Comparator
import typings.tstl.ipairMod.IPair
import typings.tstl.itreemapMod.ITreeMap.Iterator
import typings.tstl.itreemapMod.ITreeMap.ReverseIterator
import typings.tstl.mapContainerMod.MapContainer
import typings.tstl.pairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/ITreeMap", JSImport.Namespace)
@js.native
object itreemapMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.tstl.isizeMod.ISize because Already inherited
  - typings.tstl.iforwardcontainerMod.IForwardContainer because Already inherited
  - typings.tstl.ipushMod.IPush because Already inherited
  - typings.tstl.iemptyMod.IEmpty because Already inherited
  - typings.std.Iterable because Already inherited
  - typings.tstl.ibidirectionalcontainerMod.IBidirectionalContainer because Already inherited
  - typings.tstl.icontainerMod.IContainer because Already inherited
  - typings.tstl.iassociativecontainerMod.IAssociativeContainer because Already inherited
  - typings.tstl.itreecontainerMod.ITreeContainer because var conflicts: iterator. Inlined key_comp, value_comp, lower_bound, upper_bound, equal_range */ @js.native
  trait ITreeMap[Key, T, Unique /* <: Boolean */, Source /* <: ITreeMap[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */] extends MapContainer[Key, T, Unique, Source, IteratorT, ReverseT] {
    /**
      * Get range of equal elements.
      *
      * @param key Key to search for.
      * @return Pair of {@link lower_bound} and {@link upper_bound}.
      */
    def equal_range(key: Key): Pair[IteratorT, IteratorT] = js.native
    /**
      * Get key comparison function.
      *
      * @return The key comparison function.
      */
    def key_comp(): Comparator[Key, Key] = js.native
    /**
      * Get iterator to lower bound.
      *
      * @param key Key to search for.
      * @return Iterator to the first element equal or after to the key.
      */
    def lower_bound(key: Key): IteratorT = js.native
    /**
      * Get iterator to upper bound.
      *
      * @param key Key to search for.
      * @return Iterator to the first element after the key.
      */
    def upper_bound(key: Key): IteratorT = js.native
    /**
      * Get value comparison function.
      *
      * @return The value comparison function.
      */
    def value_comp(): Comparator[IPair[Key, T], IPair[Key, T]] = js.native
  }
  
  @js.native
  object ITreeMap extends js.Object {
    /**
      * Iterator of {@link ITreeMap}
      *
      * @author Jenogho Nam <http://samchon.org>
      */
    type Iterator[Key, T, Unique /* <: Boolean */, Source /* <: ITreeMap[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/container/ITreeMap.ITreeMap.Iterator<Key, T, Unique, Source, IteratorT, ReverseT> */ js.Object */, ReverseT /* <: ReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT] */] = typings.tstl.mapContainerMod.MapContainer.Iterator[Key, T, Unique, Source, IteratorT, ReverseT]
    /**
      * Reverse iterator of {@link ITreeMap}
      *
      * @author Jenogho Nam <http://samchon.org>
      */
    type ReverseIterator[Key, T, Unique /* <: Boolean */, Source /* <: ITreeMap[Key, T, Unique, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Unique, Source, IteratorT, ReverseT] */, ReverseT /* <: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias tstl.tstl/base/container/ITreeMap.ITreeMap.ReverseIterator<Key, T, Unique, Source, IteratorT, ReverseT> */ js.Object */] = typings.tstl.mapContainerMod.MapContainer.ReverseIterator[Key, T, Unique, Source, IteratorT, ReverseT]
  }
  
}


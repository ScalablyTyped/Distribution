package typings.tstl

import typings.tstl.comparatorMod.Comparator
import typings.tstl.ipairMod.IPair
import typings.tstl.pairMod.Pair
import typings.tstl.uniqueMapMod.UniqueMap
import typings.tstl.uniqueMapMod.UniqueMap.Iterator
import typings.tstl.uniqueMapMod.UniqueMap.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/associative/UniqueTreeMap", JSImport.Namespace)
@js.native
object uniqueTreeMapMod extends js.Object {
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
  abstract class UniqueTreeMap[Key, T, Source /* <: UniqueTreeMap[Key, T, Source, IteratorT, ReverseT] */, IteratorT /* <: Iterator[Key, T, Source, IteratorT, ReverseT] */, ReverseT /* <: ReverseIterator[Key, T, Source, IteratorT, ReverseT] */] () extends UniqueMap[Key, T, Source, IteratorT, ReverseT] {
    /* protected */ def _Key_eq(x: Key, y: Key): Boolean = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get range of equal elements.
      *
      * @param key Key to search for.
      * @return Pair of {@link lower_bound} and {@link upper_bound}.
      */
    def equal_range(key: Key): Pair[IteratorT, IteratorT] = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get key comparison function.
      *
      * @return The key comparison function.
      */
    def key_comp(): Comparator[Key, Key] = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get iterator to lower bound.
      *
      * @param key Key to search for.
      * @return Iterator to the first element equal or after to the key.
      */
    def lower_bound(key: Key): IteratorT = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get iterator to upper bound.
      *
      * @param key Key to search for.
      * @return Iterator to the first element after the key.
      */
    def upper_bound(key: Key): IteratorT = js.native
    /**
      * @inheritDoc
      */
    /**
      * Get value comparison function.
      *
      * @return The value comparison function.
      */
    def value_comp(): Comparator[IPair[Key, T], IPair[Key, T]] = js.native
  }
  
}


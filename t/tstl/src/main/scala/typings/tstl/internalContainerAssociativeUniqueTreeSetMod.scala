package typings.tstl

import typings.tstl.baseContainerUniqueSetMod.UniqueSet
import typings.tstl.internalFunctionalComparatorMod.Comparator
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/associative/UniqueTreeSet", JSImport.Namespace)
@js.native
object internalContainerAssociativeUniqueTreeSetMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.std.Iterable because Already inherited
  - typings.tstl.baseContainerIContainerMod.IContainer because Already inherited
  - typings.tstl.internalContainerAssociativeIAssociativeContainerMod.IAssociativeContainer because var conflicts: iterator. Inlined 
  - typings.tstl.internalContainerAssociativeITreeContainerMod.ITreeContainer because var conflicts: iterator. Inlined key_comp, value_comp, lower_bound, upper_bound, equal_range */ @js.native
  abstract class UniqueTreeSet[Key, Source /* <: UniqueTreeSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UniqueSet.Iterator<Key, Source, IteratorT, ReverseT> */ js.Any */, ReverseT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UniqueSet.ReverseIterator<Key, Source, IteratorT, ReverseT> */ js.Any */] () extends UniqueSet[Key, Source, IteratorT, ReverseT] {
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
    def value_comp(): Comparator[Key, Key] = js.native
  }
  
}


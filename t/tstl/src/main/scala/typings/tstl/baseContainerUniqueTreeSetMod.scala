package typings.tstl

import typings.tstl.baseContainerUniqueSetMod.UniqueSet
import typings.tstl.baseContainerUniqueTreeSetMod.UniqueTreeSet
import typings.tstl.baseIteratorISetIteratorMod.ISetIterator
import typings.tstl.baseIteratorISetIteratorMod.ISetReverseIterator
import typings.tstl.tstlNumbers.`true`
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/UniqueTreeSet", JSImport.Namespace)
@js.native
object baseContainerUniqueTreeSetMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.tstl.baseDisposableIForwardContainerMod.IForwardContainer because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._IPush because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._ISize because Already inherited
  - typings.tstl.baseDisposableIPartialContainersMod._IEmpty because Already inherited
  - typings.std.Iterable because Already inherited
  - typings.tstl.baseDisposableIBidirectionalContainerMod.IBidirectionalContainer because Already inherited
  - typings.tstl.baseContainerIContainerMod.IContainer because Already inherited
  - typings.tstl.baseContainerUnderscoreIAssociativeContainerMod._IAssociativeContainer because Already inherited
  - typings.tstl.baseContainerUnderscoreITreeContainerMod._ITreeContainer because var conflicts: iterator. Inlined key_comp, value_comp, lower_bound, upper_bound, equal_range */ @js.native
  abstract class UniqueTreeSet[Key, Source /* <: UniqueTreeSet[Key, Source, IteratorT, ReverseT] */, IteratorT /* <: ISetIterator[Key, `true`, Source, IteratorT, ReverseT] */, ReverseT /* <: ISetReverseIterator[Key, `true`, Source, IteratorT, ReverseT] */] () extends UniqueSet[Key, Source, IteratorT, ReverseT] {
    /**
      * @hidden
      */
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
    def key_comp(): js.Function2[/* x */ Key, /* y */ Key, Boolean] = js.native
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
    def value_comp(): js.Function2[/* x */ Key, /* y */ Key, Boolean] = js.native
  }
  
}


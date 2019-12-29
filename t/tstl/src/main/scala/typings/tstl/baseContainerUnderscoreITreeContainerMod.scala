package typings.tstl

import org.scalablytyped.runtime.Instantiable1
import typings.tstl.baseContainerUnderscoreIAssociativeContainerMod._IAssociativeContainer
import typings.tstl.baseIteratorIteratorMod.Iterator
import typings.tstl.baseIteratorReverseIteratorMod.IReverseIterator
import typings.tstl.utilityPairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/_ITreeContainer", JSImport.Namespace)
@js.native
object baseContainerUnderscoreITreeContainerMod extends js.Object {
  /**
    * @hidden
    */
  @js.native
  trait _Factory[T, Arguments /* <: js.Array[_] */] extends Instantiable1[/* args */ Arguments, T]
  
  @js.native
  trait _ITreeContainer[Key, T /* <: Elem */, SourceT /* <: _ITreeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: IReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem] extends _IAssociativeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] {
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
    def key_comp(): js.Function2[/* x */ Key, /* y */ Key, Boolean] = js.native
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
    def value_comp(): js.Function2[/* x */ Elem, /* y */ Elem, Boolean] = js.native
  }
  
  def _Construct[Key, T /* <: Elem */, SourceT /* <: _ITreeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: IReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem](
    source: SourceT,
    Source: _Factory[SourceT, js.Array[_]],
    treeFactory: js.Function1[/* comp */ js.Function2[/* x */ Key, /* y */ Key, Boolean], Unit],
    args: js.Any*
  ): Unit = js.native
  def _Emplacable[Key, T /* <: Elem */, SourceT /* <: _ITreeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: IReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem](source: SourceT, hint: IteratorT, elem: T): Boolean = js.native
}


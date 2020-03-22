package typings.tstl

import org.scalablytyped.runtime.Instantiable1
import typings.tstl.comparatorMod.Comparator
import typings.tstl.iassociativecontainerMod.IAssociativeContainer
import typings.tstl.icontainerMod.IContainer.Iterator
import typings.tstl.icontainerMod.IContainer.ReverseIterator
import typings.tstl.pairMod.Pair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/associative/ITreeContainer", JSImport.Namespace)
@js.native
object itreecontainerMod extends js.Object {
  @js.native
  trait ITreeContainer[Key, T /* <: Elem */, SourceT /* <: ITreeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem] extends IAssociativeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] {
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
    def value_comp(): Comparator[Elem, Elem] = js.native
  }
  
  @js.native
  object ITreeContainer extends js.Object {
    /**
      * @internal
      */
    @js.native
    trait Factory[T, Arguments /* <: js.Array[_] */] extends Instantiable1[/* args */ Arguments, T]
    
    def construct[Key, T /* <: Elem */, SourceT /* <: ITreeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem](
      source: SourceT,
      Source: Factory[SourceT, js.Array[_]],
      treeFactory: js.Function1[/* comp */ Comparator[Key, Key], Unit],
      args: js.Any*
    ): Unit = js.native
    def emplacable[Key, T /* <: Elem */, SourceT /* <: ITreeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem](source: SourceT, hint: IteratorT, elem: T): Boolean = js.native
  }
  
}


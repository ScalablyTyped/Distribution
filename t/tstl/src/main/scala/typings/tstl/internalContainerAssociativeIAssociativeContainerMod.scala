package typings.tstl

import typings.tstl.baseContainerIContainerMod.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/associative/IAssociativeContainer", JSImport.Namespace)
@js.native
object internalContainerAssociativeIAssociativeContainerMod extends js.Object {
  @js.native
  trait IAssociativeContainer[Key, T /* <: Elem */, SourceT /* <: IAssociativeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.Iterator<T, SourceT, IteratorT, ReverseIteratorT, Elem> */ js.Any */, ReverseIteratorT /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IContainer.ReverseIterator<T, SourceT, IteratorT, ReverseIteratorT, Elem> */ js.Any */, Elem] extends IContainer[T, SourceT, IteratorT, ReverseIteratorT, Elem] {
    /**
      * Count elements with a specified key.
      *
      * @param key Key to search for.
      * @return Number of elements with the specified key.
      */
    def count(key: Key): Double = js.native
    /**
      * Erase elements with a specified key.
      *
      * @param key Key to search for.
      * @return Number of erased elements.
      */
    @JSName("erase")
    def erase_Double(key: Key): Double = js.native
    /**
      * Get iterator to element.
      *
      * @param key Key to search for.
      * @return An iterator to the element, if the specified key is found, otherwise `this.end()`.
      */
    def find(key: Key): IteratorT = js.native
    /**
      * Test whether a key exists.
      *
      * @param key Key to search for.
      * @return Whether the specified key exists.
      */
    def has(key: Key): Boolean = js.native
  }
  
}


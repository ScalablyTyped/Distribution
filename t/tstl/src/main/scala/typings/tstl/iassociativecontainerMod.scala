package typings.tstl

import typings.tstl.icontainerMod.IContainer
import typings.tstl.icontainerMod.IContainer.Iterator
import typings.tstl.icontainerMod.IContainer.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/container/associative/IAssociativeContainer", JSImport.Namespace)
@js.native
object iassociativecontainerMod extends js.Object {
  
  @js.native
  trait IAssociativeContainer[Key, T /* <: Elem */, SourceT /* <: IAssociativeContainer[Key, T, SourceT, IteratorT, ReverseIteratorT, Elem] */, IteratorT /* <: Iterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, ReverseIteratorT /* <: ReverseIterator[T, SourceT, IteratorT, ReverseIteratorT, Elem] */, Elem] extends IContainer[T, SourceT, IteratorT, ReverseIteratorT, Elem] {
    
    /**
      * Count elements with a specified key.
      *
      * @param key Key to search for.
      * @return Number of elements with the specified key.
      */
    def count(key: Key): Double = js.native
    
    /**
      * @inheritDoc
      */
    @JSName("erase")
    def erase_IteratorT(pos: IteratorT): IteratorT = js.native
    
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

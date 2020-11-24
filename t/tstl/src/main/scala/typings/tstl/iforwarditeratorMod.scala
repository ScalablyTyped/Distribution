package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/iterator/IForwardIterator", JSImport.Namespace)
@js.native
object iforwarditeratorMod extends js.Object {
  
  /* Inlined parent tstl.tstl/functional/IPointer.IPointer<T> */
  /* Inlined parent std.Pick<tstl.tstl/functional/IComparable.IComparable<Iterator>, 'equals'> */
  @js.native
  trait IForwardIterator[T, Iterator /* <: IForwardIterator[T, Iterator] */] extends js.Object {
    
    @JSName("equals")
    var equals_Original: js.Function1[/* obj */ Iterator, Boolean] = js.native
    
    /**
      * Get next iterator.
      *
      * @return The next iterator.
      */
    def next(): Iterator = js.native
    
    /**
      * Reference of the value.
      */
    var value: T = js.native
  }
}

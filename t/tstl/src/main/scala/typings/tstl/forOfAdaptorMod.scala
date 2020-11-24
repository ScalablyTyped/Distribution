package typings.tstl

import typings.std.IterableIterator
import typings.std.IteratorResult
import typings.tstl.iforwarditeratorMod.IForwardIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/iterator/disposable/ForOfAdaptor", JSImport.Namespace)
@js.native
object forOfAdaptorMod extends js.Object {
  
  @js.native
  class ForOfAdaptor[T, InputIterator /* <: IForwardIterator[T, InputIterator] */] protected () extends IterableIterator[T] {
    /**
      * Initializer Constructor.
      *
      * @param first Input iteartor of the first position.
      * @param last Input iterator of the last position.
      */
    def this(first: InputIterator, last: InputIterator) = this()
    
    var it_ : js.Any = js.native
    
    var last_ : js.Any = js.native
    
    /**
      * @inheritDoc
      */
    def next(): IteratorResult[T, _] = js.native
  }
}

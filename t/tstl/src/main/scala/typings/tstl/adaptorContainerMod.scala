package typings.tstl

import typings.tstl.iemptyMod.IEmpty
import typings.tstl.ipushMod.IPush
import typings.tstl.isizeMod.ISize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/internal/container/linear/AdaptorContainer", JSImport.Namespace)
@js.native
object adaptorContainerMod extends js.Object {
  
  @js.native
  abstract class AdaptorContainer[T, Source /* <: IEmpty with ISize with IPush[T] */, This /* <: AdaptorContainer[T, Source, This] */] protected ()
    extends IEmpty
       with ISize
       with IPush[T] {
    protected def this(source: Source) = this()
    
    /**
      * Remove element.
      */
    def pop(): Unit = js.native
    
    var source_ : Source = js.native
    
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    def swap(obj: This): Unit = js.native
  }
}

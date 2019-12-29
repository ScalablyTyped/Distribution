package typings.tstl

import typings.tstl.baseDisposableIPartialContainersMod._IEmpty
import typings.tstl.baseDisposableIPartialContainersMod._IPush
import typings.tstl.baseDisposableIPartialContainersMod._ISize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/base/container/AdaptorContainer", JSImport.Namespace)
@js.native
object baseContainerAdaptorContainerMod extends js.Object {
  @js.native
  abstract class AdaptorContainer[T, Source /* <: _IEmpty with _ISize with _IPush[T] */, This /* <: AdaptorContainer[T, Source, This] */] ()
    extends _IEmpty
       with _ISize
       with _IPush[T] {
    /**
      * @hidden
      */
    var source_ : Source = js.native
    /**
      * Test whether container is empty.
      */
    /* CompleteClass */
    override def empty(): Boolean = js.native
    /**
      * Remove element.
      */
    def pop(): Unit = js.native
    /**
      * Insert items at the end.
      *
      * @param items Items to insert.
      * @return Number of elements in the container after insertion.
      */
    /* CompleteClass */
    override def push(items: T*): Double = js.native
    /**
      * Number of elements in the container.
      */
    /* CompleteClass */
    override def size(): Double = js.native
    /**
      * Swap elements.
      *
      * @param obj Target container to swap.
      */
    def swap(obj: This): Unit = js.native
  }
  
}


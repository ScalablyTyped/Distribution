package typings.tstl

import typings.tstl.iemptyMod.IEmpty
import typings.tstl.ipushMod.IPush
import typings.tstl.isizeMod.ISize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/linear/AdaptorContainer", JSImport.Namespace)
@js.native
object adaptorContainerMod extends js.Object {
  @js.native
  abstract class AdaptorContainer[T, Source /* <: IEmpty with ISize with IPush[T] */, This /* <: AdaptorContainer[T, Source, This] */] protected ()
    extends IEmpty
       with ISize
       with IPush[T] {
    protected def this(source: Source) = this()
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


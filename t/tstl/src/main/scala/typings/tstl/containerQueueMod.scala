package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.baseContainerAdaptorContainerMod.AdaptorContainer
import typings.tstl.containerListMod.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/Queue", JSImport.Namespace)
@js.native
object containerQueueMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class Queue[T] () extends AdaptorContainer[T, List[T], Queue[T]] {
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: Queue[T]) = this()
    /**
      * Get the last element.
      *
      * @return The last element.
      */
    def back(): T = js.native
    /**
      * Get the first element.
      *
      * @return The first element.
      */
    def front(): T = js.native
  }
  
  val queue: Instantiable0[Queue[js.Object]] = js.native
  type queue[T] = Queue[T]
}


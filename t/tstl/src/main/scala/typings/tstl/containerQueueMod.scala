package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/Queue", JSImport.Namespace)
@js.native
object containerQueueMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AdaptorContainer<T, List<T>, Queue<T>> * / any */ @js.native
  /**
    * Default Constructor.
    */
  class Queue[T] () extends js.Object {
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
    /**
      * @inheritDoc
      */
    def pop(): Unit = js.native
  }
  
  val queue: Instantiable0[Queue[js.Object]] = js.native
  type queue[T] = Queue[T]
}


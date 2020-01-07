package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/Stack", JSImport.Namespace)
@js.native
object containerStackMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AdaptorContainer<T, Vector<T>, Stack<T>> * / any */ @js.native
  /**
    * Default Constructor.
    */
  class Stack[T] () extends js.Object {
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: Stack[T]) = this()
    /**
      * @inheritDoc
      */
    def pop(): Unit = js.native
    /**
      * Get the last element.
      *
      * @return The last element.
      */
    def top(): T = js.native
  }
  
  val stack: Instantiable0[Stack[js.Object]] = js.native
  type stack[T] = Stack[T]
}


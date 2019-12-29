package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import typings.tstl.baseContainerAdaptorContainerMod.AdaptorContainer
import typings.tstl.containerVectorMod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/container/Stack", JSImport.Namespace)
@js.native
object containerStackMod extends js.Object {
  @js.native
  /**
    * Default Constructor.
    */
  class Stack[T] () extends AdaptorContainer[T, Vector[T], Stack[T]] {
    /**
      * Copy Constructor.
      *
      * @param obj Object to copy.
      */
    def this(obj: Stack[T]) = this()
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


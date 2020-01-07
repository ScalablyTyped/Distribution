package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/internal/container/partial/IFront", JSImport.Namespace)
@js.native
object internalContainerPartialIFrontMod extends js.Object {
  @js.native
  trait IFront[T] extends js.Object {
    /**
      * Get the first element.
      *
      * @return The first element.
      */
    def front(): T = js.native
    /**
      * Change the first element.
      *
      * @param val The value to change.
      */
    def front(`val`: T): Unit = js.native
  }
  
}


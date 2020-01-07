package typings.tstl

import typings.tstl.exceptionRuntimeErrorMod.RuntimeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception/UnderflowError", JSImport.Namespace)
@js.native
object exceptionUnderflowErrorMod extends js.Object {
  @js.native
  class UnderflowError protected () extends RuntimeError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
}


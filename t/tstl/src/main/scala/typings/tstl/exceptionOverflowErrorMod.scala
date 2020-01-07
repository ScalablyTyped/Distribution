package typings.tstl

import typings.tstl.exceptionRuntimeErrorMod.RuntimeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception/OverflowError", JSImport.Namespace)
@js.native
object exceptionOverflowErrorMod extends js.Object {
  @js.native
  class OverflowError protected () extends RuntimeError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
}


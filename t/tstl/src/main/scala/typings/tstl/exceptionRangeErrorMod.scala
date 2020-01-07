package typings.tstl

import typings.tstl.exceptionRuntimeErrorMod.RuntimeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception/RangeError", JSImport.Namespace)
@js.native
object exceptionRangeErrorMod extends js.Object {
  @js.native
  class RangeError protected () extends RuntimeError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
}


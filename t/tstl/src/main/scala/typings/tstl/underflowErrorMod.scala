package typings.tstl

import typings.tstl.runtimeErrorMod.RuntimeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception/UnderflowError", JSImport.Namespace)
@js.native
object underflowErrorMod extends js.Object {
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


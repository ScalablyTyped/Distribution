package typings.tstl

import typings.tstl.exceptionLogicErrorMod.LogicError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception/LengthError", JSImport.Namespace)
@js.native
object exceptionLengthErrorMod extends js.Object {
  @js.native
  class LengthError protected () extends LogicError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
}


package typings.tstl

import typings.tstl.exceptionExceptionMod.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tstl/exception/RuntimeError", JSImport.Namespace)
@js.native
object runtimeErrorMod extends js.Object {
  
  @js.native
  class RuntimeError protected () extends Exception {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
}

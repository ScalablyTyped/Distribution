package typings.tstl

import org.scalablytyped.runtime.Instantiable1
import typings.tstl.exceptionExceptionMod.Exception
import typings.tstl.exceptionRuntimeErrorMod.OverflowError
import typings.tstl.exceptionRuntimeErrorMod.RangeError
import typings.tstl.exceptionRuntimeErrorMod.RuntimeError
import typings.tstl.exceptionRuntimeErrorMod.UnderflowError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception/RuntimeError", JSImport.Namespace)
@js.native
object exceptionRuntimeErrorMod extends js.Object {
  @js.native
  class OverflowError protected () extends RuntimeError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class RangeError protected () extends RuntimeError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class RuntimeError protected () extends Exception {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class UnderflowError protected () extends RuntimeError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  var overflow_error: Instantiable1[/* message */ String, OverflowError] = js.native
  var range_error: Instantiable1[/* message */ String, RangeError] = js.native
  var runtime_error: Instantiable1[/* message */ String, RuntimeError] = js.native
  var underflow_error: Instantiable1[/* message */ String, UnderflowError] = js.native
  type overflow_error = OverflowError
  type range_error = RangeError
  type runtime_error = RuntimeError
  type underflow_error = UnderflowError
}


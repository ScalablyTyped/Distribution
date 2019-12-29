package typings.tstl

import org.scalablytyped.runtime.Instantiable1
import typings.tstl.exceptionExceptionMod.Exception
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception/LogicError", JSImport.Namespace)
@js.native
object exceptionLogicErrorMod extends js.Object {
  @js.native
  class DomainError protected () extends LogicError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class InvalidArgument protected () extends LogicError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class LengthError protected () extends LogicError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class LogicError protected () extends Exception {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class OutOfRange protected () extends LogicError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  var domain_error: Instantiable1[/* message */ String, DomainError] = js.native
  var invalid_argument: Instantiable1[/* message */ String, InvalidArgument] = js.native
  var length_error: Instantiable1[/* message */ String, LengthError] = js.native
  var logic_error: Instantiable1[/* message */ String, LogicError] = js.native
  var out_of_range: Instantiable1[/* message */ String, OutOfRange] = js.native
  type domain_error = DomainError
  type invalid_argument = InvalidArgument
  type length_error = LengthError
  type logic_error = LogicError
  type out_of_range = OutOfRange
}


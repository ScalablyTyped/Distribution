package typings.tstl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception", JSImport.Namespace)
@js.native
object exceptionMod extends js.Object {
  @js.native
  class DomainError protected ()
    extends typings.tstl.exceptionLogicErrorMod.DomainError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  abstract class ErrorCategory ()
    extends typings.tstl.exceptionErrorCategoryMod.ErrorCategory
  
  @js.native
  /**
    * Default Constructor.
    */
  class ErrorCode ()
    extends typings.tstl.exceptionErrorCodeMod.ErrorCode {
    /**
      * Initializer Constructor.
      *
      * @param val Identifier of an error instance.
      * @param category An error category instance.
      */
    def this(`val`: Double, category: typings.tstl.exceptionErrorCategoryMod.ErrorCategory) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class ErrorCondition ()
    extends typings.tstl.exceptionErrorConditionMod.ErrorCondition {
    /**
      * Initializer Constructor.
      *
      * @param val Identifier of an error condition.
      * @param category An error category instance.
      */
    def this(`val`: Double, category: typings.tstl.exceptionErrorCategoryMod.ErrorCategory) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class Exception ()
    extends typings.tstl.exceptionExceptionMod.Exception {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class InvalidArgument protected ()
    extends typings.tstl.exceptionLogicErrorMod.InvalidArgument {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class LengthError protected ()
    extends typings.tstl.exceptionLogicErrorMod.LengthError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class LogicError protected ()
    extends typings.tstl.exceptionLogicErrorMod.LogicError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class OutOfRange protected ()
    extends typings.tstl.exceptionLogicErrorMod.OutOfRange {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class OverflowError protected ()
    extends typings.tstl.exceptionRuntimeErrorMod.OverflowError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class RangeError protected ()
    extends typings.tstl.exceptionRuntimeErrorMod.RangeError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class RuntimeError protected ()
    extends typings.tstl.exceptionRuntimeErrorMod.RuntimeError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class SystemError protected ()
    extends typings.tstl.exceptionSystemErrorMod.SystemError {
    /**
      * Initializer Constructor.
      *
      * @param code An error code.
      * @param message A detailed error message.
      */
    def this(code: typings.tstl.exceptionErrorCodeMod.ErrorCode) = this()
    def this(code: typings.tstl.exceptionErrorCodeMod.ErrorCode, message: String) = this()
    /**
      * Construct from references.
      *
      * @param val Identnfier of an error code in *category*.
      * @param category An error category.
      * @param message A detailed error message.
      */
    def this(`val`: Double, category: typings.tstl.exceptionErrorCategoryMod.ErrorCategory) = this()
    def this(`val`: Double, category: typings.tstl.exceptionErrorCategoryMod.ErrorCategory, message: String) = this()
  }
  
  @js.native
  class UnderflowError protected ()
    extends typings.tstl.exceptionRuntimeErrorMod.UnderflowError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  var domain_error: Instantiable1[/* message */ String, typings.tstl.exceptionLogicErrorMod.DomainError] = js.native
  var error_category: Instantiable0[typings.tstl.exceptionErrorCategoryMod.ErrorCategory] = js.native
  var error_code: Instantiable0[typings.tstl.exceptionErrorCodeMod.ErrorCode] = js.native
  var error_condition: Instantiable0[typings.tstl.exceptionErrorConditionMod.ErrorCondition] = js.native
  val exception: Instantiable0[typings.tstl.exceptionExceptionMod.Exception] = js.native
  var invalid_argument: Instantiable1[/* message */ String, typings.tstl.exceptionLogicErrorMod.InvalidArgument] = js.native
  var length_error: Instantiable1[/* message */ String, typings.tstl.exceptionLogicErrorMod.LengthError] = js.native
  var logic_error: Instantiable1[/* message */ String, typings.tstl.exceptionLogicErrorMod.LogicError] = js.native
  var out_of_range: Instantiable1[/* message */ String, typings.tstl.exceptionLogicErrorMod.OutOfRange] = js.native
  var overflow_error: Instantiable1[/* message */ String, typings.tstl.exceptionRuntimeErrorMod.OverflowError] = js.native
  var range_error: Instantiable1[/* message */ String, typings.tstl.exceptionRuntimeErrorMod.RangeError] = js.native
  var runtime_error: Instantiable1[/* message */ String, typings.tstl.exceptionRuntimeErrorMod.RuntimeError] = js.native
  var system_error: Instantiable2[
    /* code */ typings.tstl.exceptionErrorCodeMod.ErrorCode, 
    js.UndefOr[/* message */ String], 
    typings.tstl.exceptionSystemErrorMod.SystemError
  ] = js.native
  var underflow_error: Instantiable1[/* message */ String, typings.tstl.exceptionRuntimeErrorMod.UnderflowError] = js.native
  def get_terminate(): js.UndefOr[js.Function0[Unit]] = js.native
  def set_terminate(func: js.Function0[Unit]): Unit = js.native
  def terminate(): Unit = js.native
}


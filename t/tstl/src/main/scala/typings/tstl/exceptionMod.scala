package typings.tstl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception", JSImport.Namespace)
@js.native
object exceptionMod extends js.Object {
  @js.native
  class DomainError protected ()
    extends typings.tstl.domainErrorMod.DomainError {
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
    extends typings.tstl.errorCategoryMod.ErrorCategory
  
  @js.native
  /**
    * Default Constructor.
    */
  class ErrorCode ()
    extends typings.tstl.errorCodeMod.ErrorCode {
    /**
      * Initializer Constructor.
      *
      * @param val Identifier of an error instance.
      * @param category An error category instance.
      */
    def this(`val`: Double, category: typings.tstl.errorCategoryMod.ErrorCategory) = this()
  }
  
  @js.native
  /**
    * Default Constructor.
    */
  class ErrorCondition ()
    extends typings.tstl.errorConditionMod.ErrorCondition {
    /**
      * Initializer Constructor.
      *
      * @param val Identifier of an error condition.
      * @param category An error category instance.
      */
    def this(`val`: Double, category: typings.tstl.errorCategoryMod.ErrorCategory) = this()
  }
  
  @js.native
  class Exception protected ()
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
    extends typings.tstl.invalidArgumentMod.InvalidArgument {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class LengthError protected ()
    extends typings.tstl.lengthErrorMod.LengthError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class LogicError protected ()
    extends typings.tstl.logicErrorMod.LogicError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class OutOfRange protected ()
    extends typings.tstl.outOfRangeMod.OutOfRange {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class OverflowError protected ()
    extends typings.tstl.overflowErrorMod.OverflowError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class RangeError protected ()
    extends typings.tstl.rangeErrorMod.RangeError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class RuntimeError protected ()
    extends typings.tstl.runtimeErrorMod.RuntimeError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @js.native
  class SystemError protected ()
    extends typings.tstl.systemErrorMod.SystemError {
    /**
      * Initializer Constructor.
      *
      * @param code An error code.
      * @param message A detailed error message.
      */
    def this(code: typings.tstl.errorCodeMod.ErrorCode) = this()
    def this(code: typings.tstl.errorCodeMod.ErrorCode, message: String) = this()
    /**
      * Construct from references.
      *
      * @param val Identnfier of an error code in *category*.
      * @param category An error category.
      * @param message A detailed error message.
      */
    def this(`val`: Double, category: typings.tstl.errorCategoryMod.ErrorCategory) = this()
    def this(`val`: Double, category: typings.tstl.errorCategoryMod.ErrorCategory, message: String) = this()
  }
  
  @js.native
  class UnderflowError protected ()
    extends typings.tstl.underflowErrorMod.UnderflowError {
    /**
      * Initializer Constructor.
      *
      * @param message The error messgae.
      */
    def this(message: String) = this()
  }
  
  @JSName("get_terminate")
  def getTerminate(): js.UndefOr[js.Function0[Unit]] = js.native
  @JSName("set_terminate")
  def setTerminate(func: js.Function0[Unit]): Unit = js.native
  def terminate(): Unit = js.native
}


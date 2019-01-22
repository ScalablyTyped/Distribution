package typings
package tstlLib.exceptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl/exception", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var domain_error: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, tstlLib.exceptionLogicErrorMod.DomainError] = js.native
  var error_category: org.scalablytyped.runtime.Instantiable0[tstlLib.exceptionErrorCategoryMod.ErrorCategory] = js.native
  var error_code: org.scalablytyped.runtime.Instantiable0[tstlLib.exceptionErrorCodeMod.ErrorCode] = js.native
  var error_condition: org.scalablytyped.runtime.Instantiable0[tstlLib.exceptionErrorConditionMod.ErrorCondition] = js.native
  val exception: org.scalablytyped.runtime.Instantiable0[tstlLib.exceptionExceptionMod.Exception] = js.native
  var invalid_argument: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, tstlLib.exceptionLogicErrorMod.InvalidArgument] = js.native
  var length_error: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, tstlLib.exceptionLogicErrorMod.LengthError] = js.native
  var logic_error: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, tstlLib.exceptionLogicErrorMod.LogicError] = js.native
  var out_of_range: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, tstlLib.exceptionLogicErrorMod.OutOfRange] = js.native
  var overflow_error: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, tstlLib.exceptionRuntimeErrorMod.OverflowError] = js.native
  var range_error: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, tstlLib.exceptionRuntimeErrorMod.RangeError] = js.native
  var runtime_error: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, tstlLib.exceptionRuntimeErrorMod.RuntimeError] = js.native
  var system_error: org.scalablytyped.runtime.Instantiable2[
    /* code */ tstlLib.exceptionErrorCodeMod.ErrorCode, 
    /* message */ js.UndefOr[/* message */ java.lang.String], 
    tstlLib.exceptionSystemErrorMod.SystemError
  ] = js.native
  var underflow_error: org.scalablytyped.runtime.Instantiable1[/* message */ java.lang.String, tstlLib.exceptionRuntimeErrorMod.UnderflowError] = js.native
  def get_terminate(): js.Function0[scala.Unit] = js.native
  def set_terminate(func: js.Function0[scala.Unit]): scala.Unit = js.native
  def terminate(): scala.Unit = js.native
}


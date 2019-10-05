package typings.tstl.tstlMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tstl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var domain_error: Instantiable1[/* message */ String, typings.tstl.exceptionLogicErrorMod.DomainError] = js.native
  var error_category: Instantiable0[typings.tstl.exceptionErrorCategoryMod.ErrorCategory] = js.native
  var error_code: Instantiable0[typings.tstl.exceptionErrorCodeMod.ErrorCode] = js.native
  var error_condition: Instantiable0[typings.tstl.exceptionErrorConditionMod.ErrorCondition] = js.native
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
}


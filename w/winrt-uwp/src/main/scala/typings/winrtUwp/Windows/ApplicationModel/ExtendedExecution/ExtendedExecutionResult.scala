package typings.winrtUwp.Windows.ApplicationModel.ExtendedExecution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ExtendedExecutionResult extends js.Object
/** Specifies the possible background execution request result values. */
@JSGlobal("Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionResult")
@js.native
object ExtendedExecutionResult extends js.Object {
  
  /** App execution is allowed. */
  @js.native
  sealed trait allowed extends ExtendedExecutionResult
  
  /** App execution is denied. */
  @js.native
  sealed trait denied extends ExtendedExecutionResult
}

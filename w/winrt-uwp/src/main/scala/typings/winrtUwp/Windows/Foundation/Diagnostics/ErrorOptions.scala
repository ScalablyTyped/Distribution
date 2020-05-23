package typings.winrtUwp.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorOptions extends js.Object

/** Specifies the type of diagnostic error reporting for a thread. */
@JSGlobal("Windows.Foundation.Diagnostics.ErrorOptions")
@js.native
object ErrorOptions extends js.Object {
  /** Exceptions are reported. */
  @js.native
  sealed trait forceExceptions extends ErrorOptions
  
  /** No error reporting occurs for the thread. */
  @js.native
  sealed trait none extends ErrorOptions
  
  /** Exceptions are suppressed and not reported. */
  @js.native
  sealed trait suppressExceptions extends ErrorOptions
  
  /** Error information for SetErrorInfo is suppressed and not reported. */
  @js.native
  sealed trait suppressSetErrorInfo extends ErrorOptions
  
  /** Error information for SetErrorInfo is used. */
  @js.native
  sealed trait useSetErrorInfo extends ErrorOptions
  
}


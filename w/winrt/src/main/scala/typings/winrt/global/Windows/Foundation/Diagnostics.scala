package typings.winrt.global.Windows.Foundation

import typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Foundation.Diagnostics")
@js.native
object Diagnostics extends js.Object {
  @js.native
  class RuntimeBrokerErrorSettings ()
    extends typings.winrt.Windows.Foundation.Diagnostics.RuntimeBrokerErrorSettings {
    /* CompleteClass */
    override def getErrorOptions(): ErrorOptions = js.native
    /* CompleteClass */
    override def setErrorOptions(value: ErrorOptions): Unit = js.native
  }
  
  @js.native
  object ErrorOptions extends js.Object {
    /* 2 */ val forceExceptions: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.forceExceptions with Double = js.native
    /* 0 */ val none: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.none with Double = js.native
    /* 1 */ val suppressExceptions: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.suppressExceptions with Double = js.native
    /* 4 */ val suppressSetErrorInfo: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.suppressSetErrorInfo with Double = js.native
    /* 3 */ val useSetErrorInfo: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.useSetErrorInfo with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions with Double] = js.native
  }
  
}


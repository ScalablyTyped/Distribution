package typings.winrt.global.Windows.Foundation

import typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Diagnostics {
  
  @JSGlobal("Windows.Foundation.Diagnostics.ErrorOptions")
  @js.native
  object ErrorOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions & Double] = js.native
    
    /* 2 */ val forceExceptions: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.forceExceptions & Double = js.native
    
    /* 0 */ val none: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.none & Double = js.native
    
    /* 1 */ val suppressExceptions: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.suppressExceptions & Double = js.native
    
    /* 4 */ val suppressSetErrorInfo: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.suppressSetErrorInfo & Double = js.native
    
    /* 3 */ val useSetErrorInfo: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.useSetErrorInfo & Double = js.native
  }
  
  @JSGlobal("Windows.Foundation.Diagnostics.RuntimeBrokerErrorSettings")
  @js.native
  class RuntimeBrokerErrorSettings ()
    extends StObject
       with typings.winrt.Windows.Foundation.Diagnostics.RuntimeBrokerErrorSettings {
    
    /* CompleteClass */
    override def getErrorOptions(): ErrorOptions = js.native
    
    /* CompleteClass */
    override def setErrorOptions(value: ErrorOptions): Unit = js.native
  }
}

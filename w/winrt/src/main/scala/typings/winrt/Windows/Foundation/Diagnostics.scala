package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Diagnostics {
  
  @js.native
  sealed trait ErrorOptions extends StObject
  @JSGlobal("Windows.Foundation.Diagnostics.ErrorOptions")
  @js.native
  object ErrorOptions extends StObject {
    
    @js.native
    sealed trait forceExceptions
      extends StObject
         with ErrorOptions
    
    @js.native
    sealed trait none
      extends StObject
         with ErrorOptions
    
    @js.native
    sealed trait suppressExceptions
      extends StObject
         with ErrorOptions
    
    @js.native
    sealed trait suppressSetErrorInfo
      extends StObject
         with ErrorOptions
    
    @js.native
    sealed trait useSetErrorInfo
      extends StObject
         with ErrorOptions
  }
  
  trait IErrorReportingSettings extends StObject {
    
    def getErrorOptions(): ErrorOptions
    
    def setErrorOptions(value: ErrorOptions): Unit
  }
  object IErrorReportingSettings {
    
    inline def apply(getErrorOptions: () => ErrorOptions, setErrorOptions: ErrorOptions => Unit): IErrorReportingSettings = {
      val __obj = js.Dynamic.literal(getErrorOptions = js.Any.fromFunction0(getErrorOptions), setErrorOptions = js.Any.fromFunction1(setErrorOptions))
      __obj.asInstanceOf[IErrorReportingSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IErrorReportingSettings] (val x: Self) extends AnyVal {
      
      inline def setGetErrorOptions(value: () => ErrorOptions): Self = StObject.set(x, "getErrorOptions", js.Any.fromFunction0(value))
      
      inline def setSetErrorOptions(value: ErrorOptions => Unit): Self = StObject.set(x, "setErrorOptions", js.Any.fromFunction1(value))
    }
  }
  
  trait RuntimeBrokerErrorSettings
    extends StObject
       with IErrorReportingSettings
  object RuntimeBrokerErrorSettings {
    
    inline def apply(getErrorOptions: () => ErrorOptions, setErrorOptions: ErrorOptions => Unit): RuntimeBrokerErrorSettings = {
      val __obj = js.Dynamic.literal(getErrorOptions = js.Any.fromFunction0(getErrorOptions), setErrorOptions = js.Any.fromFunction1(setErrorOptions))
      __obj.asInstanceOf[RuntimeBrokerErrorSettings]
    }
  }
}

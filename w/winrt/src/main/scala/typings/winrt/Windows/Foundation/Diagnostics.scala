package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Diagnostics {
  
  @js.native
  sealed trait ErrorOptions extends StObject
  @JSGlobal("Windows.Foundation.Diagnostics.ErrorOptions")
  @js.native
  object ErrorOptions extends StObject {
    
    @js.native
    sealed trait forceExceptions extends ErrorOptions
    
    @js.native
    sealed trait none extends ErrorOptions
    
    @js.native
    sealed trait suppressExceptions extends ErrorOptions
    
    @js.native
    sealed trait suppressSetErrorInfo extends ErrorOptions
    
    @js.native
    sealed trait useSetErrorInfo extends ErrorOptions
  }
  
  @js.native
  trait IErrorReportingSettings extends StObject {
    
    def getErrorOptions(): ErrorOptions = js.native
    
    def setErrorOptions(value: ErrorOptions): Unit = js.native
  }
  object IErrorReportingSettings {
    
    @scala.inline
    def apply(getErrorOptions: () => ErrorOptions, setErrorOptions: ErrorOptions => Unit): IErrorReportingSettings = {
      val __obj = js.Dynamic.literal(getErrorOptions = js.Any.fromFunction0(getErrorOptions), setErrorOptions = js.Any.fromFunction1(setErrorOptions))
      __obj.asInstanceOf[IErrorReportingSettings]
    }
    
    @scala.inline
    implicit class IErrorReportingSettingsMutableBuilder[Self <: IErrorReportingSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetErrorOptions(value: () => ErrorOptions): Self = StObject.set(x, "getErrorOptions", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetErrorOptions(value: ErrorOptions => Unit): Self = StObject.set(x, "setErrorOptions", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait RuntimeBrokerErrorSettings extends IErrorReportingSettings
  object RuntimeBrokerErrorSettings {
    
    @scala.inline
    def apply(getErrorOptions: () => ErrorOptions, setErrorOptions: ErrorOptions => Unit): RuntimeBrokerErrorSettings = {
      val __obj = js.Dynamic.literal(getErrorOptions = js.Any.fromFunction0(getErrorOptions), setErrorOptions = js.Any.fromFunction1(setErrorOptions))
      __obj.asInstanceOf[RuntimeBrokerErrorSettings]
    }
  }
}

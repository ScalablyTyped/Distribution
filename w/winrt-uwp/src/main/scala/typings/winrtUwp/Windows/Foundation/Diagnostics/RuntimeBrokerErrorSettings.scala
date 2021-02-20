package typings.winrtUwp.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents diagnostic error reporting settings. */
@js.native
trait RuntimeBrokerErrorSettings extends StObject {
  
  /**
    * Gets the type of error reporting for the error object.
    * @return One of the enumeration values.
    */
  def getErrorOptions(): ErrorOptions = js.native
  
  /**
    * Sets the type of error reporting for the error object.
    * @param value One of the enumeration values.
    */
  def setErrorOptions(value: ErrorOptions): Unit = js.native
}
object RuntimeBrokerErrorSettings {
  
  @scala.inline
  def apply(getErrorOptions: () => ErrorOptions, setErrorOptions: ErrorOptions => Unit): RuntimeBrokerErrorSettings = {
    val __obj = js.Dynamic.literal(getErrorOptions = js.Any.fromFunction0(getErrorOptions), setErrorOptions = js.Any.fromFunction1(setErrorOptions))
    __obj.asInstanceOf[RuntimeBrokerErrorSettings]
  }
  
  @scala.inline
  implicit class RuntimeBrokerErrorSettingsMutableBuilder[Self <: RuntimeBrokerErrorSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetErrorOptions(value: () => ErrorOptions): Self = StObject.set(x, "getErrorOptions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetErrorOptions(value: ErrorOptions => Unit): Self = StObject.set(x, "setErrorOptions", js.Any.fromFunction1(value))
  }
}

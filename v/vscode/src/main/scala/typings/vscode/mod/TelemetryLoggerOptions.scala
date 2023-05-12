package typings.vscode.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelemetryLoggerOptions extends StObject {
  
  /**
  		 * Any additional common properties which should be injected into the data object.
  		 */
  val additionalCommonProperties: js.UndefOr[Record[String, Any]] = js.undefined
  
  /**
  		 * Whether or not you want to avoid having the built-in common properties such as os, extension name, etc injected into the data object.
  		 * Defaults to `false` if not defined.
  		 */
  val ignoreBuiltInCommonProperties: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Whether or not unhandled errors on the extension host caused by your extension should be logged to your sender.
  		 * Defaults to `false` if not defined.
  		 */
  val ignoreUnhandledErrors: js.UndefOr[Boolean] = js.undefined
}
object TelemetryLoggerOptions {
  
  inline def apply(): TelemetryLoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TelemetryLoggerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TelemetryLoggerOptions] (val x: Self) extends AnyVal {
    
    inline def setAdditionalCommonProperties(value: Record[String, Any]): Self = StObject.set(x, "additionalCommonProperties", value.asInstanceOf[js.Any])
    
    inline def setAdditionalCommonPropertiesUndefined: Self = StObject.set(x, "additionalCommonProperties", js.undefined)
    
    inline def setIgnoreBuiltInCommonProperties(value: Boolean): Self = StObject.set(x, "ignoreBuiltInCommonProperties", value.asInstanceOf[js.Any])
    
    inline def setIgnoreBuiltInCommonPropertiesUndefined: Self = StObject.set(x, "ignoreBuiltInCommonProperties", js.undefined)
    
    inline def setIgnoreUnhandledErrors(value: Boolean): Self = StObject.set(x, "ignoreUnhandledErrors", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnhandledErrorsUndefined: Self = StObject.set(x, "ignoreUnhandledErrors", js.undefined)
  }
}

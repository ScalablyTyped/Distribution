package typings.tonicUiReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emphasis extends StObject {
  
  var disabled: String
  
  var emphasis: String
  
  var error: String
  
  var info: String
  
  var primary: String
  
  var secondary: String
  
  var success: String
  
  var tertiary: String
  
  var warning: String
}
object Emphasis {
  
  inline def apply(
    disabled: String,
    emphasis: String,
    error: String,
    info: String,
    primary: String,
    secondary: String,
    success: String,
    tertiary: String,
    warning: String
  ): Emphasis = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], emphasis = emphasis.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], secondary = secondary.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], tertiary = tertiary.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emphasis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Emphasis] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setEmphasis(value: String): Self = StObject.set(x, "emphasis", value.asInstanceOf[js.Any])
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setSecondary(value: String): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setTertiary(value: String): Self = StObject.set(x, "tertiary", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}

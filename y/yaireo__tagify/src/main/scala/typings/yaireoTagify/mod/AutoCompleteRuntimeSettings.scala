package typings.yaireoTagify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings for the autocomplete feature at runtime.
  */
trait AutoCompleteRuntimeSettings extends StObject {
  
  /**
    * Tries to suggest the input's value while typing (match from
    * whitelist) by adding the rest of term as grayed-out text.
    * @default true
    */
  var enabled: Boolean
  
  /**
    * If `true`, when the right arrow key is pressed, use the suggested
    * value to create a tag, else just auto-completes the input. In mixed
    * mode this is ignored and treated as `true`.
    * @default false
    */
  var rightKey: Boolean
}
object AutoCompleteRuntimeSettings {
  
  inline def apply(enabled: Boolean, rightKey: Boolean): AutoCompleteRuntimeSettings = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], rightKey = rightKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCompleteRuntimeSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoCompleteRuntimeSettings] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setRightKey(value: Boolean): Self = StObject.set(x, "rightKey", value.asInstanceOf[js.Any])
  }
}

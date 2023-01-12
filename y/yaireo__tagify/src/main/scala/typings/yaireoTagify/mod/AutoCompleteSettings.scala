package typings.yaireoTagify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings for the autocomplete feature that can be configured via the
  * `autocomplete` option of the settings that are passed to tagify.
  */
/* Inlined parent std.Partial<@yaireo/tagify.@yaireo/tagify.AutoCompleteRuntimeSettings> */
trait AutoCompleteSettings extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var rightKey: js.UndefOr[Boolean] = js.undefined
}
object AutoCompleteSettings {
  
  inline def apply(): AutoCompleteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoCompleteSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoCompleteSettings] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setRightKey(value: Boolean): Self = StObject.set(x, "rightKey", value.asInstanceOf[js.Any])
    
    inline def setRightKeyUndefined: Self = StObject.set(x, "rightKey", js.undefined)
  }
}

package typings.yaireoTagify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options related to accessibility.
  */
/* Inlined parent std.Partial<@yaireo/tagify.@yaireo/tagify.A11yRuntimeSettings> */
trait A11ySettings extends StObject {
  
  var focusableTags: js.UndefOr[Boolean] = js.undefined
}
object A11ySettings {
  
  inline def apply(): A11ySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[A11ySettings]
  }
  
  extension [Self <: A11ySettings](x: Self) {
    
    inline def setFocusableTags(value: Boolean): Self = StObject.set(x, "focusableTags", value.asInstanceOf[js.Any])
    
    inline def setFocusableTagsUndefined: Self = StObject.set(x, "focusableTags", js.undefined)
  }
}

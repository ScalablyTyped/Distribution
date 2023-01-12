package typings.yaireoTagify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options related to accessibility at runtime.
  */
trait A11yRuntimeSettings extends StObject {
  
  /**
    * If `true`, allows to focus tags via tab navigation.
    * @default false
    */
  var focusableTags: Boolean
}
object A11yRuntimeSettings {
  
  inline def apply(focusableTags: Boolean): A11yRuntimeSettings = {
    val __obj = js.Dynamic.literal(focusableTags = focusableTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[A11yRuntimeSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: A11yRuntimeSettings] (val x: Self) extends AnyVal {
    
    inline def setFocusableTags(value: Boolean): Self = StObject.set(x, "focusableTags", value.asInstanceOf[js.Any])
  }
}

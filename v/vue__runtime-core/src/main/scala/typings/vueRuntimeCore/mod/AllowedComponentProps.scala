package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowedComponentProps extends StObject {
  
  var `class`: js.UndefOr[Any] = js.undefined
  
  var style: js.UndefOr[Any] = js.undefined
}
object AllowedComponentProps {
  
  inline def apply(): AllowedComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowedComponentProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowedComponentProps] (val x: Self) extends AnyVal {
    
    inline def setClass(value: Any): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}

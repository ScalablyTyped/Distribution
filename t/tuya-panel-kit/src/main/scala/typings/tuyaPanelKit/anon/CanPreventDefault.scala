package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanPreventDefault extends StObject {
  
  var canPreventDefault: js.UndefOr[Boolean] = js.undefined
  
  var data: js.UndefOr[Any] = js.undefined
}
object CanPreventDefault {
  
  inline def apply(): CanPreventDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanPreventDefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanPreventDefault] (val x: Self) extends AnyVal {
    
    inline def setCanPreventDefault(value: Boolean): Self = StObject.set(x, "canPreventDefault", value.asInstanceOf[js.Any])
    
    inline def setCanPreventDefaultUndefined: Self = StObject.set(x, "canPreventDefault", js.undefined)
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}

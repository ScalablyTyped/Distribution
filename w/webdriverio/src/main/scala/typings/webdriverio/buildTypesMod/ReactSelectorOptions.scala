package typings.webdriverio.buildTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactSelectorOptions extends StObject {
  
  var props: js.UndefOr[js.Object] = js.undefined
  
  var state: js.UndefOr[js.Array[Any] | Double | String | js.Object | Boolean] = js.undefined
}
object ReactSelectorOptions {
  
  inline def apply(): ReactSelectorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactSelectorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReactSelectorOptions] (val x: Self) extends AnyVal {
    
    inline def setProps(value: js.Object): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
    
    inline def setState(value: js.Array[Any] | Double | String | js.Object | Boolean): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStateVarargs(value: Any*): Self = StObject.set(x, "state", js.Array(value*))
  }
}

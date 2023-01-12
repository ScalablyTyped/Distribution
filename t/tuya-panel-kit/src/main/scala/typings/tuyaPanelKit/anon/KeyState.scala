package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyState extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[PartialStateNavigationSta] = js.undefined
}
object KeyState {
  
  inline def apply(): KeyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyState] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setState(value: PartialStateNavigationSta): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}

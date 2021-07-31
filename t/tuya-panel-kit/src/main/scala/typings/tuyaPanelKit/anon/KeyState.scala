package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyState extends StObject {
  
  var key: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[PartialStateNavigationStaHistory] = js.undefined
}
object KeyState {
  
  @scala.inline
  def apply(): KeyState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyState]
  }
  
  @scala.inline
  implicit class KeyStateMutableBuilder[Self <: KeyState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setState(value: PartialStateNavigationStaHistory): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}

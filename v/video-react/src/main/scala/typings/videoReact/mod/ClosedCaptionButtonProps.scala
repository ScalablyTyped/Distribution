package typings.videoReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosedCaptionButtonProps
  extends StObject
     with ControlBarControlProps {
  
  var actions: js.UndefOr[Any] = js.undefined
  
  var kinds: js.UndefOr[js.Array[String]] = js.undefined
  
  var offMenuText: js.UndefOr[String] = js.undefined
  
  var showOffMenu: js.UndefOr[Boolean] = js.undefined
}
object ClosedCaptionButtonProps {
  
  inline def apply(): ClosedCaptionButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosedCaptionButtonProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClosedCaptionButtonProps] (val x: Self) extends AnyVal {
    
    inline def setActions(value: Any): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setKinds(value: js.Array[String]): Self = StObject.set(x, "kinds", value.asInstanceOf[js.Any])
    
    inline def setKindsUndefined: Self = StObject.set(x, "kinds", js.undefined)
    
    inline def setKindsVarargs(value: String*): Self = StObject.set(x, "kinds", js.Array(value*))
    
    inline def setOffMenuText(value: String): Self = StObject.set(x, "offMenuText", value.asInstanceOf[js.Any])
    
    inline def setOffMenuTextUndefined: Self = StObject.set(x, "offMenuText", js.undefined)
    
    inline def setShowOffMenu(value: Boolean): Self = StObject.set(x, "showOffMenu", value.asInstanceOf[js.Any])
    
    inline def setShowOffMenuUndefined: Self = StObject.set(x, "showOffMenu", js.undefined)
  }
}

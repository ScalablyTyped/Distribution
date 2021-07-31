package typings.uirouterCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UiViewContextAnchor extends StObject {
  
  var uiViewContextAnchor: String
  
  var uiViewName: String
}
object UiViewContextAnchor {
  
  @scala.inline
  def apply(uiViewContextAnchor: String, uiViewName: String): UiViewContextAnchor = {
    val __obj = js.Dynamic.literal(uiViewContextAnchor = uiViewContextAnchor.asInstanceOf[js.Any], uiViewName = uiViewName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiViewContextAnchor]
  }
  
  @scala.inline
  implicit class UiViewContextAnchorMutableBuilder[Self <: UiViewContextAnchor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUiViewContextAnchor(value: String): Self = StObject.set(x, "uiViewContextAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiViewName(value: String): Self = StObject.set(x, "uiViewName", value.asInstanceOf[js.Any])
  }
}

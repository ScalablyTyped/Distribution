package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonCollapsed extends StObject {
  
  var button: String
  
  var buttonCollapsed: String
  
  var buttonExpanded: String
  
  var root: String
  
  var title: String
}
object ButtonCollapsed {
  
  @scala.inline
  def apply(button: String, buttonCollapsed: String, buttonExpanded: String, root: String, title: String): ButtonCollapsed = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttonCollapsed = buttonCollapsed.asInstanceOf[js.Any], buttonExpanded = buttonExpanded.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonCollapsed]
  }
  
  @scala.inline
  implicit class ButtonCollapsedMutableBuilder[Self <: ButtonCollapsed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonCollapsed(value: String): Self = StObject.set(x, "buttonCollapsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonExpanded(value: String): Self = StObject.set(x, "buttonExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}

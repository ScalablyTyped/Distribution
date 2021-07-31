package typings.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelColor extends StObject {
  
  var cancelColor: js.UndefOr[String] = js.undefined
  
  var cancelText: js.UndefOr[String] = js.undefined
  
  var confirmColor: js.UndefOr[String] = js.undefined
  
  var confirmText: js.UndefOr[String] = js.undefined
  
  var content: String
  
  var showCancel: js.UndefOr[Boolean] = js.undefined
  
  var title: String
}
object CancelColor {
  
  @scala.inline
  def apply(content: String, title: String): CancelColor = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelColor]
  }
  
  @scala.inline
  implicit class CancelColorMutableBuilder[Self <: CancelColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelColor(value: String): Self = StObject.set(x, "cancelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelColorUndefined: Self = StObject.set(x, "cancelColor", js.undefined)
    
    @scala.inline
    def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelTextUndefined: Self = StObject.set(x, "cancelText", js.undefined)
    
    @scala.inline
    def setConfirmColor(value: String): Self = StObject.set(x, "confirmColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmColorUndefined: Self = StObject.set(x, "confirmColor", js.undefined)
    
    @scala.inline
    def setConfirmText(value: String): Self = StObject.set(x, "confirmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmTextUndefined: Self = StObject.set(x, "confirmText", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCancel(value: Boolean): Self = StObject.set(x, "showCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCancelUndefined: Self = StObject.set(x, "showCancel", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}

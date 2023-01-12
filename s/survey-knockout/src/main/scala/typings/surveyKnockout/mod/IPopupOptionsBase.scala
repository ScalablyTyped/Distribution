package typings.surveyKnockout.mod

import typings.surveyKnockout.surveyKnockoutStrings.overlay
import typings.surveyKnockout.surveyKnockoutStrings.popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPopupOptionsBase extends StObject {
  
  var cssClass: js.UndefOr[String] = js.undefined
  
  var displayMode: js.UndefOr[popup | overlay] = js.undefined
  
  var horizontalPosition: js.UndefOr[Any] = js.undefined
  
  var isModal: js.UndefOr[Boolean] = js.undefined
  
  var onApply: js.UndefOr[Any] = js.undefined
  
  var onCancel: js.UndefOr[Any] = js.undefined
  
  var onHide: js.UndefOr[Any] = js.undefined
  
  var onShow: js.UndefOr[Any] = js.undefined
  
  var showPointer: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var verticalPosition: js.UndefOr[Any] = js.undefined
}
object IPopupOptionsBase {
  
  inline def apply(): IPopupOptionsBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPopupOptionsBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPopupOptionsBase] (val x: Self) extends AnyVal {
    
    inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
    
    inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
    
    inline def setDisplayMode(value: popup | overlay): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
    
    inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
    
    inline def setHorizontalPosition(value: Any): Self = StObject.set(x, "horizontalPosition", value.asInstanceOf[js.Any])
    
    inline def setHorizontalPositionUndefined: Self = StObject.set(x, "horizontalPosition", js.undefined)
    
    inline def setIsModal(value: Boolean): Self = StObject.set(x, "isModal", value.asInstanceOf[js.Any])
    
    inline def setIsModalUndefined: Self = StObject.set(x, "isModal", js.undefined)
    
    inline def setOnApply(value: Any): Self = StObject.set(x, "onApply", value.asInstanceOf[js.Any])
    
    inline def setOnApplyUndefined: Self = StObject.set(x, "onApply", js.undefined)
    
    inline def setOnCancel(value: Any): Self = StObject.set(x, "onCancel", value.asInstanceOf[js.Any])
    
    inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
    
    inline def setOnHide(value: Any): Self = StObject.set(x, "onHide", value.asInstanceOf[js.Any])
    
    inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
    
    inline def setOnShow(value: Any): Self = StObject.set(x, "onShow", value.asInstanceOf[js.Any])
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setShowPointer(value: Boolean): Self = StObject.set(x, "showPointer", value.asInstanceOf[js.Any])
    
    inline def setShowPointerUndefined: Self = StObject.set(x, "showPointer", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVerticalPosition(value: Any): Self = StObject.set(x, "verticalPosition", value.asInstanceOf[js.Any])
    
    inline def setVerticalPositionUndefined: Self = StObject.set(x, "verticalPosition", js.undefined)
  }
}

package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelButtonLabel extends StObject {
  
  var cancelButtonLabel: js.UndefOr[String] = js.undefined
  
  var confirmButtonLabel: js.UndefOr[String] = js.undefined
  
  var link: js.UndefOr[TextInputPlaceholder] = js.undefined
}
object CancelButtonLabel {
  
  @scala.inline
  def apply(): CancelButtonLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelButtonLabel]
  }
  
  @scala.inline
  implicit class CancelButtonLabelMutableBuilder[Self <: CancelButtonLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelButtonLabel(value: String): Self = StObject.set(x, "cancelButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelButtonLabelUndefined: Self = StObject.set(x, "cancelButtonLabel", js.undefined)
    
    @scala.inline
    def setConfirmButtonLabel(value: String): Self = StObject.set(x, "confirmButtonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmButtonLabelUndefined: Self = StObject.set(x, "confirmButtonLabel", js.undefined)
    
    @scala.inline
    def setLink(value: TextInputPlaceholder): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
  }
}

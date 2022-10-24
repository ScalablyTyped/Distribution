package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmButtonLabel extends StObject {
  
  var cancelButtonLabel: js.UndefOr[String] = js.undefined
  
  var confirmButtonLabel: js.UndefOr[String] = js.undefined
  
  var link: js.UndefOr[UrlInputPlaceholder] = js.undefined
}
object ConfirmButtonLabel {
  
  inline def apply(): ConfirmButtonLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfirmButtonLabel]
  }
  
  extension [Self <: ConfirmButtonLabel](x: Self) {
    
    inline def setCancelButtonLabel(value: String): Self = StObject.set(x, "cancelButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setCancelButtonLabelUndefined: Self = StObject.set(x, "cancelButtonLabel", js.undefined)
    
    inline def setConfirmButtonLabel(value: String): Self = StObject.set(x, "confirmButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setConfirmButtonLabelUndefined: Self = StObject.set(x, "confirmButtonLabel", js.undefined)
    
    inline def setLink(value: UrlInputPlaceholder): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
  }
}

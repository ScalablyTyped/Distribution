package typings.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIkitMarginOptions extends StObject {
  
  var `first-column`: js.UndefOr[String] = js.undefined
  
  var margin: js.UndefOr[String] = js.undefined
}
object UIkitMarginOptions {
  
  @scala.inline
  def apply(): UIkitMarginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIkitMarginOptions]
  }
  
  @scala.inline
  implicit class UIkitMarginOptionsMutableBuilder[Self <: UIkitMarginOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setFirst-column`(value: String): Self = StObject.set(x, "first-column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFirst-columnUndefined`: Self = StObject.set(x, "first-column", js.undefined)
    
    @scala.inline
    def setMargin(value: String): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
  }
}

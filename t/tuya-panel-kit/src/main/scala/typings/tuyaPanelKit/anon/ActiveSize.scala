package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveSize extends StObject {
  
  var activeSize: js.UndefOr[Double] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var margin: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object ActiveSize {
  
  @scala.inline
  def apply(): ActiveSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveSize]
  }
  
  @scala.inline
  implicit class ActiveSizeMutableBuilder[Self <: ActiveSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveSize(value: Double): Self = StObject.set(x, "activeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveSizeUndefined: Self = StObject.set(x, "activeSize", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

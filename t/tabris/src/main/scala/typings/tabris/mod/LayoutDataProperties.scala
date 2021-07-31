package typings.tabris.mod

import typings.tabris.tabrisStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutDataProperties extends StObject {
  
  var baseline: js.UndefOr[auto | SiblingReference] = js.undefined
  
  var bottom: js.UndefOr[auto | Constraint] = js.undefined
  
  var centerX: js.UndefOr[auto | Offset] = js.undefined
  
  var centerY: js.UndefOr[auto | Offset] = js.undefined
  
  var height: js.UndefOr[auto | Dimension] = js.undefined
  
  var left: js.UndefOr[auto | Constraint] = js.undefined
  
  var right: js.UndefOr[auto | Constraint] = js.undefined
  
  var top: js.UndefOr[auto | Constraint] = js.undefined
  
  var width: js.UndefOr[auto | Dimension] = js.undefined
}
object LayoutDataProperties {
  
  @scala.inline
  def apply(): LayoutDataProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutDataProperties]
  }
  
  @scala.inline
  implicit class LayoutDataPropertiesMutableBuilder[Self <: LayoutDataProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseline(value: auto | SiblingReference): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineUndefined: Self = StObject.set(x, "baseline", js.undefined)
    
    @scala.inline
    def setBottom(value: auto | Constraint): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setCenterX(value: auto | Offset): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterXUndefined: Self = StObject.set(x, "centerX", js.undefined)
    
    @scala.inline
    def setCenterY(value: auto | Offset): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterYUndefined: Self = StObject.set(x, "centerY", js.undefined)
    
    @scala.inline
    def setHeight(value: auto | Dimension): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeft(value: auto | Constraint): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: auto | Constraint): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: auto | Constraint): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: auto | Dimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

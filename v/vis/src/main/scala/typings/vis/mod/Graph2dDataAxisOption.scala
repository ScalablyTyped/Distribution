package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Graph2dDataAxisOption extends StObject {
  
  var alignZeros: js.UndefOr[Boolean] = js.undefined
  
  var iconWidth: js.UndefOr[Double] = js.undefined
  
  var icons: js.UndefOr[Boolean] = js.undefined
  
  var labelOffsetX: js.UndefOr[Double] = js.undefined
  
  var labelOffsetY: js.UndefOr[Double] = js.undefined
  
  var left: js.UndefOr[DataAxisSideOption] = js.undefined
  
  var majorLinesOffset: js.UndefOr[Double] = js.undefined
  
  var minorLinesOffset: js.UndefOr[Double] = js.undefined
  
  var orientation: js.UndefOr[TimelineOptionsOrientationType] = js.undefined
  
  var right: js.UndefOr[DataAxisSideOption] = js.undefined
  
  var showMajorLabels: js.UndefOr[Boolean] = js.undefined
  
  var showMinorLabels: js.UndefOr[Boolean] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[String] = js.undefined
}
object Graph2dDataAxisOption {
  
  inline def apply(): Graph2dDataAxisOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Graph2dDataAxisOption]
  }
  
  extension [Self <: Graph2dDataAxisOption](x: Self) {
    
    inline def setAlignZeros(value: Boolean): Self = StObject.set(x, "alignZeros", value.asInstanceOf[js.Any])
    
    inline def setAlignZerosUndefined: Self = StObject.set(x, "alignZeros", js.undefined)
    
    inline def setIconWidth(value: Double): Self = StObject.set(x, "iconWidth", value.asInstanceOf[js.Any])
    
    inline def setIconWidthUndefined: Self = StObject.set(x, "iconWidth", js.undefined)
    
    inline def setIcons(value: Boolean): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setLabelOffsetX(value: Double): Self = StObject.set(x, "labelOffsetX", value.asInstanceOf[js.Any])
    
    inline def setLabelOffsetXUndefined: Self = StObject.set(x, "labelOffsetX", js.undefined)
    
    inline def setLabelOffsetY(value: Double): Self = StObject.set(x, "labelOffsetY", value.asInstanceOf[js.Any])
    
    inline def setLabelOffsetYUndefined: Self = StObject.set(x, "labelOffsetY", js.undefined)
    
    inline def setLeft(value: DataAxisSideOption): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setMajorLinesOffset(value: Double): Self = StObject.set(x, "majorLinesOffset", value.asInstanceOf[js.Any])
    
    inline def setMajorLinesOffsetUndefined: Self = StObject.set(x, "majorLinesOffset", js.undefined)
    
    inline def setMinorLinesOffset(value: Double): Self = StObject.set(x, "minorLinesOffset", value.asInstanceOf[js.Any])
    
    inline def setMinorLinesOffsetUndefined: Self = StObject.set(x, "minorLinesOffset", js.undefined)
    
    inline def setOrientation(value: TimelineOptionsOrientationType): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setRight(value: DataAxisSideOption): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setShowMajorLabels(value: Boolean): Self = StObject.set(x, "showMajorLabels", value.asInstanceOf[js.Any])
    
    inline def setShowMajorLabelsUndefined: Self = StObject.set(x, "showMajorLabels", js.undefined)
    
    inline def setShowMinorLabels(value: Boolean): Self = StObject.set(x, "showMinorLabels", value.asInstanceOf[js.Any])
    
    inline def setShowMinorLabelsUndefined: Self = StObject.set(x, "showMinorLabels", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

package typings.tuyaPanelKit.mod

import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.tuyaPanelKit.tuyaPanelKitBooleans.`true`
import typings.tuyaPanelKit.tuyaPanelKitStrings.bevel
import typings.tuyaPanelKit.tuyaPanelKitStrings.butt
import typings.tuyaPanelKit.tuyaPanelKitStrings.miter
import typings.tuyaPanelKit.tuyaPanelKitStrings.round
import typings.tuyaPanelKit.tuyaPanelKitStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.tuyaPanelKit.mod.IconFontProps because var conflicts: style. Inlined viewBox, useART, ascent, descent, unitsPerEm, x, y, scaleX, scaleY, scale, spaceOffset, color, size, hFlip, vFlip, name, width, height, fill, stroke, strokeWidth, strokeJoin, strokeCap, strokeDash, d, opacity */ trait GlobalToastProps
  extends StObject
     with ToastProps {
  
  var ascent: js.UndefOr[Double] = js.undefined
  
  var color: js.UndefOr[js.Any] = js.undefined
  
  var d: js.UndefOr[String] = js.undefined
  
  var descent: js.UndefOr[Double] = js.undefined
  
  var fill: js.UndefOr[String] = js.undefined
  
  var hFlip: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var iconfontStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var opacity: js.UndefOr[String | Double] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
  
  var scaleX: js.UndefOr[Double] = js.undefined
  
  var scaleY: js.UndefOr[Double] = js.undefined
  
  var showIcon: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var spaceOffset: js.UndefOr[Double] = js.undefined
  
  var stroke: js.UndefOr[String] = js.undefined
  
  var strokeCap: js.UndefOr[round | butt | square] = js.undefined
  
  var strokeDash: js.UndefOr[js.Array[Double]] = js.undefined
  
  var strokeJoin: js.UndefOr[round | miter | bevel] = js.undefined
  
  var strokeWidth: js.UndefOr[Double] = js.undefined
  
  var unitsPerEm: js.UndefOr[Double] = js.undefined
  
  var useART: js.UndefOr[`true`] = js.undefined
  
  var vFlip: js.UndefOr[Boolean] = js.undefined
  
  var viewBox: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object GlobalToastProps {
  
  @scala.inline
  def apply(onFinish: () => Unit, show: Boolean): GlobalToastProps = {
    val __obj = js.Dynamic.literal(onFinish = js.Any.fromFunction0(onFinish), show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalToastProps]
  }
  
  @scala.inline
  implicit class GlobalToastPropsMutableBuilder[Self <: GlobalToastProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscent(value: Double): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscentUndefined: Self = StObject.set(x, "ascent", js.undefined)
    
    @scala.inline
    def setColor(value: js.Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDUndefined: Self = StObject.set(x, "d", js.undefined)
    
    @scala.inline
    def setDescent(value: Double): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescentUndefined: Self = StObject.set(x, "descent", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setHFlip(value: Boolean): Self = StObject.set(x, "hFlip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHFlipUndefined: Self = StObject.set(x, "hFlip", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIconfontStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconfontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconfontStyleNull: Self = StObject.set(x, "iconfontStyle", null)
    
    @scala.inline
    def setIconfontStyleUndefined: Self = StObject.set(x, "iconfontStyle", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpacity(value: String | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    @scala.inline
    def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleYUndefined: Self = StObject.set(x, "scaleY", js.undefined)
    
    @scala.inline
    def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSpaceOffset(value: Double): Self = StObject.set(x, "spaceOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceOffsetUndefined: Self = StObject.set(x, "spaceOffset", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeCap(value: round | butt | square): Self = StObject.set(x, "strokeCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeCapUndefined: Self = StObject.set(x, "strokeCap", js.undefined)
    
    @scala.inline
    def setStrokeDash(value: js.Array[Double]): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
    
    @scala.inline
    def setStrokeDashVarargs(value: Double*): Self = StObject.set(x, "strokeDash", js.Array(value :_*))
    
    @scala.inline
    def setStrokeJoin(value: round | miter | bevel): Self = StObject.set(x, "strokeJoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeJoinUndefined: Self = StObject.set(x, "strokeJoin", js.undefined)
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    @scala.inline
    def setUnitsPerEm(value: Double): Self = StObject.set(x, "unitsPerEm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitsPerEmUndefined: Self = StObject.set(x, "unitsPerEm", js.undefined)
    
    @scala.inline
    def setUseART(value: `true`): Self = StObject.set(x, "useART", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseARTUndefined: Self = StObject.set(x, "useART", js.undefined)
    
    @scala.inline
    def setVFlip(value: Boolean): Self = StObject.set(x, "vFlip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVFlipUndefined: Self = StObject.set(x, "vFlip", js.undefined)
    
    @scala.inline
    def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}

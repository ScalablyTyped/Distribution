package typings.wixUiCore.anon

import typings.wixUiCore.sliderSliderMod.Style
import typings.wixUiCore.wixUiCoreStrings.across
import typings.wixUiCore.wixUiCoreStrings.always
import typings.wixUiCore.wixUiCoreStrings.bar
import typings.wixUiCore.wixUiCoreStrings.circle
import typings.wixUiCore.wixUiCoreStrings.count
import typings.wixUiCore.wixUiCoreStrings.dot
import typings.wixUiCore.wixUiCoreStrings.horizontal
import typings.wixUiCore.wixUiCoreStrings.hover
import typings.wixUiCore.wixUiCoreStrings.line
import typings.wixUiCore.wixUiCoreStrings.middle
import typings.wixUiCore.wixUiCoreStrings.none
import typings.wixUiCore.wixUiCoreStrings.normal
import typings.wixUiCore.wixUiCoreStrings.rectangle
import typings.wixUiCore.wixUiCoreStrings.square
import typings.wixUiCore.wixUiCoreStrings.value
import typings.wixUiCore.wixUiCoreStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<wix-ui-core.wix-ui-core/dist/src/components/slider/Slider.SliderProps> */
trait PartialSliderProps extends StObject {
  
  var `aria-label`: js.UndefOr[String] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var `data-hook`: js.UndefOr[String] = js.undefined
  
  var dir: js.UndefOr[String] = js.undefined
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
  
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* x */ js.Any, Unit]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var orientation: js.UndefOr[horizontal | vertical] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  var stepType: js.UndefOr[value | count] = js.undefined
  
  var style: js.UndefOr[Style] = js.undefined
  
  var thumbShape: js.UndefOr[circle | square | rectangle | bar] = js.undefined
  
  var tickMarksPosition: js.UndefOr[normal | middle | across] = js.undefined
  
  var tickMarksShape: js.UndefOr[none | line | dot] = js.undefined
  
  var tooltipPosition: js.UndefOr[normal | across] = js.undefined
  
  var tooltipPrefix: js.UndefOr[String] = js.undefined
  
  var tooltipSuffix: js.UndefOr[String] = js.undefined
  
  var tooltipVisibility: js.UndefOr[none | always | hover] = js.undefined
  
  var trackSize: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object PartialSliderProps {
  
  inline def apply(): PartialSliderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSliderProps]
  }
  
  extension [Self <: PartialSliderProps](x: Self) {
    
    inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
    
    inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
    
    inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: /* x */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnFocus(value: () => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction0(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOrientation(value: horizontal | vertical): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepType(value: value | count): Self = StObject.set(x, "stepType", value.asInstanceOf[js.Any])
    
    inline def setStepTypeUndefined: Self = StObject.set(x, "stepType", js.undefined)
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setStyle(value: Style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setThumbShape(value: circle | square | rectangle | bar): Self = StObject.set(x, "thumbShape", value.asInstanceOf[js.Any])
    
    inline def setThumbShapeUndefined: Self = StObject.set(x, "thumbShape", js.undefined)
    
    inline def setTickMarksPosition(value: normal | middle | across): Self = StObject.set(x, "tickMarksPosition", value.asInstanceOf[js.Any])
    
    inline def setTickMarksPositionUndefined: Self = StObject.set(x, "tickMarksPosition", js.undefined)
    
    inline def setTickMarksShape(value: none | line | dot): Self = StObject.set(x, "tickMarksShape", value.asInstanceOf[js.Any])
    
    inline def setTickMarksShapeUndefined: Self = StObject.set(x, "tickMarksShape", js.undefined)
    
    inline def setTooltipPosition(value: normal | across): Self = StObject.set(x, "tooltipPosition", value.asInstanceOf[js.Any])
    
    inline def setTooltipPositionUndefined: Self = StObject.set(x, "tooltipPosition", js.undefined)
    
    inline def setTooltipPrefix(value: String): Self = StObject.set(x, "tooltipPrefix", value.asInstanceOf[js.Any])
    
    inline def setTooltipPrefixUndefined: Self = StObject.set(x, "tooltipPrefix", js.undefined)
    
    inline def setTooltipSuffix(value: String): Self = StObject.set(x, "tooltipSuffix", value.asInstanceOf[js.Any])
    
    inline def setTooltipSuffixUndefined: Self = StObject.set(x, "tooltipSuffix", js.undefined)
    
    inline def setTooltipVisibility(value: none | always | hover): Self = StObject.set(x, "tooltipVisibility", value.asInstanceOf[js.Any])
    
    inline def setTooltipVisibilityUndefined: Self = StObject.set(x, "tooltipVisibility", js.undefined)
    
    inline def setTrackSize(value: Double): Self = StObject.set(x, "trackSize", value.asInstanceOf[js.Any])
    
    inline def setTrackSizeUndefined: Self = StObject.set(x, "trackSize", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
